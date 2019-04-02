package hashaplication;
/*
Trabalho feito for Henzel Almeida e Ana Virgínia
*/

import java.util.*;

public class SeparateChainingHashTable {

    private LinkedList[] theLists;

    private static final int DEFAULT_TABLE_SIZE = 100;

    public SeparateChainingHashTable() {
        this(DEFAULT_TABLE_SIZE);
    }

    public SeparateChainingHashTable(int size) {
        theLists = new LinkedList[nextPrime(size)]; // Garante que o tamanho Ã© primo
        for (int i = 0; i < theLists.length; i++) {
            theLists[i] = new LinkedList();
        }
    }

    public void makeEmpty() {
        for (int i = 0; i < theLists.length; i++) {
            theLists[i].clear();
        }
    }

    private static int nextPrime(int n) {
        if (n % 2 == 0) {
            n++;
        }
        for (; !isPrime(n); n += 2)
                ;
        return n;
    }

    private static boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        if (n == 1 || n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void insert(Hashable x) {
        LinkedList whichList = theLists[x.hash(theLists.length)];
        if (whichList.indexOf(x) == -1) 
        {
            whichList.add(0, x);
        }
    }
    
    public void printColision(){
        int colision_counter=0;
        int free_position=0;
        int size_list=0;
        for (int j = 0; j < theLists.length; j++) {
            size_list = theLists[j].size();
            if(size_list>=2){
                System.out.println("colisão de: " + theLists[j].size() + " alunos  na posição: " + j );
                colision_counter+=size_list;
            }
            else if (size_list==0){
              //  System.out.println("Posição:" + j + " está vazia");
                free_position++;
            }

        }
        System.out.println("tivemos um total de :" + colision_counter + " colisões e um total de: " + free_position + " posições vazias");
    }

    public void remove(Hashable x) {
        theLists[x.hash(theLists.length)].pop();
    }

    
}

