package com.company;


//Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
//
//        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//        By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
public class Fibonaccinumbers {

    public static void main(String[] args) {
// initialize the number as 1 and add as 1
	int number=1, additionNumber=1;
    int sum=0;
    while(number<=4000000){
//        the next number is the number plus the initialized addition value, num1=1+1=2 . The next addition value (add1)is equal to the old number(num), which is the difference of the new number and the previous addtion value(add 1).
//        supposing number1=number+add,add1=number=number1-add. eg. num1=1+1=2  add1 = num1(2)-add(1)=1. The next number will be num2=num1(2)+add1(1)=3.
        number= number + additionNumber;
        additionNumber=number-additionNumber;
//        if number is even number, sum it up.
        if(number%2==0){
            sum=sum+number;
        }
    }
        System.out.println(sum);
    }
}
