import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int qtd=0,aux=0;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite o tamanho do vetor");
        qtd = sc.nextInt();
        //MONTA O VETOR
        int v[] = new int[qtd];
        for(int i = 0; i < qtd; i++){
            System.out.print("Digite o valor "+i+" :");
            v[i] = sc.nextInt();
        }
        sc.close();
        //IMPRIME O VALORES DO VETOR DIGITADO ORIGINALMENTE
        System.out.println("Os numeros do vetor digitado são:");
        for(int i = 0; i < qtd; i++){
            System.out.print(v[i]+" ");
        }
        // ORDENA OS VALORES
        for(int i = 0; i < qtd; i++){
           for(int j = i+1; j < qtd; j++){
               if(v[i] > v[j]){
                   aux = v[i];
                   v[i] = v[j];
                   v[j] = aux;
               }
           }
        }
        // IMPRIME OS VALORES DO VETOR ORDENADOS
        System.out.println("\n Os numeros do vetor ordenado são:");
        for(int i = 0; i < qtd; i++){
            System.out.print(v[i]+" ");
        } 
    }
}
