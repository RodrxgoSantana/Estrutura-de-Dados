package Aula_02_vetor;

import static Aula_01_vetor.ex_04_inverter.exibeVetor;
import static Aula_01_vetor.ex_04_inverter.leInteiroPositivo;
import static Aula_01_vetor.ex_04_inverter.leVetorAleatorio;

public class ex_02_maiorNum {

    public static void main(String[] args) {
      int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        int posMaior = maiorVetor(v);
        System.out.printf("\n O maior elemento está na posição = %d", posMaior);
        System.out.printf("\n O maior elemento = %d", v[posMaior]);
        
    }

    public static int maiorVetor(int[] v) {
        int posMaior = 0;
        
        for (int i=1; i<v.length; i++){
            if(v[i] > v[posMaior]) { 
                posMaior = i; 
            }
        }
        return posMaior;
    }

    }

