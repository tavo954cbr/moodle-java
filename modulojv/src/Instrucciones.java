import java.util.Scanner;

public class Instrucciones {
    public static void main(String[] args) {
        Scanner semana = new Scanner(System.in);
        int dia;
        System.out.print("Introduce un número del 1 al 7 para conocer el día de la semana : ");
        dia  = Integer.parseInt(semana.nextLine());
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        
            default:
                System.out.println("Numero no válido");
        }
        semana.close();
    }
    
}
