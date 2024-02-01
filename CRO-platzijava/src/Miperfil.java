public class Miperfil {
    public static void main(String[] args) {
        String nombre = "Gustavo";
        int edad = 34;
        Double salarioDeseado = 20000.00;
        char genero = 'm';
        boolean buscandoTrabajo = false;


        System.out.println(
                "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nSalario deseado: " + salarioDeseado +
                "\nGenero: " + genero
//                "\nBuscando trabajo: "
        );
        System.out.println("Buscando trabajo: ");
        if (buscandoTrabajo == true){
            System.out.println("si actualmente estoy abierto a ofertas de trabajo");
        }else {
            System.out.println("actualmente no estoy abierto a ofertas de trabajo");
        }


    }
}
