
package Aula_02_vetor;

import static Aula_01_vetor.ex_01_buscaLinear.buscaLinear;
import static Aula_01_vetor.ex_04_inverter.exibeVetor;
import static Aula_01_vetor.ex_04_inverter.leInteiroPositivo;
import static Aula_01_vetor.ex_04_inverter.leVetorAleatorio;
import static Aula_02_vetor.ex_05_insercao.exibeVetorTam;

/**
 *
 * @author santa
 */
public class ex_8b_uniao {
    
    public static void main(String[]args){
        
        int n1 = leInteiroPositivo();
        int v1[] = leVetorAleatorio(n1);
        exibeVetor(v1);

        int n2 = leInteiroPositivo();
        int v2[] = leVetorAleatorio(n2);
        exibeVetor(v2);
        
        int uniao[]= new int[n1+n2];
        
        int n3 = uniao2vetores(v1, v2, uniao);
        
       exibeVetorTam(uniao, n3);
        
        
        
    }
    
    public static int uniao2vetores(int[] v1, int[] v2, int[] uniao) {
        int k = 0;
        
        for (int i = 0; i < v1.length; i++) {
            uniao[k] = v1[i];
            k++;
        }

        for (int i = 0; i < v2.length; i++) {

            if (!buscaLinear(v1, v2[i])) {
                uniao[k] = v2[i];
                k++;
            }

        }
        return k;
    }
    
}
