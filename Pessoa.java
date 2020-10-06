/**
 *
 * @author José Augusto Ramos Belmont
 */
public class Pessoa {
    private String nome;
    private String telefone;
    
    Pessoa (String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
        
    public String getNome(){
        return this.nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
}