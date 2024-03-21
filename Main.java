import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        init();
    }
    public static void init () {

        CaesarCipher cipher = new CaesarCipher();
        int charArrayLength = cipher.charArray.length;
        // System.out.println(charArrayLength);

        Scanner in = new Scanner(System.in);

        System.out.printf("Do you want to encrypt:  (Y/N) ");
        String answer = in.nextLine();

        if (answer.equals("Y") ) {
            System.out.printf("Enter text:  ");
            String text = in.nextLine();

            // for (int i = 0; i < text.split("").length; i++) {
            //     if (!Character.isLetter(text.charAt(i))) {
            //         System.out.println("You are only allowed to enter letters!");
            //         init();
            //     }
            // }
            System.out.printf("Enter key:  ");
                if (in.hasNextInt()) {
                    int key = in.nextInt();
                    if (key % charArrayLength == 0) {
                        System.out.println("The encoded text will be the same as the clear text. Please choose another number!");
                        init();
                    } else if (key > 0) {
                        System.out.println("Your encrypted text is:  " + cipher.encrypt(text, key));
                        init();
                    }  else  {
                        System.out.println("You are only able to enter a positive number!");
                        init();
                    }

                } else {
                    System.out.println("You are only allowed to enter a whole number!");
                    init();
                }

        } else if (answer.equals("N") ) {
            System.out.printf("Do you want to decrypt:  (Y/N) ");
            answer = in.next();

        if (answer.equals("Y") ) {
            System.out.printf("Enter text:  ");
            String text = in.next();

            // for (int i = 0; i < text.split("").length; i++) {
            //     if (!Character.isLetter(text.charAt(i))) {
            //         System.out.println("You are only allowed to enter letters!");
            //         init();
            //     }
            // }
            System.out.printf("Enter key:  ");
                if (in.hasNextInt()) {
                    int key = in.nextInt();
                    if (key % charArrayLength == 0) {
                        System.out.println("The encoded text will be the same as the clear text. Please choose another number!");
                        init();
                    } else if (key > 0) {
                        System.out.println("Your decrypted text is:  " + cipher.decrypt(text, key));
                        init();
                    }  else  {
                        System.out.println("You are only able to enter a positive number!");
                        init();
                    }

                } else {
                    System.out.println("You are only allowed to enter a whole number!");
                    init();
                }

            } else if (answer.equals("N") ) {
                System.out.println("Have a nice day!");

            } else {
                System.out.println("Wrong format of answer. Please type \"Y\" for Yes and \"N\" for No");
                init();
            }

        } else {
                System.out.println("Wrong format of answer. Please type \"Y\" for Yes and \"N\" for No");
                init();
        }
            in.close();
    }
}
