import java.util.Scanner;

/**
 *
 * @author José Augusto Ramos Belmont
 */
public class Agenda {
    private Pessoa [] contatos = new Pessoa[100];
    private String nomeDaAgenda;
    private int indice = 0;
    Scanner entra = new Scanner (System.in);
    
    Agenda (String nomeDaAgenda){
        this.nomeDaAgenda = nomeDaAgenda;
    }
    
    public void insereNaAgenda (){
        String nome, telefone;
        System.out.println("entre o nome: ");
        nome = entra.nextLine();
        System.out.println("entre o telefone: ");
        telefone = entra.nextLine();
        Pessoa nova = new Pessoa(nome,telefone);
        contatos [indice] = nova;
        indice++; 
    }
    
    public String getNomeDaAgenda(){
        return this.nomeDaAgenda;
    }
    
    public void setNomeDaAgenda(String nomeDaAgenda){
        this.nomeDaAgenda = nomeDaAgenda;
    }
    
    public void imprimeAgenda(){
        System.out.println();
        System.out.println("Nome da Agenda: " + nomeDaAgenda);
        for (int i=0; i<indice; i++){
            System.out.println("nome: " + contatos[i].getNome() + "  telefone: "+ contatos[i].getTelefone());
        }
        System.out.println();
    }
    
    public void buscaContato(){
        String procura;
        boolean flag = false;
        System.out.println();
        System.out.println("Nome para procura: ");
        procura = entra.nextLine();
        for (int i=0; i<indice; i++){
            if (procura.compareTo(contatos[i].getNome()) == 0){
                System.out.println("nome: "+procura+" --> tel.: "+contatos[i].getTelefone());
                flag = true;
            }
        }
        if (!flag) System.out.println("Nome não encontrado");
    }
}

