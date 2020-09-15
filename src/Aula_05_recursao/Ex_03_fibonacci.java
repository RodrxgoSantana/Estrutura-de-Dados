/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_recursao;

/**
 *
 * @author santa
 */
public class Ex_03_fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int fib(int n) {
        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);

    }

}
