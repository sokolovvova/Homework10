package Task1;
import Task1.Sorting.*;
import java.util.Scanner;
public class Main {
    public static void printMenu(int i){
        switch(i){
            case 1:
                System.out.println("Введите массив чисел: ");
                break;
            case 2:
                System.out.println("1 - Сортировка пузырьком\n2 - Сортировка методом выбора\n" +
                        "3 - Сортировка методом Шелла\n0 - Выход");
                break;
            case 3:
                System.out.println("1 - по возростанию\n2 - по убыванию");
        }
    }
    public static int getUserNumber(){
        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;
    }
    public static int[] getUserArray(){
        System.out.print(">");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] nList = s.split(" ");
        int[] a = new int[nList.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(nList[i]);
        }
        return a;
    }

    public static void printArray(int[] a){
        System.out.print("[ ");
        for(int n:a){
            System.out.print(n+" ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        boolean state=true;
        SortCreator sortCreator = new SortCreator();
        while(state){
            printMenu(1);
            int a[] = getUserArray();
            printMenu(2);
            int userChoice = getUserNumber();
            int userChoice2;
            switch (userChoice){
                case 1:
                    printMenu(3);
                    userChoice2=getUserNumber();
                    a = sortCreator.createBubbleSort().sort(a,userChoice2);
                    printArray(a);
                    continue;
                case 2:
                    printMenu(3);
                    userChoice2=getUserNumber();
                    a = sortCreator.createSelectionSort().sort(a,userChoice2);
                    printArray(a);
                    continue;
                case 3:
                    printMenu(3);
                    userChoice2=getUserNumber();
                    a = sortCreator.createShellSort().sort(a,userChoice2);
                    printArray(a);
                    continue;
                case 0:
                    state=false;
                    break;

            }
        }
    }
}
