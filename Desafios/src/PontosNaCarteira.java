// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class PontosNaCarteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual velocidade o motorista estava?");
        int velocidade = leitor.nextInt();

        System.out.println("Quantas multas o motorista já tem?");
        int multas = leitor.nextInt();

        if(velocidade>80){
            multas++;
            System.out.print(multas + " multas.");
            if(multas>=3){
                System.out.println(" Levou pontos na carteira");
            }else{
                System.out.println(" Nao levou pontos na carteira");
            }
        }else{
            System.out.println(multas + " multas. Nao levou pontos na carteira");
        }

        leitor.close();
    }
}