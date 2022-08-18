package aula3;

public class Estudante {
    private String nome;
    private String endereco;
    private String RA;
    private int qtdAulas;
    
    public Estudante(String nome, String endereco, String RA, int qtdAulas){
        setNome(nome);
        setEndereco(endereco);
        setRA(RA);
        setQtdAulas(qtdAulas);
    }
    
    public String toString(){
        return getNome() + "\t" + getEndereco() + "\t" + getRA() + "\t" + getQtdAulas();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setRA(String RA){
        this.RA = RA;
    }
    public void setQtdAulas(int qtdAulas){
        this.qtdAulas = qtdAulas;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getRA(){
        return this.RA;
    }
    public int getQtdAulas(){
        return this.qtdAulas;
    }
}
