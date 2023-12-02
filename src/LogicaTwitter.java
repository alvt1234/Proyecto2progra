
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class LogicaTwitter {

    public void guardarFotoDePerfil(File selectedFile) {
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
    }
}
