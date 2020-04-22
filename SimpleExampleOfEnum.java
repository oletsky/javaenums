package javatraining.oletsky.enums;

/**
 * @author O.Oletsky
 * A simple example of enums
 */

public class SimpleExampleOfEnum {
    enum Car {SLAVUTA, FERRARI, MERSEDES, HONDA}

    public static void main(String[] args) {

        Car[] cars = Car.values();
        String message = "";
        for (Car cc : cars) {
            switch (cc) {
                case SLAVUTA:
                    message = "A cool car";
                    break;
                case FERRARI:
                    message = "Not so bad";
                    break;
                case MERSEDES:
                    message = "You can't afford it";
                    break;
                case HONDA:
                    message = "Japan rules!";
            }
            System.out.println(cc.ordinal() + ". " + cc + " - " + message);
        }

    }
}
