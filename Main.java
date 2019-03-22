package com.company;

public class Main {

    public static void main(String[] args) {

            int result = 1 + 2;
        System.out.println(result);

        int prevResult = result;
        result = result -1;
        System.out.println(prevResult + "- 1 =" + result);
        prevResult = result;
        result = result * 10;
        System.out.println(prevResult + "*10 =" + result);

        boolean isFalse = false;
        if(isFalse = true)
            System.out.println("is false");

    int newValue = 50;
    if(newValue == 50)
        System.out.println("This is true");

     double doubleVar = 20;
     double secDoubleVar = 80;
     double sum = (doubleVar + secDoubleVar) * 25;
     double rem = (sum % 40);

     if(rem <= 20)
         System.out.println("Total was over the limit");

    }
}
