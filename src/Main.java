import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nSELECIONE UM EXERCÍCIO:\n" +
                    "[1] IMPRIMIR SOMA\n" +
                    "[2] SEQUÊNCIA DE FIBONACCI\n" +
                    "[3] IMPRIMIR SEQUÊNCIAS\n" +
                    "[4] RESPOSTA INTERRUPTORES\n" +
                    "[5] INVERTER STRING\n" +
                    "[0] SAIR");
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }
            if (userInput == 1) {
                Teste01 ex1 = new Teste01();
                System.out.println("==EXERCÍCIO 01==");
                System.out.printf("A SOMA SERÁ %d\n", ex1.solucao01());
            } else if (userInput == 2) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("==EXERCÍCIO 02==");
                System.out.println("DIGITE UM NÚMERO: ");
                int inputEx2 = scanner2.nextInt();
                Teste02 ex2 = new Teste02(inputEx2);
                System.out.println(ex2.checkFibonacci());
            } else if (userInput == 3) {
                Teste03 ex3 = new Teste03();
                System.out.println(ex3.a());
                System.out.println(ex3.b());
                System.out.println(ex3.c());
                System.out.println(ex3.d());
                System.out.println(ex3.e());
                System.out.println(ex3.f());
            } else if (userInput == 4) {
                System.out.println("==EXERCÍCIO 04==");
                System.out.println("EXERCÍCIO 4: **RESPOSTA NO README**\n");
            } else if (userInput == 5) {
                Scanner scanner5 = new Scanner(System.in);
                System.out.println("==EXERCÍCIO 05==");
                System.out.println("DIGITE UMA STRING QUALQUER");
                String inputEx5 = scanner5.nextLine();
                Teste05 ex5 = new Teste05(inputEx5);
                System.out.printf("%s", ex5.getReverseString());
            } else {
                System.out.println("OPÇÃO INVÁLIDA!");
            }
        }
        System.out.println("ENCERRADO.");
    }
}
