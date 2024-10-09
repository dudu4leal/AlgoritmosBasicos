import java.util.Scanner; 
    
public class Mesada{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        
        int valorFinal = entrada*mesada;
        
        System.out.println ("Voce tera " + valorFinal + " reais");

        leitor.close();
        
    }
}