import java.util.ArrayList;

public class RecibeMascota {
    String nombredePerro;
    int edad;
    String raza;
    String tamanio;
    String nombredeDuenio;
    public RecibeMascota(String nombredePerro, int edad, String raza, String tamanio, String nombredeDuenio) {
        this.nombredePerro = nombredePerro;
        this.edad = edad;
        this.raza = raza;
        this.tamanio = tamanio;
        this.nombredeDuenio = nombredeDuenio;
    }
    
    public static void main(String[] args) {
        ArrayList<RecibeMascota> clientes = new ArrayList<>();
        RecibeMascota mascota1 = new RecibeMascota(null, 0, null, null, null);
            clientes.add(mascota1);
            System.out.println("Perros actuales en la estética : " + clientes.size());

    }
}
