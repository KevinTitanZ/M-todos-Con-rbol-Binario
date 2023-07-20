package ArbolBinario;

public class Nodo {

	private Object dato;
    private Nodo hijoIzquierdo;
    private Nodo hijoDerecho;
    
    public Nodo(Object dato) {
        this.dato = dato;
        hijoIzquierdo = null;
        hijoDerecho = null;
    }
    
    public Object getDato() {
        return dato;
    }
    
    public void setDato(Object dato) {
        this.dato = dato;
    }
    
    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }
    
    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }
    
    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }
    
    public void setHijoDerecho(Nodo hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
}
