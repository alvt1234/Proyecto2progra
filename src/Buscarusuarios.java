
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;



/**
 *
 * @author villa
 */
public class Buscarusuarios {
 private UsersTwit users;
 private static String seguidos="Seguir";
 private RandomAccessFile siguiendo,seguidores;
    public Buscarusuarios(UsersTwit users) {
        this.users = users;
        try{
        siguiendo=new RandomAccessFile("Usertwit/" + users.getUserlog() + "/following.twc", "rw");
        
        initCode();
        }catch(IOException e){
                System.out.println("No se guardo seguidores");    
        }
    }
 
 public ArrayList<String> buscarUsuarios(String textoBusqueda) throws IOException {
    ArrayList<String> resultados = new ArrayList<>();

    try (RandomAccessFile registro = new RandomAccessFile("Usertwit/user.twc", "rw")) {
        while (registro.getFilePointer() < registro.length()) {
            registro.readUTF();
            registro.readChar();
            String usuario = registro.readUTF();
            registro.readUTF(); 
            registro.readInt();
            registro.readUTF();
            registro.readBoolean();

            if (usuario.contains(textoBusqueda)) {
                resultados.add(usuario);
            }
        }
    }

    return resultados;
}
    private void initCode() throws IOException {
        if (siguiendo.length() == 0) {
            //               0 bytes
            siguiendo.writeInt(1);
            //               4 bytes
        }
    }
    public void guardarsiguiendo(String user,String texto)throws IOException{
        //siguiendo   
           siguiendo.seek(0);
           int cantsiguiendo= siguiendo.readInt();
           siguiendo.seek(0);
           siguiendo.writeInt(cantsiguiendo+1); 
           siguiendo.writeUTF(user);
           siguiendo.writeUTF(texto);
       //seguidores otra persona 
           seguidores=new RandomAccessFile("Usertwit/" + user + "/followers.twc", "rw");
           if(seguidores.length() ==0){
               seguidores.writeInt(1);
           }
           seguidores.seek(0);
           int cantseguidor= seguidores.readInt();
           seguidores.seek(0);
           seguidores.writeInt(cantseguidor+1); 
           seguidores.writeUTF(users.getUserlog());
    }
 
    public int getsiguiendo() throws IOException{
    siguiendo.seek(0);
    int cantsiguiendo= siguiendo.readInt();
    return cantsiguiendo;
    }
   public boolean textoboton(String nombre) throws IOException {
    siguiendo.seek(0);

    while (siguiendo.getFilePointer() < siguiendo.length()) {
        int cantsiguiendo = siguiendo.readInt();
        String name = siguiendo.readUTF();
        String text = siguiendo.readUTF();

        if (nombre.equals(name) && text.equals("Siguiendo")) {
            return true;
        }

        // Avanzar el puntero a la posición siguiente
        for (int i = 0; i < cantsiguiendo - 1; i++) {
            siguiendo.readInt();
            siguiendo.readUTF();
            siguiendo.readUTF();
        }
    }
    
    return false;
}

    public void dejardeseguir(String user,String texto)throws IOException{
       siguiendo.seek(0);
       int cantsiguiente=siguiendo.readInt();
       siguiendo.writeInt(0);
       siguiendo.writeInt(cantsiguiente-1);
       siguiendo.readUTF();
       siguiendo.writeUTF(texto);
       
       seguidores=new RandomAccessFile("Usertwit/" + user + "/followers.twc", "rw");
       seguidores.seek(0);
       int cantseguidores=seguidores.readInt();
       seguidores.writeInt(cantseguidores-1);
       seguidores.readUTF();
       
    }

    public String getSeguidos() {
        return seguidos;
    }

    public void setSeguidos(String seguidos) {
        Buscarusuarios.seguidos = seguidos;
    }
    
 

}
