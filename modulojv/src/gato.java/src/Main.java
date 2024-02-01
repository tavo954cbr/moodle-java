//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char [][] tablero = {
                {' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '}
        };
        imprimirtablero(tablero);
    }

    private static void imprimirtablero(char[][] tablero){
        String strTablero = "";
        for (int i = 0; i < tablero.length ; i++) {
            for (int j = 0; j < tablero.length; j++) {
                strTablero += tablero[i][j];
                if (j != 2)
                    strTablero+= "|";
                
            }
            strTablero+= "\n";
            if (1!= 2)
                strTablero+= "-----\n";
        }
        System.out.println(strTablero);
    }
}