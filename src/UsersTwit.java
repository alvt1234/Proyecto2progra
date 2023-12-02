
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;


public class UsersTwit {
    private RandomAccessFile registro;
    public UsersTwit(){
    try{
    File file=new File("Usertwit");
    file.mkdirs();
    registro=new RandomAccessFile("Usertwit/user.twc","rw");
    }catch(IOException e){
        System.out.println("Erros");
    }
    }
   public boolean Existeuser(String user) throws IOException {
    registro.seek(0);
    while (registro.getFilePointer() < registro.length()) {
        try {
            registro.readUTF(); // Reading the first string
            registro.readChar();
            String usuario = registro.readUTF(); // Reading the second string
            registro.readUTF();
            System.out.println("aqui");
            System.out.println("user: "+user+"usuario"+usuario);
            if (user.equals(usuario)) {
                System.out.println("aquino");
                JOptionPane.showMessageDialog(null, "USUARIO YA EXISTENTE");
                return true;
            }
        } catch (EOFException e) {
            break; 
        }
    }
    return false;
}

    
    private String carpetauser(String user){
        return"Usertwit/"+user;
    }
    private void carpetausers(String user) throws IOException{
       File file=new File(carpetauser(user));
        file.mkdirs();
      /*  try{
            new File("Usertwit/" + user + "/following.twc").createNewFile();
            new File("Usertwit/" + user + "/followers.twc").createNewFile();
            new File("Usertwit/" + user + "/twits.twc").createNewFile();
            }catch(IOException e){
            System.out.println("No se pudo crear");
            } */
    }
     public void agguser(String nombre, char genero, String user, String contra, int edad) throws IOException {
        if (!Existeuser(user)) {
                registro.seek(registro.length());
                registro.writeUTF(nombre);
                registro.writeChar(genero);
                registro.writeUTF(user);
                registro.writeUTF(contra);
                registro.writeInt(edad);
                carpetausers(user);
                System.out.println("agg user");
            
        }
    }

    private void cerrarArchivo() {
        try {
            if (registro != null) {
                registro.close();
            }
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }

}
