
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class LogicaTwitter {

    UsersTwit user=new UsersTwit();
    ArrayList<String[]> cargartwits=new ArrayList<>();
    private RandomAccessFile tweets,fotoarchivo;
    private Image fotoperfil;
    public LogicaTwitter(){
        try {
            tweets = new RandomAccessFile("Usertwit/" + user.getUserlog() + "/twits.twc", "rw");
            fotoarchivo = new RandomAccessFile("Usertwit/user.twc", "rw");
        } catch (IOException e) {
            System.out.println("NO SE ENCONTRO");
        }
    }
   /* public void guardarFotoDePerfil(File selectedFile) {
        try {

            String userHome = System.getProperty("user.home");

            String profileFolderPath = userHome + File.separator + "FotosDePerfil";

            Files.createDirectories(Paths.get(profileFolderPath));

            String destinationPath = profileFolderPath + File.separator + selectedFile.getName();

            Files.copy(selectedFile.toPath(), Paths.get(destinationPath), StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Foto de perfil guardada con éxito en: " + destinationPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
   
     public void guardarTwit(String txt) throws IOException {
        tweets.seek(tweets.length());

        tweets.writeUTF(user.getUserlog());
        tweets.writeUTF(txt);
        tweets.writeLong(Calendar.getInstance().getTimeInMillis());

    }
   /* public void almacenartweets(String texto) throws IOException{
        String usuario=user.getUserlog();
        
        try (RandomAccessFile archivoTwits = new RandomAccessFile("Usertwit/" + usuario + "/twits.twc", "rw")) {
            Date fechaActual = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaEntrada = dateFormat.format(fechaActual);
          //  SimpleDateFormat formatoFecha = new SimpleDateFormat("");
           //  String fecha=String.valueOf(dateFormat);
          //   Tweets twee=new Tweets(usuario, texto, fecha);
            // String tweet=usuario+": "+texto+" - "+fecha;
             archivoTwits.writeUTF(texto);
             archivoTwits.writeLong(Calendar.getInstance().getTimeInMillis());
        }catch(IOException e){
            System.out.println("No se pudo subir el tweet");
        }
    }*/
    public ArrayList<String[]> misTwits() throws IOException {
        ArrayList<String[]> mensajes = new ArrayList<>();
        tweets.seek(0);

        while (tweets.getFilePointer() < tweets.length()) {
            String[] temp = new String[3];
            temp[0] = tweets.readUTF();
            temp[1] = tweets.readUTF();
            temp[2] = tweets.readLong() + "";
            mensajes.add(temp);
        }

        return mensajes;
    }
    public ArrayList<String[]> cargarTwits() throws IOException{
        ArrayList<String[]> twits = new ArrayList<>();

        // Carga los propios twits
        if (misTwits() != null) {
            twits.addAll(misTwits());
        }
        // Ordena los twits del más antiguo al más reciente por la marca de tiempo
        for (int i = 0; i < twits.size(); i++) {
            for (int j = 0; j < twits.size() - i - 1; j++) {
                if (Long.parseLong(twits.get(i)[2]) > Long.parseLong(twits.get(i + 1)[2])) {
                    String[] temp = twits.get(i + 1);
                    twits.set(i + 1, twits.get(i));
                    twits.set(i, temp);
                }
            }
        }
        return twits;
    }
}
