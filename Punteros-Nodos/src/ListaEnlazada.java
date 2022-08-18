
public class ListaEnlazada {

    Nodo cabeza;
    int size;

    public ListaEnlazada() {
        cabeza = null;
        size = 0;
    }

    public Object obtener(int index) 
    {
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < index) {
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }

    public void addPrimero(Object obj) {
        if (cabeza == null) 
        {
            cabeza = new Nodo(obj);
        } else 
        {
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;
        }
        size++;
    }
    public int size(){
        return size;
    }

    public boolean estaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }
}