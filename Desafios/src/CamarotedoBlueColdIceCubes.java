
import java.util.Scanner; 
    
public class CamarotedoBlueColdIceCubes {
    public
     static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        int valor;
        
        int[] vetor = new int[tamanhoDaFila];


        for(int i=0; i<tamanhoDaFila; i++){
            valor = i+1;
            vetor[i]=valor;
        }


        for(int i=0; i<tamanhoDaFila; i++){
            if(vetor[i]%2 != 0){
                pessoasNoCamarote++;
            }
        }


        System.out.println(pessoasNoCamarote + " pessoas no camarote");


        leitor.close();

    }
}