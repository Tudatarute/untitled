package java_text_book.chapter6.main;

import java_text_book.chapter6.calc.CalcLogic;

public class Clac {
    public  static  void main(String[] args){
        int a = 10; int b  = 2;
        int total = java_text_book.chapter6.calc.CalcLogic.tasu(a, b);
        int delta = java_text_book.chapter6.calc.CalcLogic.hiku(a, b);
        System.out.println("足すと"+ total + "、引くと" + delta);


    }
}
