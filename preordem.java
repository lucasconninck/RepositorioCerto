class No {
    String valor;
    No esquerda, direita;

    No(String valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}

public class ArvoreBinaria {

    static void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }

    public static void main(String[] args) {
        No raiz = new No("A");
        raiz.esquerda = new No("B");
        raiz.direita = new No("C");
        raiz.esquerda.esquerda = new No("D");
        raiz.esquerda.direita = new No("E");
        raiz.direita.direita = new No("F");
        System.out.print("Pré-ordem: ");
        preOrdem(raiz);
    }
}



