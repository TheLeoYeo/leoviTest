package com.company;

public class Adder {
    public int add(int num1, int num2) {
        return num1+num2;

        /*int maxLen = num1.length();
        if(num1.length()<num2.length()) {
            maxLen=num2.length();
        }

        int i=maxLen;
        while(i>0){
            i=i-1;
        }
        String result="";*/
    }

    public Binary add(Binary num1, Binary num2,String t){
        Binary result = new Binary("0",t);
        if(num1.getNumber() =="1" && num2.getNumber() =="1"){
            result=new Binary("10",t);
        }
        return result;
    }
}

