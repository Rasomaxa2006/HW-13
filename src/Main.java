public class Main {
    public static void main(String[] args) {
        Product phone = new Product(101, "Смартфон", 49990, "Электроника");
        Product phoneAgain = new Product(101, "Смартфон", 49990, "Электроника");
        Product charger = new Product(102, "Зарядка", 1990, "Аксессуары");
        Product phoneOtherCategory = new Product(101, "Смартфон", 49990, "Распродажа");

        System.out.println(phone);
        System.out.println(charger);

        System.out.println("phone.equals(phoneAgain): " + phone.equals(phoneAgain));
        System.out.println("phone.equals(charger): " + phone.equals(charger));
        System.out.println("phone.equals(phoneOtherCategory): " + phone.equals(phoneOtherCategory));
        System.out.println("phone.equals(null): " + phone.equals(null));
        System.out.println("phone.equals(\"строка\"): " + phone.equals("строка"));

        Order order1 = new Order("Иван", new Product[]{phone, charger});
        Order order2 = new Order("Иван", new Product[]{phoneAgain, charger});
        Order order3 = new Order("Мария", new Product[]{phone, charger});
        Order order4 = new Order("Иван", new Product[]{charger, phone});

        System.out.println("\n" + order1);
        System.out.println(order2);
        System.out.println("order1.equals(order2): " + order1.equals(order2));
        System.out.println("order1.equals(order3): " + order1.equals(order3));
        System.out.println("order1.equals(order4): " + order1.equals(order4));
        System.out.println("order1.equals(null): " + order1.equals(null));
    }
}