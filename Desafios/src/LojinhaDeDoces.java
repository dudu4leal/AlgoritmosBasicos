
import java.util.Scanner; 
    
public class LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        
        System.out.println("O cliente obteve " + dinheiro*2 + " doces");

        leitor.close();

    }
}