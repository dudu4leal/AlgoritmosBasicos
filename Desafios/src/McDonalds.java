
import java.util.Scanner; 
    
public class McDonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = ingredientes.split(";");
        
        for(int i=0; i<4; i++){
            switch (i) {
                case 0:
                    System.out.println(listaIngredientes[i]);
                    break;
                case 1:
                    System.out.println(listaIngredientes[i]);
                    break;
                case 2:
                    System.out.println(listaIngredientes[i]);
                    break;
                case 3:
                    System.out.println(listaIngredientes[i]);
                    break;
                default:
                    break;
            }
        }

    }
}