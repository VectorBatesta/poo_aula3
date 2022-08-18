package aula3;

/**
 *
 * @author a2104679
 */
public class Principal {

    public Principal(){
        Estudante joao = new Estudante("joao");
        //joao.setNome("joao");
        System.out.println(joao.getNome());
    }
    
    public static void main(String[] args) {
        Principal objeto = new Principal();
        
    }
    
}
