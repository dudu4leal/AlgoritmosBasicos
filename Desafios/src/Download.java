 import java.util.Scanner; 
    
public class Download{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho= leitor.nextInt();
        
        for(int i=1; i<=tamanho; i++)  {
            System.out.print("/");
        }

        leitor.close();

    }
}