package genericos;

public class ListaGenerica <T> {
    private Object[] elementos;
    private int numElementos;
    private static final int CAPACIDAD_INICIAL = 5;

    public ListaGenerica() {
        elementos = new Object[CAPACIDAD_INICIAL];
    }

    public void add(T elemento) {
        ensureCapacity();
        elementos[numElementos] = elemento;
        numElementos++;
    }

    public void remove(int index) {
        if (index < 0 || index >= numElementos) {
            System.out.println("Indice no valido");
            return;
        }

        for (int i = index; i < numElementos; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[--numElementos] = null;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= numElementos) {
            System.out.println("Indice no valido");
            return null;
        }
        return (T) elementos[index];
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
