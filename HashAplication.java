
package hashaplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class HashAplication {
    public static void main(String[] args) throws FileNotFoundException, IOException {
    
  String linha;
  
  Aluno aluno = new Aluno();
  
  FileReader reader_numbers = new FileReader("C:/HASH_NUMBERS.csv");
  BufferedReader leitor_numbers = new BufferedReader(reader_numbers);
  

  FileReader reader_names = new FileReader("C:/HASH_NAMES.csv");
  BufferedReader leitor_names = new BufferedReader(reader_names);
  
  while ((linha = leitor_numbers.readLine()) != null) {
      aluno.setMatricula(linha);
      System.out.println(aluno.getMatricula());
      
  }
  leitor_numbers.close();
  leitor_names.close();
}

    

}
 


