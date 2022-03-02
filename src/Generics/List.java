package Generics;

public class List<I extends Number> {
    private int[]items = new int[10];
    private int count;
    public void add(int item){
        items[count++] = item;
    }
}
