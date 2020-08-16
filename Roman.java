package com.company;

public class Roman {

    private int value;

    public Roman(String str) throws Exception {
        if (isNotRoman(str))
            throw new Exception("Incorrect input!");
        else
            toArabicInput(str);
    }

    public Roman(int val) throws Exception{
        if (val<1) throw new Exception("No zero and negative numbers in Roman numeral system!");
        else value = val;
    }

    private void toArabicInput(String str) throws Exception {
        int ind1_v = str.indexOf("V");
        int ind1_x = str.indexOf("X");

        if (ind1_x == -1 && ind1_v == -1)
            value = str.length();
        else if (ind1_v > -1 && ind1_x >-1)
            throw new Exception("Too big input number!");

        else {
            if (ind1_v == 0)
                value = 5 + str.length() - 1;
            else if (ind1_v == 1)
                value = 5 - 1;
            else if (str.equals("X") )
                value = 10;
            else if (ind1_x == 1)
                value = 10 - 1;
            else
                throw new Exception("Too big input number!");
        }
    }

    public String toString()
    {
        int ten = this.value / 10;
        int one = this.value % 10;
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};

        return tens[ten] + ones[one];
    }

    public int toInt(){
        return value;
    }

    private static boolean isNotRoman(String str) {
        String roman = "IVIIIX";

        return !roman.contains(str);
    }

}
