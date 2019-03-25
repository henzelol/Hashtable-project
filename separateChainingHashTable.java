package hashaplication;

public class separateChainingHashTable {

    private LinkedList[] theLists;

    private static final int DEFAULT_TABLE_SIZE = 101;

    public separateChainingHashTable() {
        this(DEFAULT_TABLE_SIZE);
    }

    public separateChainingHashTable(int size) {
        theLists = new LinkedList[nextPrime(size)]; // Garante que o tamanho Ã© primo
        for (int i = 0; i < theLists.length; i++) {
            theLists[i] = new LinkedList();
        }
    }

//    public void makeEmpty() {
   //     for (int i = 0; i < theLists.length; i++) {
      //      theLists[i].makeEmpty();
       // }
    //}

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

    // public void insert( Hashable x ) {
    //  LinkedList whichList = theLists[ x.hash(theLists.length ) ];
    //  if (whichList.indexOf(x)==-1)  // equals serÃ¡ usado aqui
    //  whichList.insert( x,0);
    //}
//Obs: a linha  whichList.insert( x, 0) insere x no inÃ­cio da lista. Elementos recÃ©m adicionados em uma tabela tÃªm a possibilidade maior de serem procurados!
//public void remove( Hashable x ) {
    //theLists[ x.hash( theLists.length )].removeElement(x);
//}
//public Hashable find( Hashable x ) {
    //return (Hashable)theLists[ x.hash(theLists.length)].find(x);  // equals serÃ¡ usado aqui
//}
    private static class LinkedList {

        public LinkedList() {
        }

    }

}
