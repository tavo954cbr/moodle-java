import java.util.Scanner;

public class gato {
    Scanner sc = new Scanner(System.in);
    int tiros = 0;
    boolean ganador = false;
    char tiraJugador;
    char[][] tablero = new char[3][3];


    public void Main(String[] args) throws Exception {
        char j1 = 'X';
        char j2 = 'O';
        
        while(tiros<9 && !ganador){
            imprimirTablero();
            tiraJugador = tiros%2==0 ? j1 :j2;
            tiro(tiraJugador);
            tiros++;
        }
        System.out.println("Game Over");
    }


    private void imprimirTablero(){
        String strTablero = "";
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero.length; columna++) {
                strTablero+=tablero[fila][columna];
                if(columna!=2)
                    strTablero+="|";
            }
            strTablero+="\n";
            if(fila!=2)
                strTablero+="-----\n";
        }
        System.out.println(strTablero);
        }


    private void tiro(char jugador){
        int f,c;
        System.out.print("Ingresa la fila: ");
        f = Integer.parseInt(sc.nextLine());
        System.out.print("Ingresa la columna: "); 
        c = Integer.parseInt(sc.nextLine());
        tablero[f][c]=jugador;
        }
}
