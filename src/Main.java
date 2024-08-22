import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nFilas,nColumnas;
        int matriz[][];
        System.out.print("Digite el numero de Filas: ");
        nFilas = entrada.nextInt();
        System.out.print("Digite el numero de Columnas: ");
        nColumnas = entrada.nextInt();
        matriz = new int[nFilas][nColumnas];
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                if (i == j){
                    matriz[i][j] = 1;
                }else {
                    matriz[i][j] = 0;
                }
            }
        }
        //Imprimimos la matriz
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}