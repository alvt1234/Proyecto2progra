
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UsersTwit {
    private RandomAccessFile registro;
    private static String userlog;
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
            registro.readUTF();
            registro.readBoolean();
            if (user.equals(usuario)) {
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
     public void agguser(String nombre, char genero, String user, String contra, int edad,String fecha,boolean activa) throws IOException {
        if (!Existeuser(user)) {
                registro.seek(registro.length());
                registro.writeUTF(nombre);
                registro.writeChar(genero);
                registro.writeUTF(user);
                registro.writeUTF(contra);
                registro.writeInt(edad);
                registro.writeUTF(fecha);
                registro.writeBoolean(activa);
                carpetausers(user);
                System.out.println("agg user");
                userlog=user;
        }
    }
     
     public boolean iniciosesion(String user, String contra) throws IOException{
         while(registro.getFilePointer() < registro.length()){
            registro.readUTF();
            registro.readChar();
            String usuario=registro.readUTF();
            String password=registro.readUTF();
            registro.readInt();
            registro.readUTF();
            registro.readBoolean();
            if(user.equals(usuario.trim()) && contra.equals(password.trim())){
                userlog=user;
                return true;
            }
                
                 
         }
           JOptionPane.showMessageDialog(null, "Usuario inexistente");
         return false;
     }
  
  /*  public void fotoperfil(String user, File fotoperfil) throws IOException {
    // Obtener la ruta de la foto
    String rutafoto = fotoperfil.getAbsolutePath();

    // Crear un archivo separado para las fotos de perfil
    String rutaArchivoFoto = "Usertwit/" + user + "/foto.twc";
    try (RandomAccessFile archivoFotoPerfil = new RandomAccessFile(rutaArchivoFoto, "rw")) {
        archivoFotoPerfil.writeUTF(rutafoto);
    }
}
    public String enviarfoto(String user) throws IOException{
      String rutaArchivoFoto = "Usertwit/" + user + "/foto.twc";  
      RandomAccessFile archivoFotoPerfil = new RandomAccessFile(rutaArchivoFoto, "rw");
       String foto= archivoFotoPerfil.readUTF();
       return foto;
    }*/
 /*   public void guardarFotoPerfil(String user,byte[] imagenBytes) throws IOException {
        String rutaArchivoFoto = "Usertwit/" + user + "/foto.twc";  
        Path pathArchivo = Path.of(rutaArchivoFoto);
        Files.write(pathArchivo, imagenBytes);
    }

    public ImageIcon cargarFotoPerfil(String user,int ancho,int alto) throws IOException {
    String rutaArchivoFoto = "Usertwit/" + user + "/foto.twc";
    Path pathArchivo = Path.of(rutaArchivoFoto);
    byte[] bytes = Files.readAllBytes(pathArchivo);
    Image img = Toolkit.getDefaultToolkit().createImage(bytes);
    Image scaledImg = img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
    return new ImageIcon(scaledImg);
}*/

    public String getUserlog() {
        return userlog;
    }
    public boolean desaccuenta()throws IOException{
       while(registro.getFilePointer() < registro.length()){
            registro.readUTF();
            registro.readChar();
            String usuario=registro.readUTF();
            registro.readUTF();
            registro.readInt();
            registro.readUTF();
            registro.readBoolean();
            if(usuario.equals(userlog)){
                registro.writeBoolean(false);
                return true;
            }
                 
         } 
       return false;
    }
    
    
    public String[] obtenerUsuarios() throws IOException{
        ArrayList<String> usuarios = new ArrayList<>();
        registro.seek(0);

        while (registro.getFilePointer() < registro.length()){
            registro.readUTF(); 
            registro.readChar(); 
            String usuario = registro.readUTF(); 
            registro.readUTF(); 
            registro.readInt(); 
            registro.readUTF(); 
            registro.readBoolean(); 
            if(!usuario.equals(userlog))
            usuarios.add(usuario);
        }
        String[] usuariosArray = new String[usuarios.size()];
        usuariosArray = usuarios.toArray(usuariosArray);
        return usuariosArray;
    }

     public void guardarFotoPerfil(String rutaOrigen) throws IOException {
        String rutaDestino = "Usertwit/" + userlog + "/foto_perfil.png";
        
        Path origenPath = Path.of(rutaOrigen);
        Path destinoPath = Path.of(rutaDestino);

        Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
    }
     public ImageIcon cargarFotoPerfil(String user,int ancho,int largo) throws IOException {
    String rutaArchivoFoto = "Usertwit/" + user + "/foto_perfil.png";
    Path pathArchivo = Path.of(rutaArchivoFoto);
    
    if (Files.exists(pathArchivo)) {
        byte[] bytes = Files.readAllBytes(pathArchivo);
        Image img = Toolkit.getDefaultToolkit().createImage(bytes);
        Image scaledImg = img.getScaledInstance(ancho, largo, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImg);
    } else {
        ImageIcon image;
        image = new ImageIcon(getClass().getResource("/imagentwitter/usuario.jpg"));
        Image img = image.getImage();
        img = img.getScaledInstance(ancho,largo, Image.SCALE_SMOOTH);
       ImageIcon scaledIcon = new ImageIcon(img);
       return scaledIcon;
    }
}

     
}
