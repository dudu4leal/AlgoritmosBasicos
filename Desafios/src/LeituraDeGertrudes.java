   import java.util.Scanner; 
    
public class LeituraDeGertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        int dias = paginas/paginasLidas;

        System.out.println(dias + " dias");

        leitor.close();
    }
}