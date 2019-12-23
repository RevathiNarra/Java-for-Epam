import java.util.*;
class Calculator {
    static double powerInt(int num1,int num2){
        return Math.pow(num1,num2);
    }
    static double powerDouble(double num1,int num2){
        return Math.pow(num1,num2);
    }
}
class Cal{
    public static void main(String args[]){
        System.out.println(Calculator.powerInt(8,4));
        System.out.println(Calculator.powerDouble(9.6,4));
    }
}
