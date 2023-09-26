public class Main {
    public static void main(String[] args) {
        System.out.println(NumberToWords.getDigitCount(0));     //output 1
        System.out.println(NumberToWords.getDigitCount(123));   //output 3

        System.out.println(NumberToWords.reverse(-121));        //output -121
        System.out.println(NumberToWords.reverse(4321));        //output 1234

        NumberToWords.numberToWords(123);                          //output One Two Three
        NumberToWords.numberToWords(1000);                         //output One Zero Zero Zero
        NumberToWords.numberToWords(-12);                          //output Invalid Value

    }
}

class NumberToWords {
    public static int reverse (int a) {
        //reverse the number
        int reverse = 0, i = 0;
        while (a != 0) {
            reverse *= 10;
            i = a % 10;
            reverse += i;
            a /= 10;
        }
        return reverse;

    }

    public static int getDigitCount (int b) {
        //count the number of digits in the input
        if (b < 0) return -1;
        int counter = 0;
        do {
            b /= 10;
            counter += 1;
        } while (b != 0);
        return counter;

    }

    public static void numberToWords (int number) {
        //convert each digit to words (e.g., 1 = One, 2 = Two...)
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String word = "";
        int rev = reverse(number);

        for (int i = 1; i <= getDigitCount(number); i++) {

            switch (rev % 10) {
                case 0: word += "Zero ";
                    break;
                case 1: word += "One ";
                    break;
                case 2: word += "Two ";
                    break;
                case 3: word += "Three ";
                    break;
                case 4: word += "Four ";
                    break;
                case 5: word += "Five ";
                    break;
                case 6: word += "Six ";
                    break;
                case 7: word += "Seven ";
                    break;
                case 8: word+= "Eight ";
                    break;
                case 9: word += "Nine ";
                    break;
                default: break;
            }

            rev /= 10;

        }
        System.out.println(word);
    }
}