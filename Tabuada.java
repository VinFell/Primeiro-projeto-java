//Desenvolvido por Vinicius Fellipe Silva
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
    int n = 0;
    String valorLido = "";
    Scanner Lerteclado = new Scanner(System.in);

    System.out.print("Programa que exibe a tabuada de um número");
    System.out.println("");
    System.out.print("Informe um número: ");
    valorLido = Lerteclado.nextLine();
    n = Integer.parseInt(valorLido);
    System.out.println(n+" x 1 = " + (n*1));
    System.out.println(n+" x 2 = " + (n*2));
    System.out.println(n+" x 3 = " + (n*3));
    System.out.println(n+" x 4 = " + (n*4));
    System.out.println(n+" x 5 = " + (n*5));
    System.out.println(n+" x 6 = " + (n*6));
    System.out.println(n+" x 7 = " + (n*7));
    System.out.println(n+" x 8 = " + (n*8));
    System.out.println(n+" x 9 = " + (n*9));
    System.out.println(n+" x 10 = " + (n*10));
    Lerteclado.close();
    }
}
