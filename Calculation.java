package com.company;

public class Calculation {
    public static Arabic sum(Arabic n1, Arabic n2){
        return new Arabic(n1.toInt()+n2.toInt());
    }

    public static Roman sum(Roman n1, Roman n2) throws Exception{
        return new Roman(n1.toInt()+n2.toInt());
    }

    public static Arabic sub(Arabic n1, Arabic n2){
        return new Arabic(n1.toInt()-n2.toInt());
    }

    public static Roman sub(Roman n1, Roman n2)throws Exception{
        return new Roman(n1.toInt()-n2.toInt());
    }

    public static Arabic mul(Arabic n1, Arabic n2){
        return new Arabic(n1.toInt()*n2.toInt());
    }

    public static Roman mul(Roman n1, Roman n2) throws Exception{
        return new Roman(n1.toInt()*n2.toInt());
    }

    public static String div(Arabic n1, Arabic n2){
        if (n1.toInt() % n2.toInt() == 0)
            return String.valueOf(n1.toInt() / n2.toInt());
        else
            return String.valueOf((double) n1.toInt() / n2.toInt());
    }

    public static String div(Roman n1, Roman n2) throws Exception{
        if (n1.toInt() % n2.toInt() != 0)
            throw new Exception("No fractions in Roman numeral system!");
        else
            return new Roman(n1.toInt()/n2.toInt()).toString();
    }
}
