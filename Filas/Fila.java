public class Fila{

    private Nodo inicio;
    private Nodo fim;
    private int quantidade;

    public void adicionar(int e){

        Nodo novoNodo = new Nodo(e);
        this.quantidade++;

        if(this.inicio == null){
            this.inicio = novoNodo;
            this.fim = novoNodo;
        } else {
            Nodo antigoFim = this.fim;
            antigoFim.proximo = novoNodo;
            this.fim = novoNodo;
        }
        
    }
    public void remover(){
        if(this.inicio != null){
            this.inicio = this.inicio.proximo;
            this.quantidade--;
        }
    }
    public boolean estaVazia(){
        if(quantidade == 0){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        String aux = "[ ";
        Nodo paux = inicio;
        while (paux != null) {
            aux = aux + paux.elemento + " ";
            paux = paux.proximo; // avanca para proximo novo
        }
        aux += "]";
        return aux;
    }
}