package hashaplication;

import java.io.*;
/*
Trabalho feito for Henzel Almeida e Ana Virgínia
*/
public class Hashaplication {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int table_size = 101;
        
        File file = new File("C:\\Users\\HENZELALMEIDADOSSANT\\Documents\\HashAluno.csv");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String linha;
        String matricula[] = new String[table_size];
        String nome[] = new String[table_size];
        Aluno alunos[] = new Aluno[table_size];
        SeparateChainingHashTable Hashtable = new SeparateChainingHashTable(100);

        for (int i = 0; (linha = br.readLine()) != null; i++) {
            for (int j = 0; j < linha.indexOf(';'); j++) {
                if (j == 0) {
                    matricula[i] = "" + linha.charAt(j);
                } else {
                    matricula[i] = matricula[i] + linha.charAt(j);
                }
            }
            for (int j = linha.indexOf(';') + 1; j < linha.length(); j++) {
                if (j == linha.indexOf(';') + 1) {
                    nome[i] = "" + linha.charAt(j);
                } else {
                    nome[i] = nome[i] + linha.charAt(j);
                }
            }
            alunos[i] = new Aluno(nome[i], matricula[i]);
            
            Hashtable.insert(alunos[i]);
        }
        Hashtable.printColision();
        Hashtable.remove(alunos[0]);
        Hashtable.remove(alunos[1]);
        Hashtable.remove(alunos[2]);
        Hashtable.remove(alunos[3]);
        System.out.println("--------------------------------------");
         Hashtable.printColision();        
    }
}
