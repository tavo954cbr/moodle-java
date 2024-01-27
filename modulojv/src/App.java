import java.util.Scanner;
public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");
    }


    




    
public static void ejercicio2_2(String[] arg){Scanner sc = new Scanner(System.in);
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
    
public static void ejercicio2_1(String[] arg){
        
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
    
public static void ejercicio1(String[] arg){
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
 

