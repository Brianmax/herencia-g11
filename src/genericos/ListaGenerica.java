package genericos;

public class ListaGenerica <T> {
    private Object[] elementos;
    private int numElementos;
    private static final int CAPACIDAD_INICIAL = 10;

    public ListaGenerica() {
        elementos = new Object[CAPACIDAD_INICIAL];
    }

    public void add(T elemento) {
        ensureCapacity();
        elementos[numElementos] = elemento;
        numElementos++;
    }

    public void remove(int index) {
        //
    }

    private void ensureCapacity() {
        if (numElementos == elementos.length) {
            Object[] nuevosElementos = new Object[numElementos * 2];

            for (int i = 0; i < numElementos; i++) {
                nuevosElementos[i] = elementos[i];
            }
            elementos = nuevosElementos;
        }
    }

}
