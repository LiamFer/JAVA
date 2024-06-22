package Intro;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylists {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > matrix = new ArrayList<>();
        Integer sum = 0;
        Scanner sc = new Scanner(System.in);

        // Definindo o tamanho da Matrix de acordo com os Inputs do user
        System.out.println("Quantas linhas você quer ter nessa Matriz?");
        int rows = sc.nextInt();
        System.out.println("E quantos valores cada linha vai ter nessa Matriz?");
        int cols = sc.nextInt();

        // Criando uma Matrix
        for(int i = 0;i < rows;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0;j < cols;j++){
                System.out.print("Digite o número que deseja inserir na linha %d na posição %d da sua Matriz:".formatted(i+1,j+1));
                row.add(sc.nextInt());
            }
            matrix.add(row);
        }

        // Inicializando o Max e Min com o primeiro valor da Matrix
        Integer max = matrix.get(0).get(0);
        Integer min = matrix.get(0).get(0);

        // Calculando a soma de todos os valores dentro da Matrix e descobrindo o Valor Máximo e Mínimo
        for(int i = 0;i < matrix.size();i++){
            for(int k = 0;k<matrix.get(i).size();k++){
                ArrayList<Integer> row = matrix.get(i);
                Integer val = row.get(k);
                // Calculando a soma
                sum += val;
                // Pegando o menor valor
                if (val < min){
                    min = val;
                }
                // Pegando o maior valor
                if (val > max){
                    max = val;
                }
            }
        }

        // Mostrando os valores
        System.out.println(matrix);
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
    }
}
