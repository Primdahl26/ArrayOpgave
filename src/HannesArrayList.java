import java.lang.reflect.Array;
import java.util.Arrays;

public class HannesArrayList<E> {

    private Object hanneArray[];
    private int arraySize;

    public HannesArrayList(){
        hanneArray = new Object[1];
    }

    //Works
    public Object get(int index){
        return Array.get(hanneArray, index-1);
    }

    //Works
    public void add(int index, E e){
        Object[] tempArray = new Object[hanneArray.length+1];

        for (int i = 0; i < tempArray.length - 1; i++) {
            tempArray[i < index ? i : i + 1] = hanneArray[i];
            tempArray[index] = e;
        }
        hanneArray = tempArray;
    }

    //Works
    public void add(E e){
        if (arraySize == hanneArray.length){
            int newArraySize = hanneArray.length + 1;
            hanneArray = Arrays.copyOf(hanneArray, newArraySize);
        }
        hanneArray[arraySize++] = e;
    }

    //Works
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

    //Works
    public int size(){
        return hanneArray.length;
    }

    //Works
    public void clear(){
        hanneArray = new Object[1];
        arraySize = 0;
    }

    //Works
    public void print(){
        System.out.println(Arrays.toString(hanneArray));
    }
}

