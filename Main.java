class No {
    int dado;
    No proximo;

    public No(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}
public class PILHA {
    private No topo;

    public PILHA() {
        topo = null;
    }
    public void push(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = topo;
        topo = novoNo;
    }
    public int pop() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia!");
        }
        int valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }
    public int peek() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia!");
        }
        return topo.dado;
    }
    public boolean estaVazia() {
        return topo == null;
    }
    public int contarNos() {
        int contador = 0;
        No atual = topo;
        while (atual != null) {
            contador++;
            atual = atual.proximo;
        }
        return contador;
    }
    public void mostrar() {
        No atual = topo;
        System.out.print("Topo -> ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PILHA pilha = new PILHA();

        pilha.push(7);
        pilha.push(14);
        pilha.push(21);

        pilha.mostrar();
        System.out.println("Nós na pilha: " + pilha.contarNos()); // 3

        pilha.pop();
        pilha.mostrar();
        System.out.println("Nós na pilha: " + pilha.contarNos()); // 2
    }
}
