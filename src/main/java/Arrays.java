public class Arrays {

    public static void main(String[] args) {
        String name = "Florian";
        String name2 = "Bastian";
        String name3 = "Maximilian";
        String name4 = "Lisa";
        String name5 = "Otto";

        String[] names = new String[3];
        names[0] = "Flo";
        names[1] = "Bastian";
        names[2] = "Maximilian";

        String[] names2 = {"Hallo", "Test", "ABC"};


        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        names[2] = "Test";

        System.out.println(names[2]);


        int[] bankTransactions = new int[6];

        bankTransactions[0] = -9;
        bankTransactions[1] = -5;
        bankTransactions[2] = -15;
        bankTransactions[3] = -25;
        bankTransactions[4] = -10;
        bankTransactions[5] = -33;
        //...

        System.out.println("Tag 1: +" + bankTransactions[0]);
        System.out.println("Tag 2: +" + bankTransactions[1]);
        System.out.println("Tag 3: +" + bankTransactions[2]);
        System.out.println("Tag 4: +" + bankTransactions[3]);
        //...


        for(int i = 3; i <= 15; i++) {
            System.out.println("Schleifendurchgang: " + i);
        }



        for(int i = 0; i < bankTransactions.length; i++) {
            System.out.println(bankTransactions[i]);
        }

        for (int bankTransaction : bankTransactions) {
            System.out.println(bankTransaction);
        }


        int biggestNumber = bankTransactions[0];
        for (int bankTransaction : bankTransactions) {
            if (bankTransaction > biggestNumber) {
                biggestNumber = bankTransaction;
            }
        }
        System.out.println("Biggest Number: " + biggestNumber);

    }
}
