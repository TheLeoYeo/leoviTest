package com.company;

public class Binary {
    private String number;
    private int type;

    public Binary(String num,String t){
        number=num;
        String[] types = {"us", "s", "oc", "tc"};
        int i = 0;
        while(i<types.length && t!=types[i]){
            i=i+1;
        }
        type=i % types.length;
    }

    public String getNumber(){
        return number;
    }

    public int getType(){
        return type;
    }

    public void changeNumber(String num){
        number=num;
    }

    public int length(){
        return number.length();
    }

}
