
package practicaarbol;


public class Arbol {
    
    int alt;
    
    NodoArbol raiz;
    Arbol(){
        raiz=null;
    }
    
    public void AgregarNodo(int d){
        NodoArbol NuevoNodo = new NodoArbol(d);
        
        
        if(raiz == null){
            raiz = NuevoNodo;
        }
        else{
            NodoArbol aux = raiz;
            NodoArbol padre=null;
            while(true){
                padre = aux;
                if(d<aux.dato){
                    aux = aux.hijoizq;
                    if(aux==null){
                        padre.hijoizq = NuevoNodo;
                        return;
                    }
                }
                else{
                    aux = aux.hijoder;
                    if (aux == null){
                        padre.hijoder = NuevoNodo;
                        return;
                    }
                }
            }
        }
    }    
    
    public void preorden(NodoArbol print){
        if(print != null){
            System.out.println(print.dato);
            preorden(print.hijoizq);
            preorden(print.hijoder);
        }
    }
    
    private void altura(NodoArbol aux, int nivel) {
        if (aux != null) {
            altura(aux.getIzq(), nivel + 1);
            alt = nivel;
            altura(aux.getDer(), nivel + 1);
        }
    }

    public int getAltura() {
        altura(raiz, 1);
        return alt;
    }
    
    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }
    
}



