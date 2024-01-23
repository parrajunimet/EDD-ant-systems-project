/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Sofia
 */
public class ListaDoble implements ILista{
    private int size; 
    private Nodo head, tail; 
    
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

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }
  
    @Override
    public void insertBegin(Object element) {
        Nodo newNodo = new Nodo(element);
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
        Nodo newNodo = new Nodo(element);
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
    public void insertinIndex(Object element, int index) {
        Nodo newNodo = new Nodo(element);
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
                Nodo pointer = getTail(); 
                for (int end = size-index; end >1 ; end--) {
                    pointer = pointer.getPrevious(); 
                    
                }
                Nodo previous = pointer.getPrevious();
                newNodo.setNext(pointer);
                newNodo.setPrevious(previous);
                previous.setNext(newNodo);
                pointer.setPrevious(newNodo); 
            }
            else {
                Nodo pointer = getHead();
                for (int i = 1; i < index; i++) {
                    pointer = pointer.getNext(); 
                    
                }
                
                Nodo nodoNext = pointer.getNext(); 
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
            Nodo newTail = getTail().getPrevious();
            Nodo eliminated = getTail(); 
            newTail.setNext(null);
            getTail().setPrevious(null);
            setTail(newTail); 
            size--;
            return eliminated.getElement(); 
           
        }
       
        return null;
        
    }

    @Override
    public Object deleteBegin() {
        if (isEmpty()) {
            System.out.println("Delete Error, empty list.");; 
        }else {
            Nodo newHead = getHead().getNext();
            Nodo eliminated = getHead(); 
            newHead.setPrevious(null);
            getHead().setNext(null);
            setHead(newHead); 
            size--;
            return eliminated.getElement(); 
        }
        
        return null;
        
    }

    @Override
    public Object deleteinIndex(int index) {
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
                Nodo pointer = getTail(); 
                for (int end = size-index; end >1 ; end--) {
                    pointer = pointer.getPrevious();   
                }

                Nodo deleted = pointer.getPrevious(); 
                pointer.setPrevious(deleted.getPrevious());
                deleted.getPrevious().setNext(pointer);
                deleted.setNext(null);
                deleted.setPrevious(null);
                size--;
                return deleted.getElement(); 
                
                
            }
            else {
                Nodo pointer = getHead();
                for (int i = 1; i < index; i++) {
                    pointer = pointer.getNext(); 
                    
                }
                Nodo deleted = pointer.getNext(); 
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
    public String print() {
       Nodo pointer = getHead();
       String list = "- "; 
       while (pointer != null) {
           list = list + pointer.getElement() + " - "; 
           pointer = pointer.getNext(); 
            
       }
        return list;
       
    }



    
}
