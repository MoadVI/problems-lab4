package problem2;

public class IntegerList {
    private int currSize;
    private int maxSize;

    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size) {
        list = new int[size];
        currSize = 0;
        maxSize = size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize() {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        currSize = list.length;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print() {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public void increaseSize() {
        int newSize = maxSize * 2;
        int[] newList = new int[newSize];
        for (int i = 0; i < currSize; i++) {
            newList[i] = list[i];
        }
        list = newList;
        maxSize = newSize;
    }
    public void addElement(int newVal) {
        if (currSize >= maxSize) {
            increaseSize();
        }
        list[currSize] = newVal;
        currSize++;
    }
    public void removeFirst(int newVal) {
        for (int i = 0; i < currSize; i++) {
            if (list[i] == newVal) {
                    for (int j = i; j < currSize-1; j++) {
                        list[j] = list[j+1];
                    }
                    list[currSize-1] = 0;
                    currSize--;
                    break;
            }
        }
    }
    public boolean contains(int val) {
        for (int i = 0; i < currSize; i++) {
            if (list[i] == val) {
                return true;
            }
        }
        return false;
    }
    public void removeAll(int newVal) {
        while(this.contains(newVal)) {
            removeFirst(newVal);
        }
    }

}