
package practicaarbol;

public class NodoArbol {
    int dato;
    NodoArbol hijoizq;
    NodoArbol hijoder;
    
    NodoArbol(int d){
        this.dato = d;
        this.hijoizq = null;
        this.hijoder = null;
        
    }
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoArbol getIzq() {
        return hijoizq;
    }

    public void setIzq(NodoArbol izq) {
        this.hijoizq = izq;
    }

    public NodoArbol getDer() {
        return hijoder;
    }

    public void setDer(NodoArbol der) {
        this.hijoder = der;
    }
}

    