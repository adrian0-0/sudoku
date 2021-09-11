import java.util.Scanner;
import java.security.SecureRandom;
public class Main {

    public static void main(String[] args) {
        System.out.println(Color.ANSI_PURPLE + "Hello Sudoku!" + Color.ANSI_RESET);
        Scanner input = new Scanner(System.in);
        final int linhas = 3;
        final int colunas = 3;
        int[][] numeros=new int[linhas][colunas];  
        
        for (int l=0; l<linhas; l++) {
        	for (int c = 0; c<colunas; c++) {
        		numeros[l][c]= new SecureRandom().nextInt(9);
        		System.out.printf("%2d |", numeros[l][c]);
        	}
        	System.out.printf("%n");
        }
    }
}
