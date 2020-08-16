package com.company;

public class Calculator {
    private String result;

    public static void checkParts(int length) throws Exception {
        if (length != 3)
            throw new Exception("Incorrect input format!");
    }

    public static int operations(String str) throws Exception {
        switch(str) {
            case ("+"):
                return 1;
            case ("-"):
                return 2;
            case ("*"):
                return 3;
            case ("/"):
                return 4;
            default:
                throw new Exception("Wrong operation symbol!");
        }
    }

    Calculator(String str) throws Exception{
        String[] arr = str.split(" ");

        checkParts(arr.length);

        boolean isMixed = Arabic.isArabic(arr[0])^ Arabic.isArabic(arr[2]);
        int operation = operations(arr[1]);

        if (isMixed)
            throw new Exception("Incorrect input format!");

        if (Arabic.isArabic(arr[0])){
            Arabic num1 = new Arabic(arr[0]);
            Arabic num2 = new Arabic(arr[2]);
            Arabic res = new Arabic(1);
            switch (operation){
                case 1:
                    result = Calculation.sum(num1,num2).toString();
                    break;
                case 2:
                    result = Calculation.sub(num1,num2).toString();
                    break;
                case 3:
                    result = Calculation.mul(num1,num2).toString();
                    break;
                case 4:
                    result = Calculation.div(num1, num2);
                    break;
            }
        }
        else {
            Roman num1 = new Roman(arr[0]);
            Roman num2 = new Roman(arr[2]);

            switch (operation){
                case 1:
                    result = Calculation.sum(num1,num2).toString();
                    break;
                case 2:
                    result = Calculation.sub(num1,num2).toString();
                    break;
                case 3:
                    result = Calculation.mul(num1,num2).toString();
                    break;
                case 4:
                    result = Calculation.div(num1, num2);
                    break;
            }
        }
    }

    public String getResult(){
        return result;
    }
}
