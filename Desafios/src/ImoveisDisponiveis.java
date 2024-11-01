import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.nextLine(); // Lê a linha completa
        String array[] = frase.split("/"); // Divide a string em partes

        // Apresenta as partes de forma mais amigável
        for(int i = 0; i < array.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("Imovel: " + array[i]);
                    break;
                case 1:
                    System.out.print(" R$" + array[i]);
                    break;
                case 2:
                    System.out.print(" " + array[i]); // Exibe o último elemento
                    break;
                default:
                    break;
            }
        }

        leitor.close(); // Fecha o scanner
    }
}
