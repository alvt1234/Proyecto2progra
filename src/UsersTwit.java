
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

        while (registro.getFilePointer() < registro.length()) {
            registro.readUTF();
            registro.readChar();
            String usuario = registro.readUTF();
            registro.readUTF(); 
            registro.readInt();
            System.out.println("aqui");

            if (user.trim().equals(usuario.trim())) {
                System.out.println("aquino");
                return true;
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
        try{
            new File("Usertwit/" + user + "/following.twc").createNewFile();
            new File("Usertwit/" + user + "/followers.twc").createNewFile();
            new File("Usertwit/" + user + "/twits.twc").createNewFile();
            }catch(IOException e){
            System.out.println("No se pudo crear");
            } 
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
     
     public boolean iniciosesion(String user, String contra) throws IOException{
      String usuario="";
      String password="";
         while(registro.getFilePointer() <registro.length()){
            registro.readUTF();
            registro.readChar();
             usuario=registro.readUTF();
             password=registro.readUTF();
            registro.readInt();
            if(user.equals(usuario) && contra.equals(password)){
                return true;
            }
         }
            if(!user.equals(usuario)){
               JOptionPane.showMessageDialog(null, "Usuario Inexistente"); 
            }
            if(!contra.equals(password)){
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
         return false;
     }


}
