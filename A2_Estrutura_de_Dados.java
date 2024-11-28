import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Criando a lista e adicionando os números [1, 2, 3, 4, 5]
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Lista inicial: " + lista);

        // Transferindo os números da lista para a pilha e removendo da lista para empilhar na pilha
        Stack<Integer> pilha = new Stack<>();
        while (!lista.isEmpty()) {
            pilha.push(lista.remove(0));
        }
        System.out.println("Após transferência da lista: " + pilha);

        // Transferindo os números da pilha para a fila e desempilhando da pilha e enfileirando na fila
        Queue<Integer> fila = new LinkedList<>();
        while (!pilha.isEmpty()) {
            fila.offer(pilha.pop());
        }
        System.out.println("Após transferência da pilha: " + fila);

        // Inserindo os números [6, 7, 8, 9, 10] na lista
        lista.addAll(Arrays.asList(6, 7, 8, 9, 10));
        System.out.println("Após inserção dos números [6, 7, 8, 9, 10]: " + lista);

        // Repetindo o processo
        pilha.clear();
        while (!lista.isEmpty()) {
            pilha.push(lista.remove(0));
        }
        System.out.println("Após transferência da lista: " + pilha);

        while (!pilha.isEmpty()) {
            fila.offer(pilha.pop());
        }
        System.out.println("Após transferência da pilha: " + fila);

        System.out.println("Números finais na fila: " + fila);
    }
}
