public class Main {

    public static void main(String[] args) {

        String name = "Hello World!";
        name = "Test";

        int age = -8;
        long veryBigNumber = 13000000000L;

        float kommaZahl32 = 0.01f;
        double kommaZahl64 = 0.02;

        char oneCharacter = 'A';

        boolean wahrheitswert = true; //false

        System.out.println(name);
        System.out.println(age);
        System.out.println(veryBigNumber);
        System.out.println(kommaZahl32);
        System.out.println(kommaZahl64);

        System.out.println(oneCharacter);
        System.out.println(wahrheitswert);


        int sum = age / 3;

        double result = 0.3 + 0.1;

        String text = "Hallo " + "Welt" + kommaZahl32 + wahrheitswert;

        System.out.println(text);

        boolean same = "Hallo" == "Hallo";
        boolean notSame = "Hallo" != "Welt";

        System.out.println(same);
        System.out.println(notSame);

        boolean isBigger = 3 > 0;
        boolean isLower = 3 <= 5;

        System.out.println(isBigger);
        System.out.println(isLower);

        System.out.println(name == "Test123");


        boolean isValue1 = false;
        boolean isValue2 = false;

        System.out.println("Wahr: " + (isValue1 || isValue2));

        int viewCount = 10;
        int views = 11;
        int countOfLegs = 4;

        int count = 0;

        count++;
        //count = count + 1;

         int rest = 9 % 3;

        System.out.println(rest);



    }
}
