
package edd;


public class NodoDoble {
    
    private Object element;
    private NodoDoble next;
    private NodoDoble previous;

    public NodoDoble(Object element) {
        this.element = element;
        this.next = this.previous = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public NodoDoble getNext() {
        return next;
    }

    public void setNext(NodoDoble next) {
        this.next = next;
    }

    public NodoDoble getPrevious() {
        return previous;
    }

    public void setPrevious(NodoDoble previous) {
        this.previous = previous;
    }
    
    
}
