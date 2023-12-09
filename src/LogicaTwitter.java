
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogicaTwitter {

    UsersTwit user=new UsersTwit();
    ArrayList<String[]> cargartwits=new ArrayList<>();
    private RandomAccessFile tweets,fotoarchivo,registro;
    private Image fotoperfil;
    public LogicaTwitter(){
        try {
            tweets = new RandomAccessFile("Usertwit/" + user.getUserlog() + "/twits.twc", "rw");
            fotoarchivo = new RandomAccessFile("Usertwit/user.twc", "rw");
            registro = new RandomAccessFile( "Usertwit/hashtags.txt","rw");
        } catch (IOException e) {
            System.out.println("NO SE ENCONTRO");
        }
    }
   
     public void guardarTwit(String txt) throws IOException {
        tweets.seek(tweets.length());
        Date fechaActual = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    // Formatear la fecha como una cadena
    String fechaString = dateFormat.format(fechaActual);
        try {
            // Convierte la cadena a un objeto Date
            Date fechaDate = dateFormat.parse(fechaString);

            // Obtiene el valor long de la fecha
            long valorLong = fechaDate.getTime();

            // Imprime el valor long
            System.out.println("Valor long de la fecha: " + valorLong);
            tweets.writeUTF(user.getUserlog());
            tweets.writeUTF(txt);
            tweets.writeLong(valorLong);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
   
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
       
        return twits;
    }
     
     public List<String> extraerHashtags(String texto) throws IOException{
        List<String> hashtags = new ArrayList<>();
        String[] palabras = texto.split("\\s+"); // Dividir el texto en palabras usando espacios como separadores

        registro.seek(0);
        while(registro.getFilePointer()<registro.length()){
            String hash=registro.readUTF();
            if (hash.startsWith("#")) {
                hashtags.add(hash); 
                System.out.println("Hashtags: "+hashtags);
            }
        }
        return hashtags;
    }
    
 
    public static void guardarHashtagsEnArchivo(List<String> hashtags) throws IOException {
        try (RandomAccessFile registro = new RandomAccessFile( "Usertwit/hashtags.txt","rw")) {
            for (String hashtag : hashtags) {
                registro.writeUTF(hashtag);
            }
        }
    }
}
