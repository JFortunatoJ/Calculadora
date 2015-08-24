package com.example.joaob.calculadora;

/**
 * Created by joaob on 23/08/2015.
 */
public class Contas {
    public Contas(){
        this(0,0);
    }

    public Contas(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    private double num1;

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    private double num2;

    public String somar(){
        return "O resultado é: " + (getNum1() + getNum2());
    }

    public String subtrair(){
        return "O resultado é: " + (getNum1() - getNum2());
    }

    public String dividir(){
        if (num2 == 0) {
            return "Impossível divisão por 0(zero)";
        }else {
            return "O resultado é: " + (getNum1() / getNum2());
        }
    }

    public  String multiplicar(){
        return "O resultado é: " + (getNum1() * getNum2());
    }
}
