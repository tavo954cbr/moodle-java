public class Sentencias {
    public static void main(String[] args) {
        int n = 15;
        int contador = 1; 
        
        System.out.println("Los primeros " + n + " números impares positivos son:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(contador + " ");
            contador += 2;
            }

            /* int n = 15;
            int primero = 0;
            int segundo = 1;
            
            System.out.println("Los primeros " + n + " elementos de la Serie de Fibonacci son:");
            
            
            System.out.print(primero + " " + segundo + " ");
            
            
            for (int i = 2; i < n; i++) {
                int siguiente = primero + segundo;
                System.out.print(siguiente + " ");
                primero = segundo;
                segundo = siguiente;
            } */
    }
}
