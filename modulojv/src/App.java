import java.util.Scanner;
public class App {
//    public static void main(String[] args){
//        // System.out.println("Hello, World!");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("división");
//        System.out.println("Ingresa dos numeros");
//        System.out.println("Divisor : ");
//        int Number1 = Integer.parseInt(sc.nextLine());
//        if (Number1 = 0) {
//            System.out.println("¡Error el 0 no puede ser divisor");
//        }
//        int N1 = Number1;
//        System.out.println("Dividendo : ");
//        int Number2 = Integer.parseInt(sc.nextLine());
//        int N2 = Number2;
//        long div = N2 / N1;
//        System.out.println("El resultado es : " + div);
//        sc.close();
//    }


    




    
public static void ejercicio2_2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Crea una contraseña :");
        String pass = (sc.nextLine());
        String pasbd = pass;
        System.out.println("Ingresa contraseña : ");
        String pasw = (sc.nextLine());
        if (pasw.equalsIgnoreCase(pasbd)) {
            System.out.println("Contraseña correcta");
        }else{
            System.out.println("Contraseña incorrecta");
        }
        sc.close();
    
    }
    
public static void ejercicio2_1(){
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Crea una contraseña :");
            String pass = (sc.nextLine());
            pass = pass.toLowerCase();
            String pasbd = pass;
            System.out.println("Ingresa contraseña : ");
            String pasw = (sc.nextLine());
            pasw = pasw.toLowerCase();
            if (pasw.equals(pasbd)) {
                System.out.println("Contraseña correcta");
            }else{
                System.out.println("Contraseña incorrecta");
            }
            sc.close();
    }
    
public static void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad : ");
        int edad = Integer.parseInt(sc.nextLine());
        if (edad > 17) {
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        sc.close();
    }
}
 

// funcion : recibe argumentos y regresa argumentos basados en lo recibido
// metodo: siempre regresa algo sin recibir nada
// procedimiento : recibe algo pero no regresa nada