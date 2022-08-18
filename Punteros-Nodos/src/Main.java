
public class Main {

    public static void main(String[] args) {
        Nodo primer = new Nodo("PrimerNodo");
        Nodo segundo = new Nodo(45);
        Nodo tercer = new Nodo("Ultimo valor al nodo ingresado ingresado");
        primer.enlazarSiguiente(segundo);
        primer.obtenerSiguiente().enlazarSiguiente(tercer);
        System.out.println(primer.obtenerSiguiente().obtenerSiguiente().obtenerValor().toString());
        //Segunda prueba
        System.out.println("\nSegunda Prueba\nLista Enlazada\n");
        ListaEnlazada lista = new ListaEnlazada();
        System.out.println("Esta vacia: "+ lista.estaVacia());
        
        lista.addPrimero("Alex");
        lista.addPrimero(20);
        lista.addPrimero("Hello World");
        lista.addPrimero(3.14);
        
        System.out.println("Primer Elemento: "+ lista.obtener(0));
        System.out.println("Ultimo: "+ lista.obtener(lista.size()-1));
        System.out.println("Index 2: "+ lista.obtener(2));
        
        System.out.println("Esta vacia: "+ lista.estaVacia());
        System.out.println("Tamanio: "+ lista.size());
        
    }
}
