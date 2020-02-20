import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //THE HANNE ARRAY WILL RULE ALL ARRAYS

        System.out.println("\n\nHusk Arrays tæller 0, 1, 2, 3 osv...");

        //Creating a new Array of the type Int
        HannesArrayList<Integer> intArrayList = new HannesArrayList<>();

        //Tilføjer 4 elementer til arrayet
        intArrayList.add(10);
        intArrayList.add(20);
        intArrayList.add(30);
        intArrayList.add(40);

        System.out.println("\nPrinter vores array ud, efter at have tilføjet: 10, 20, 30, 40");
        intArrayList.print();

        //Running the clear method
        intArrayList.clear();

        //Adding 4 elements to the array
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);

        System.out.println("\nHerefter har vi clearet vores array helt, og tilføjet 1, 2, 3, 4 istedet:");
        intArrayList.print();

        System.out.println("\nVi printer størrelsen af vores array ud: "+intArrayList.size()+"\n");
        System.out.println("Herefter fjerner vi index nummer 2:");

        //Removing index number 2
        intArrayList.remove(2);

        intArrayList.print();
        System.out.println();
        System.out.println("Herefter printer vi index nummer 2 ud: "+intArrayList.get(2)+"\n");

        //Adding a element on a specific index
        intArrayList.add(2,5);

        System.out.println("Til sidst så tilføjer vi tallet 5 til index nummer 2:");
        intArrayList.print();
        System.out.println();

        //Creating a new Arary of the type String
        HannesArrayList<String> stringArrayList = new HannesArrayList<>();

        //Adding an element to the array
        System.out.println("Vi har nu lavet et Array af typen String istedet og tilføjer hej:");
        stringArrayList.add("hej");

        stringArrayList.print();

        //Creating a Hanne object
        Hanne hanne = new Hanne("Mikael", "Andreas", 69);

        //Creating a new Array that takes a object of Hanne
        HannesArrayList<Hanne> hanneArrayList = new HannesArrayList<>();

        //adding the hanne object the the array
        hanneArrayList.add(hanne);
    }
}
