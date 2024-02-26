
package edd;


public class ListaDoble implements ILista{
    private int size; 
    private NodoDoble head, tail;

    public ListaDoble() {
        this.size = 0;
        this.head = this.tail = null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public NodoDoble getHead() {
        return head;
    }

    public void setHead(NodoDoble head) {
        this.head = head;
    }

    public NodoDoble getTail() {
        return tail;
    }

    public void setTail(NodoDoble tail) {
        this.tail = tail;
    }
    
    @Override
    public void insertBegin(Object element) {
        NodoDoble newNodo = new NodoDoble(element);
        if (isEmpty()) {
            setHead(newNodo); 
            setTail(newNodo); 
        }else {
            newNodo.setNext(getHead());
            getHead().setPrevious(newNodo);
            setHead(newNodo); 
        }
        size++;
    }

    @Override
    public void insertFinal(Object element) {
        NodoDoble newNodo = new NodoDoble(element);
        if (isEmpty()) {
            setHead(newNodo); 
            setTail(newNodo); 
        }else {
            newNodo.setPrevious(getTail());
            getTail().setNext(newNodo);
            setTail(newNodo);
        }
        size++;
    }

    @Override
    public void insertInIndex(Object element, int index) {
        NodoDoble newNodo = new NodoDoble(element);
        if (isEmpty()) {
            setHead(newNodo); 
            setTail(newNodo); 
        }else if (index == size) {
            insertFinal(element); 
        }else if (index == 0) {
            insertBegin(element); 
        }else if (index > size) {
            System.out.println("Index Error");
        }else if (index < 0)
            System.out.println("Index Error");
        else {
            if (index > (int) getSize()/2) {
                NodoDoble pointer = getTail(); 
                for (int end = size-index; end >1 ; end--) {
                    pointer = pointer.getPrevious(); 
                    
                }
                NodoDoble previous = pointer.getPrevious();
                newNodo.setNext(pointer);
                newNodo.setPrevious(previous);
                previous.setNext(newNodo);
                pointer.setPrevious(newNodo); 
            }
            else {
                NodoDoble pointer = getHead();
                for (int i = 1; i < index; i++) {
                    pointer = pointer.getNext(); 
                    
                }
                
                NodoDoble nodoNext = pointer.getNext(); 
                newNodo.setNext(nodoNext);
                newNodo.setPrevious(pointer);
                pointer.setNext(newNodo);
                nodoNext.setPrevious(newNodo); 
            }
         size++; 
        }
    }


    @Override
    public Object deleteFinal() {
        if (isEmpty()) {
            System.out.println("Delete Error, empty list.");; 
        }else {
            NodoDoble newTail = getTail().getPrevious();
            if (newTail == null){
                setHead(null);
                setTail(null); 
                size--;
            }else {
                NodoDoble eliminated = getTail(); 
                newTail.setNext(null);
                getTail().setPrevious(null);
                setTail(newTail);
                size--; 
                return eliminated.getElement(); 
            }
        }
        return null;
        
    }

    @Override
    public Object deleteBegin() {
        if (isEmpty()) {
            System.out.println("Delete Error, empty list.");; 
        }else {
            NodoDoble newHead = getHead().getNext();
            NodoDoble eliminated = getHead(); 
            newHead.setPrevious(null);
            getHead().setNext(null);
            setHead(newHead); 
            size--;
            return eliminated.getElement(); 
        }
        
        return null;
        
    }

    @Override
    public Object deleteInIndex(int index) {
        if (isEmpty()) {
            System.out.println("Delete Error, list empty.");
        }else if (index >= size) {
             System.out.println("Index Error");
        }else if (index == 0) {
            deleteBegin(); 
        }else if  (index == size-1) {
            deleteFinal(); 
        }else if (index < 0)
            System.out.println("Index Error");
        else {
            
            if (index > (int) getSize()/2) {
                NodoDoble pointer = getTail(); 
                for (int end = size-index; end >1 ; end--) {
                    pointer = pointer.getPrevious();   
                }
                
                pointer.getNext().setPrevious(pointer.getPrevious());
                pointer.getPrevious().setNext(pointer.getNext());
                pointer.setNext(null);
                pointer.setPrevious(null);
                size--;
                
                return pointer.getElement(); 
               
                
                
            }
            else {
                NodoDoble pointer = getHead();
                for (int i = 1; i < index; i++) {
                    pointer = pointer.getNext(); 
                    
                }
                
                NodoDoble deleted = pointer.getNext(); 
                pointer.setNext(deleted.getNext());
                deleted.getNext().setPrevious(pointer);
                deleted.setNext(null);
                deleted.setPrevious(null);
                size--;
                return deleted.getElement();

            } 
        }
        return null;
        
    }

    @Override
    public boolean isEmpty() {
        return (getHead() == null  && getTail() == null); 
    }

    @Override
    public void print() {
        NodoDoble pointer = getHead();
        int aux = 0;
        while(pointer != null){
            System.out.println(aux + "._ [" + pointer.getElement() + "]");
            aux ++;
            pointer = pointer.getNext();
        }
        if (getHead() == null){
            System.out.println("Empty List");
        }
    }
    
    public String printString() {
        NodoDoble pointer = getHead();
        String list = ""; 
        while (pointer != null) {
            if (pointer.getNext() != null) {
                list = list + pointer.getElement() + " -> "; 
            } else {
                list = list + pointer.getElement(); 
            } 
            pointer = pointer.getNext(); 
            
       }    
       return list;
    }
    
    
    public boolean isIn(Object element) {
        NodoDoble pointer = getHead(); 
        while (pointer != null){
            if (pointer.getElement().equals(element)) {
                return true;
            }
            pointer = pointer.getNext();
        }
        return false; 
    }
    
    
    public void emptyButHead() {
        if (!isEmpty()){
            while(getHead().getNext() != null){
                deleteFinal(); 
            }
        }
    }
}