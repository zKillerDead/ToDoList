import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {

    private ArrayList<String> tarefas;

    public ListaDeTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa);
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            System.out.println("Lista de Tarefas:");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            System.out.println("Tarefa removida: " + tarefas.remove(indice));
        } else {
            System.out.println("Esta tarefa nao existe.");
        }
    }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        Scanner scanner = new Scanner(System.in);
        boolean emExecucao = true;

        while (emExecucao) {
            System.out.println("\nLista de Tarefas:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Mostrar1 tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a nova tarefa: ");
                    String tarefa = scanner.nextLine();
                    listaDeTarefas.adicionarTarefa(tarefa);
                    break;
                case 2:
                    listaDeTarefas.listarTarefas();
                    break;
                case 3:
                    listaDeTarefas.listarTarefas();
                    System.out.print("Digite o numero que deseja remover");
                    int indice = scanner.nextInt() - 1;
                    listaDeTarefas.removerTarefa(indice);
                    break;
                case 4:
                    emExecucao = false;
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
                    break;
            }
        }

        scanner.close();
    }
}
