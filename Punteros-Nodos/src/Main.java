
public class Main {

    public static void main(String[] args) {
//        Nodo primer = new Nodo("PrimerNodo");
//        Nodo segundo = new Nodo(45);
//        Nodo tercer = new Nodo("Ultimo valor al nodo ingresado ingresado");
//        primer.enlazarSiguiente(segundo);
//        primer.obtenerSiguiente().enlazarSiguiente(tercer);
//        System.out.println(primer.obtenerSiguiente().obtenerSiguiente().obtenerValor().toString());

        //Segunda prueba
        System.out.println("\nLista Enlazada\n");
        ListaEnlazada lista = new ListaEnlazada();

        lista.addPrimero(6);
        lista.addPrimero(5);
        lista.addPrimero(4);
        lista.addPrimero(3);
        lista.addPrimero(2);
        lista.addPrimero(1);

        lista.cortar(3);

        System.out.println("Primer Elemento: " + lista.obtener(0));
        System.out.println("Ultimo: " + lista.obtener(lista.size() - 1));

        System.out.println("Tamanio: " + lista.size());

    }
}
