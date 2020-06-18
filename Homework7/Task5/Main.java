package Task5;

import Task5.Lists.MyLinkedList;



public class Main {

    /*ф-ция для печати массива*/

    public  static void ListPrinter(MyLinkedList<String> list){
        System.out.print("Размер = "+list.getSize()+" [");
        for(int i=0;i<list.getSize();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("]");
    }


    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>("0");
        list.add("aa");
        list.add("bb");
        list.add("cc");

        ListPrinter(list);

        list.add("dd");
        list.add("ee");

        ListPrinter(list);

        list.add(4,"98");

        ListPrinter(list);

        list.add(0,"99");

        list.add("ff");

        ListPrinter(list);

        list.add(7,"100");

        ListPrinter(list);

        list.add(0,"100");

        ListPrinter(list);

        System.out.println(list.get(10));

        list.add(11,"9999");

        ListPrinter(list);


    }
}
