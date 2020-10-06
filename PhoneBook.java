import java.util.Scanner;

/**
 *
 * @author José Augusto Ramos Belmont
 */
public class PhoneBook {
    public static void main (String[] args){
        
        Scanner entra = new Scanner (System.in);
        int dec;
        System.out.println("Digite o nome da Agenda: ");
        Agenda agenda = new Agenda(entra.nextLine());
        
        do{
            System.out.println("Inserir na agenda --> 1");
            System.out.println("Imprimir a agenda --> 2");
            System.out.println("Buscar  na agenda --> 3");
            System.out.println("Sair              --> 9");
            dec = entra.nextInt();
            if (dec == 1){
                agenda.insereNaAgenda();
            }
            if (dec == 2){
                agenda.imprimeAgenda();
            }
            if (dec == 3){
                agenda.buscaContato();
            }

        }while (dec < 9);
    }
}

