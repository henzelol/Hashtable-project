/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashaplication;

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
        return hashvalue;
    }

}
