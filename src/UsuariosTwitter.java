
public class UsuariosTwitter {
    
  private String nombre;
  private char genero;
  private String username;
  private String contra;
  private int edad;
  private boolean activa;

    public UsuariosTwitter(String nombre, char genero, String username, String contra, int edad, boolean activa) {
        this.nombre = nombre;
        this.genero = genero;
        this.username = username;
        this.contra = contra;
        this.edad = edad;
        this.activa = activa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
  
  
}
