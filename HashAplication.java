package hashaplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class HashAplication {
    

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        int counterNumber = 0;
        int counterName = 0;
        String linha;

        Aluno aluno[] = new Aluno[100];
        for (int i=0;i<100;i++){
            aluno[i] = new Aluno();
        }

        FileReader reader_numbers = new FileReader("C:/HASH_NUMBERS.csv");
        BufferedReader leitor_numbers = new BufferedReader(reader_numbers);

        FileReader reader_names = new FileReader("C:/HASH_NAMES.csv");
        BufferedReader leitor_names = new BufferedReader(reader_names);

        while ((linha = leitor_numbers.readLine()) != null) {
                aluno[counterNumber].setMatricula(linha);
                counterNumber++;
        }
   
        while ((linha = leitor_names.readLine()) != null) {
            aluno[counterName].setNome(linha);
            counterName++;

        }
        for (int i = 0; i < 100; i++) {
            System.out.println(aluno[i].getNome());
            System.out.println(aluno[i].getMatricula());
           
        }
        leitor_numbers.close();
        leitor_names.close();
    }

}
