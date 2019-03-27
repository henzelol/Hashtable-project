package hashaplication;

import java.io.*;

public class Hashaplication {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int table_size = 100;
        
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
            // IMPLEMENTAR HASH
            alunos[i] = new Aluno(nome[i], matricula[i]);
            int  vari = 0;
            vari = alunos[i].hash(table_size);
            System.out.println(vari);
      //      Hashtable.insert(alunos[i]);
            
        //    System.out.println(alunos[i].getMatricula() + "\t" + alunos[i].getNome());
        }

//        int counterNumber = 0;
//        int counterName = 0;
//        String linha;
//
//        Aluno aluno[] = new Aluno[100];
//        for (int i=0;i<100;i++){
//            aluno[i] = new Aluno();
//        }
//
//        FileReader reader_numbers = new FileReader("C:/HASH_NUMBERS.csv");
//        BufferedReader leitor_numbers = new BufferedReader(reader_numbers);
//
//        FileReader reader_names = new FileReader("C:/HASH_NAMES.csv");
//        BufferedReader leitor_names = new BufferedReader(reader_names);
//
//        while ((linha = leitor_numbers.readLine()) != null) {
//                aluno[counterNumber].setMatricula(linha);
//                counterNumber++;
//        }
//   
//        while ((linha = leitor_names.readLine()) != null) {
//            aluno[counterName].setNome(linha);
//            counterName++;
//
//        }
//        for (int i = 0; i < 100; i++) {
//            System.out.println(aluno[i].getNome());
//            System.out.println(aluno[i].getMatricula());
//           
    }
}
