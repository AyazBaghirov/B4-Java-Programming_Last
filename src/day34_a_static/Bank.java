package day34_a_static;
// Runner Class - main()
public class Bank {
    public static void main(String[] args) {

        DebitCard card1 = new DebitCard(123456, "Tom Jerry", 100.00);


        DebitCard card2 = new DebitCard(1234567890123456L, "Winnie Pooh", "Amex", 12345, 200);


        DebitCard card3 = new DebitCard(1234567890123456L, "Winnie Pooh", "Visa", 1234, 200);


        System.out.println();
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);


    }
}
