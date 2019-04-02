
package hashaplication;
/*
Trabalho feito for Henzel Almeida e Ana Virgínia
*/

public class Aluno  implements Hashable {

    private String matricula;
    private String nome;

    public Aluno() {
        String[] matricula = null;
        String[] nome = null;

    }

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int hash(int tablesize){
        int hashvalue = 0; 
        hashvalue = matricula.hashCode()%tablesize;
        if(hashvalue<0){
            hashvalue+=tablesize;
        }
        return hashvalue;
    }

}
