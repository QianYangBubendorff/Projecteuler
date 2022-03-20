//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//        Find the sum of all the multiples of 3 or 5 below 1000.

public class Multiples {
    public static void main(String[] args) {
//        int number=1;
//        int sum=0;
//        while(number<10){
//            if(number%3==0 || number%5==0){
//                sum=sum+number;
//            }
//            number++;
//        }
        int sum = 0;
        for (int number = 1; number < 10; number++) {
//            if number can be divided by 3 or 5. If yes, then sum the numbers up.
            if (number % 3 == 0 || number % 5 == 0) {
                sum=sum+number;
            }
        }
        System.out.println(sum);
    }
}
