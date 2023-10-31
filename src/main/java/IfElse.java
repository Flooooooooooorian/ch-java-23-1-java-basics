public class IfElse {


    public static void main(String[] args) {

        int age = 18;

        if (age >= 18) {

            System.out.println("Die Person ist über 18 Jahre alt!");
        } else if (age == 17) {
            System.out.println("Die Person braucht einen Muttizettel.");
        } else {
            System.out.println("Die Person ist zu jung.");
        }

        System.out.println("---------------------------");

        turnOffLights();


        System.out.println("--------------------------");

        int result1 = addieren(8, 13);
        int result2 = addieren(3, 1);
        int result3 = addieren(854, 4643468);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("--------------------------");

        System.out.println(isEvenOrOdd(10));
        System.out.println(isEvenOrOdd(11));
    }


    public static void turnOffLights() {
        System.out.println("Aufstehen");
        System.out.println("Zum Lichtschalter gehen");
        System.out.println("Den Lichtschalter betätigen");
    }

    public static int addieren(int valueA, int valueB) {

        return valueA + valueB;
    }

    public static String concat(String text, boolean valueA) {
        return text + valueA;
    }

    public static int isEvenOrOdd(int value) {
        if (value % 2 == 0) {
            return value;
        }
        else {
            return value * 2;
        }
    }

    public static int minus(int valueA, int valueB) {
        return valueA - valueB;
    }

    public static void test() {
        System.out.println("TEST");
        System.out.println("ABC");
    }
}
