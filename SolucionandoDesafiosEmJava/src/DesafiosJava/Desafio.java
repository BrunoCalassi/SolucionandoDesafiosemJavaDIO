package DesafiosJava;
import java.io.IOException;
import java.util.Scanner;
/*Leia quatro valores inteiros A, B, C e D. A seguir,
calcule e mostre a diferença do produto de A e B pelo produto de C e D
segundo a fórmula: DIFERENCA = (A * B - C * D).
Entrada
O arquivo de entrada contém 4 valores inteiros.
Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas,
conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
DIFERENCA = -26 */
public class Desafio {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        //complete o codigo
        System.out.println("DIFERENCA = " +(a*b-c*d));
    }

}