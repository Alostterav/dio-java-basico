package funcionalidades;

import java.util.Scanner;

public class NavegadorInternet extends Armazenamento {
    Scanner teclado = new Scanner(System.in);

    public void exibirPagina(String url){
        System.out.println("Exibindo a pagina ...");

        System.out.println("Quer baixar o conteúdo? S/N");
        char escolha = teclado.nextLine().charAt(0);
        if(escolha == 's'){
            downloads.add("download");
        }
        else {
            System.out.println("Tudo bem.");
        }
    };

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    };

    public void atualizarPagina(){
        System.out.println("Atualizando pagina ...");
    };

}
