package ru.slastix.quadequationsolver.main;
import java.util.Scanner;

/**
 * Created by Kola on 06.04.15.
 */
public class quadequationsolver {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        double d, x1, x2;
        System.out.println("Эта программа вычисляет корни квадратного уравнения вида ax^2+bx+c=0");
        System.out.println("Введите коэффициент a: ");
        Scanner scan = new Scanner (System.in);
        a = scan.nextInt();
        System.out.println("Введите коэффициент b: ");
        b = scan.nextInt();
        System.out.println("Введите коэффициент c: ");
        c = scan.nextInt();
        if (a != 0) {
            System.out.println("Ваше уравнение: ("+a+")x^2+("+b+")x+("+c+")=0");
            d = (double)b * (double)b - 4 * (double)a * (double)c;
            if (d != 0) {
                if (d > 0) {
                    x1 = (-(double)b + Math.sqrt (d))/(2 * (double)a);
                    x2 = (-(double)b - Math.sqrt (d))/(2 * (double)a);
                    System.out.println("Корни этого уравнения равны: x1 = "+x1+", x2 = "+x2);
                } else {
                    double Re = - (double)b / (2 * (double)a);
                    System.out.println("Корней на множестве действительных чисел нет. Корни этого уравнения являются комплексными числами.");
                    System.out.println("x1 = "+Re+"+i"+(Math.sqrt (Math.abs(d))/(2*(double)a)));
                    System.out.println("x1 = "+Re+"-i"+(Math.sqrt (Math.abs(d))/(2*(double)a)));
                }
            } else {
                x1 = -(double)b / (2 * (double)a);
                System.out.println("Корни этого уравнения равны: x1 = "+x1+", x2 = "+x1);
            }
        } else System.out.println("Это уравнение не является квадратным (коэффициент 'a' не может равняться нулю)");

    }
}
