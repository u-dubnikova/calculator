package com.company;

public class Arabic {

    public static boolean isArabic(String str) {
        return str.matches("[1-9]") || str.equals("10");
    }

    private int value;

    public Arabic(String str)
    {
        value = Integer.parseInt(str);
    }

    public Arabic(int val)
    {
        value = val;
    }

    public int toInt()
    {
        return value;
    }

    public String toString(){
        return String.valueOf(this.value);
    }
}
