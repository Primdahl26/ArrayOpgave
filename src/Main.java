public class Main {

    public static void main(String[] args) {

        HannesArrayList<Integer> hannesArrayList = new HannesArrayList<>();

        hannesArrayList.add(10);
        hannesArrayList.add(22);
        hannesArrayList.add(12);
        hannesArrayList.add(30);

        System.out.println("\nPrinter vores array ud, efter at have tilføjet: 10, 22, 12, 30");
        hannesArrayList.print();

        hannesArrayList.clear();

        hannesArrayList.add(1);
        hannesArrayList.add(2);
        hannesArrayList.add(3);
        hannesArrayList.add(4);

        System.out.println("\nHerefter har vi clearet vores array helt, og tilføjet 1, 2, 3, 4 istedet:");
        hannesArrayList.print();

        System.out.println("\nVi printer størrelsen af vores array ud: "+hannesArrayList.size()+"\n");

        System.out.println("Herefter fjerner vi index nummer 2:");
        hannesArrayList.remove(2);
        hannesArrayList.print();

        System.out.println();

        System.out.println("Herefter printer vi index nummer 2 ud: "+hannesArrayList.get(2)+"\n");

        hannesArrayList.add(2,5);

        System.out.println("Til sidst så tilføjer vi tallet 2 til index nummer 1:\n(Husk at den tæller index: 0, 1, 2 ,3 ,4 osv)");
        hannesArrayList.print();
    }
}
