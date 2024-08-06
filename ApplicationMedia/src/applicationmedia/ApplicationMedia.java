
package applicationmedia;

import java.util.Scanner;

public class ApplicationMedia {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        double nota1, nota2, nota3, nota4, media;
        System.out.println("Digite o nome do Aluno");
        nome = ler.nextLine();
        System.out.println("Digite Nota 1: ");
        nota1 = ler.nextDouble();
        System.out.println("Digite Nota 2: ");
        nota2 = ler.nextDouble();
        System.out.println("Digite Nota 3: ");
        nota3 = ler.nextDouble();
        System.out.println("Digite Nota 4: ");
        nota4 = ler.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Nome do Aluno: " + nome);
        System.out.printf("Nota 1 = %.2f %n", nota1);
        System.out.printf("Nota 2 = %.2f %n", nota2);
        System.out.printf("Nota 3 = %.2f %n", nota3);
        System.out.printf("Média = %.2f %n", media);
        ler.close();
    }
    
}
