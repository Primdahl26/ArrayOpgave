import java.lang.reflect.Array;
import java.util.Arrays;

public class HannesArrayList<E> {

    private Object hanneArray[];
    private int arraySize;

    public HannesArrayList(){
        hanneArray = new Object[1];
    }

    //Returns the array object, depending on the index chosen
    public Object get(int index){
        return Array.get(hanneArray, index-1);
    }

    //Adds an element to the array, taking an index, and a value
    //The element that is already present on that index is pushed so the array is made 1 longer
    //NOTE: When the array is made 1 longer, a new array is made
    public void add(int index, E e){
        Object[] tempArray = new Object[hanneArray.length+1];

        for (int i = 0; i < tempArray.length - 1; i++) {
            tempArray[i < index ? i : i + 1] = hanneArray[i];
            tempArray[index] = e;
        }
        hanneArray = tempArray;
    }

    //Adds a element to the array, and the array is made 1 longer
    //NOTE: When the array is made 1 longer, a new array is made
    public void add(E e){
        if (arraySize == hanneArray.length){
            int newArraySize = hanneArray.length + 1;
            hanneArray = Arrays.copyOf(hanneArray, newArraySize);
        }
        hanneArray[arraySize++] = e;
    }

    //Removes a element from a given index
    //NOTE: When the array is made 1 shorter, a new array is made
    public void remove(int index){
        hanneArray[index-1] = null;

        int j=0;
        Object[] tempArray = new Object[hanneArray.length-1];
        for (int i = 0; i<hanneArray.length; i++){
            if(i != index-1){
                tempArray[j++] = hanneArray[i];
            }
        }
        hanneArray = tempArray;
    }

    //returns the length of the array
    public int size(){
        return hanneArray.length;
    }

    //creates a new array, and resets its size
    public void clear(){
        hanneArray = new Object[1];
        arraySize = 0;
    }

    //prints out the elements of the array
    public void print(){
        System.out.println(Arrays.toString(hanneArray));
    }
}

