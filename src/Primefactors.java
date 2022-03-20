//The prime factors of 13195 are 5, 7, 13 and 29.
//
//        What is the largest prime factor of the number 600851475143 ?


        public class Primefactors {
            public static void main(String[] args) {
                System.out.println(findBiggestPf(600851475143L));
            }
//initialize the number of a long, starting from 2. devide the number with the number that is smaller than the number/2.
//            If the number can be divided by a i, then the number becomes the value of number/i. eg. number 50, i=2, number=25. i=5, number=5.
            public static long findBiggestPf(long number) {
                for(long i=2; i<=number/2; i++){

                    if(number%i==0){
                        number=number/i;
                    }
                }

                return number;
            }
        }
