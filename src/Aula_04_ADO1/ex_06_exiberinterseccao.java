package Aula_04_ADO1;

import static Aula_01_vetor.ex_01_buscaLinear.buscaLinear;
import static Aula_01_vetor.ex_04_inverter.exibeVetor;
import static Aula_01_vetor.ex_04_inverter.leInteiroPositivo;
import static Aula_01_vetor.ex_04_inverter.leVetorAleatorio;


/**
 *
 * @author santa
 */
public class ex_06_exiberinterseccao {

    public static void main(String[] args) {

        int n = leInteiroPositivo();
        int A[] = leVetorAleatorio(n);
        exibeVetor(A);
        bubblesort(A);
        exibeVetor(A);

        int B[] = leVetorAleatorio(n);
        bubblesort(B);
        exibeVetor(B);

        System.out.println("Os elementos das intersecção de A e B são: ");

        exibeInters2Vetores(A,B);
    }
    
    public static void exibeInters2Vetores(int[]A, int[]B){
        int i = 0;
        int j = 0;

        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                System.out.println(A[i] + " ");
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
    
    }

    public static int inter2Vetores(int[] v1, int[] v2, int[] inter) {
        int k = 0;

        //Percorrer o v1 e verificar se um elemento está no vetor v2
        for (int i = 0; i < v1.length; i++) {

            if (buscaLinear(v2, v1[i])) {
                inter[k] = v1[i];
                k++;
            }

        }
        return k;
    }

    //método com desempenho de O(n²)
    public static void bubblesort(int[] A) {

        for (int i = 0; i < A.length - 1; i++) { //(N-1 vezes)
            for (int j = 0; j < A.length - 1 - i; j++) { //Comparar 2 a 2 e trocar, se necessário
                if (A[j] > A[j + i]) {
                    troca(A, j, j + 1);
                }
            }
        }

    }

    public static void troca(int[] v, int posMenor, int posMaior) {

        int aux = v[posMenor];
        v[posMenor] = v[posMaior];
        v[posMaior] = aux;

    }

}
