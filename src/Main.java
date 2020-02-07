public class Main {

    public static void main(String[] args) {

        System.out.println("\nDenne opgave er lavet tænkt med et bruger index, dvs. 0=1 (undtagen sidst add metode add(index, value))");

        HannesArrayList<Integer> hannesArrayList = new HannesArrayList<>();

        //Tilføjer 4 elementer til arrayet
        hannesArrayList.add(10);
        hannesArrayList.add(20);
        hannesArrayList.add(30);
        hannesArrayList.add(40);

        System.out.println("\nPrinter vores array ud, efter at have tilføjet: 10, 20, 30, 40");
        hannesArrayList.print();

        //Kører clear metoden
        hannesArrayList.clear();

        //Tilføjer 4 elementer til arrayet
        hannesArrayList.add(1);
        hannesArrayList.add(2);
        hannesArrayList.add(3);
        hannesArrayList.add(4);

        System.out.println("\nHerefter har vi clearet vores array helt, og tilføjet 1, 2, 3, 4 istedet:");
        hannesArrayList.print();

        System.out.println("\nVi printer størrelsen af vores array ud: "+hannesArrayList.size()+"\n");
        System.out.println("Herefter fjerner vi index nummer 2:");

        //Fjerner index nummer 2
        hannesArrayList.remove(2);

        hannesArrayList.print();
        System.out.println();
        System.out.println("Herefter printer vi index nummer 2 ud: "+hannesArrayList.get(2)+"\n");

        //Tilføjer et element på et specifikt index
        hannesArrayList.add(2,5);

        System.out.println("Til sidst så tilføjer vi tallet 5 til index nummer 1:\n- Husk at den tæller index: 0, 1, 2 ,3 ,4 osv");
        hannesArrayList.print();
    }
}
