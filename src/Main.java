public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{4, 1, 10});
        System.out.println(salesManager.max());

        System.out.println(salesManager.average());
    }
}
