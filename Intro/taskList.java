package Intro;
import java.util.ArrayList;
import java.util.Scanner;

public class taskList {
    public static void main(String[] args) {
        program();
    }

    static void program(){
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;
        do {
            // Lista de opções do menu
            System.out.println("1. Adicionar Tarefa\n" +
                    "2. Remover Tarefa\n" +
                    "3. Listar Tarefas\n" +
                    "4. Sair");
            System.out.println("Escolha uma opção: ");
            switch(sc.nextInt()){
                case 1: addTask(tasks);break;
                case 2: removeTask(tasks);break;
                case 3: showTasks(tasks);break;
                case 4: keepGoing = false;break;
                default: System.out.println("Digite uma Opção Válida!"); break;
            }
        } while (keepGoing);
    }

    static void showTasks(ArrayList<String> tasks){
        if(tasks.isEmpty()){
            System.out.println("Não temos nenhuma Task na lista!");
        } else {
            for (String task : tasks) {
                System.out.println(task);
            }
        }
    }

    static void addTask(ArrayList<String> tasks){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a tarefa: ");
        int size = tasks.size() + 1;
        String tarefa = sc.nextLine();
        tasks.add(size+" - "+tarefa);
    }

    static void removeTask(ArrayList<String> tasks){
        if(!tasks.isEmpty()){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o indice da tarefa que deseja remover: ");
            int index = sc.nextInt();
            tasks.remove(index-1);
        } else {
            System.out.println("Não é possivel excluir uma tarefa pois nenhuma tarefa foi adicionada!");
        }
    }

}


//Exercício: Gerenciamento de Lista de Tarefas
//        Descrição
//Você deve criar um programa em Java que faça o seguinte:
//
//Gerencie uma lista de tarefas.
//Utilize métodos para adicionar, remover e listar as tarefas.
//Utilize um loop For Each para exibir todas as tarefas.
//Funcionalidades
//Adicionar Tarefa:
//Crie um método que permita ao usuário adicionar uma nova tarefa à lista.
//Remover Tarefa:
//Crie um método que permita ao usuário remover uma tarefa da lista pelo seu índice.
//Listar Tarefas:
//Crie um método que exiba todas as tarefas na lista usando um loop For Each.