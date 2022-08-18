package aula3;

public class Estudante {
    private String nome;
    private String endereco;
    
    public Estudante(String nome){
        setNome(nome);
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
