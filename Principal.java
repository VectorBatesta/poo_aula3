package aula3;

/**
 *
 * @author a2104679
 */
public class Principal {

    public Principal(){
        Estudante joao = new Estudante("joao", "rua 12344", "123123", 10);
        Estudante marcos = new Estudante("marcos", "rua 1241", "616122", 5);
        Estudante manoLoco = new Estudante("MAAANO", "rua nenhum", "000000", 99999);
        //joao.setNome("joao");
        //System.out.println(joao.getNome());
        
        System.out.println(joao.toString());
        System.out.println(marcos.toString());
        System.out.println(manoLoco.toString());
    }
    
    public static void main(String[] args) {
        Principal objeto = new Principal();
    }
}
