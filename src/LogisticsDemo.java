public class LogisticsDemo {

    public static void main(String[] args) {

        Car vw = new Car("VW Golf", "Blue", 2500.00);
        Car bmw = new Car("BMW E36", "Silver", 2800.00);
        Shirt urban = new Shirt("Urban Classics", "M", "Black");
        Shirt esprit = new Shirt("Esprit", "L", "White");

        LogisticManager logisticManager = new LogisticManager();

        logisticManager.add(vw);
        logisticManager.add(bmw);
        logisticManager.add(urban);
        logisticManager.add(esprit);

        logisticManager.moveAll("Graz");

    }
}
