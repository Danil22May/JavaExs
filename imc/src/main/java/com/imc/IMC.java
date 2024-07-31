package com.imc;

public class IMC {
    public static void main(String[] args) {
        double weight = 70;
        double height = 1.81;

        double imc = calcularIMC(height, weight);
        System.out.println(Math.round(imc));
        diagnosis(imc);

    }

    public static double calcularIMC(double height, double weight) {
        return weight / (height * height);
    }

    public static void diagnosis(double imc) {
        if (imc < 16) {
            System.out.println("Delgadez severa");
        } else if (imc <= 17) {
            System.out.println("Delgadez moderada");
        } else if (imc <= 18.5) {
            System.out.println("Delgadez leve");
        } else if (imc <= 25) {
            System.out.println("Peso normal");
        } else if (imc <= 30) {
            System.out.println("Sobrepeso");
        } else if (imc <= 35) {
            System.out.println("Obesidad leve");
        } else if (imc < 40) {
            System.out.println("Obesidad moderada");
        } else if (imc >= 40) {
            System.out.println("Obesidad morbida");
        }

    }
}
