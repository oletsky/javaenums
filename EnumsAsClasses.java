package javatraining.oletsky.enums;

/**
 * @author O.Oletsky
 * Illustrates that enum is a special sort of a class
 */
public class EnumsAsClasses {

    enum Car {
        FERRARI(20000),
        SLAVUTA(5000),
        MERSEDES(100000),
        HONDA(15000);

        private int price;

        Car(int c) {
            price = c;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Car[] cr = Car.values();
        for (Car c : cr) {
            System.out.println(c + " - " + c.ordinal() + " - " +
                    c.getPrice());
        }
    }

}
