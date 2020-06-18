package Task1.Sorting;
public  class SortCreator {
    public Sortable createBubbleSort(){
        return new BubbleSort();
    }
    public Sortable createSelectionSort(){
        return new SelectionSort();
    }
    public Sortable createShellSort(){
        return new ShellSort();
    }
}
