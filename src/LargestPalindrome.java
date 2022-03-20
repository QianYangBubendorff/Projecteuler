//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//        Find the largest palindrome made from the product of two 3-digit numbers.

public class LargestPalindrome {
    public static void main(String[] args) {

        System.out.println(LargestPalindromeNumber(100, 993));
    }

    public static int LargestPalindromeNumber(int start, int end) {
//        initialize the largest number which is the product of two 3-digital number (i and j).
//        a boolean to break the loop if the number is found
//        906609 as an example, I would like to compare the first 3 numbers and the last 3 in reversed order. 906=906609/1000.
//        the last 3 numbers in reversed order: 906609%10*100+906609/10%10*10+906609/100%10

        int PalindromeNumber = 0;
        boolean found = false;
        for (int i = end; i > start ; i--) {
            for (int j = i; j > start && !found; j--) {
                if (i * j / 1000 == ((i * j % 10 * 100) + ((i * j / 10) % 10) * 10 + (i * j / 100) % 10)) {
                    PalindromeNumber = i * j;
                    found = true;
                }
//    below the second method to find the biggest number by comparing first the first number 9 and the last number 9, then the second with the last but the second...
//                if(i*j/100000==i*j%10){
//                    if((i*j/10000)%10==(i*j/10)%10){
//                        if((i*j/1000)%10==(i*j/100)%10){
//                            PalindromeNumber = i * j;
//                            found = true;
//                        }
//                    }
//                }

            }

        }
        return PalindromeNumber;
    }
}
