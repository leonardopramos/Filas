public class TestaFila {
    
    public static void main(String[] args) {
        
        Fila fl = new Fila();

        fl.adicionar(12);
        fl.adicionar(15);
        System.out.println("Adicionou 2 elementos: "+fl);
        fl.remover();
        System.out.println("Removeu o primeiro" + fl);
        fl.adicionar(770);
        System.out.println("Adicionou um elemento" + fl);
        fl.remover();
        System.out.println("Removeu o primeiro" + fl);
    }
}
