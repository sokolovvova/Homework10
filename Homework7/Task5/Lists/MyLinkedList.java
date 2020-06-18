package Task5.Lists;

public class MyLinkedList<T> {
    private Node<T> firstNode;
    private int size;

    public MyLinkedList(T data){
        this.firstNode=new Node<>(data);
        size++;
    }

    /*добавление элемента в конец*/
    public void add(T data){
        Node<T> node = firstNode;
        while(node.nextElement!=null){
            node=node.nextElement;
        }
        node.nextElement=new Node<>(data);
        size++;
    }

    /*добавление элемента по индексу*/
    public void add(int i,T data){
        if(i>size) System.out.println("Нельзя добавить элемент, так как элемента с переданным индексом не существует");
        else if(i==0){
            Node<T> tempNode = firstNode;
            firstNode=new Node<>(data);
            firstNode.nextElement=tempNode;
            size++;
        }
        else if(i==size){
            add(data);
        }
        else{
            Node<T> node = firstNode;
            Node<T> nodeNext;
            while(i>1){
                node=node.nextElement;
                i--;
            }
            nodeNext=node.nextElement;
            node.nextElement=new Node<>(data);
            node.nextElement.nextElement=nodeNext;
            size++;
        }
    }


    /* размер списка*/
    public int getSize(){return size;}

    /*получение элемента по индексу*/
    public T get(int i){
        Node<T> node = firstNode;
        if(i>=size) System.out.println("Данного элемента нет в списке");
        else{
            while(i>0){
                node=node.nextElement;
                i--;
            }
            return node.data;
        }
        return null;
    }


}
