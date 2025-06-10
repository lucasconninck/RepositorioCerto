class No {
    char valor;
    No esquerda, direita;

    No(char valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}

public class ArvoreBinaria {

    public static void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.esquerda);
            posOrdem(no.direita);
            System.out.print(no.valor + " ");
        }
    }

    public static void main(String[] args) {
        No raiz = new No('A');
        raiz.esquerda = new No('B');
        raiz.direita = new No('C');
        raiz.esquerda.esquerda = new No('D');
        raiz.esquerda.direita = new No('E');
        raiz.direita.direita = new No('F');

        System.out.print("Percurso pós-ordem: ");
        posOrdem(raiz);
    }
}

