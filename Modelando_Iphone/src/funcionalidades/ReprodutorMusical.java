package funcionalidades;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ReprodutorMusical extends Armazenamento {
    //private String musica_escolhida = "nenhuma";
    private ArrayList<String> musicasFavoritas = new ArrayList<String>();
    private boolean musicaPausada = false;
    private String musicaAtual;


    // Funcionalidades básicas

    // Selecionando musica para tocar
    public void inciarReprodutorMusical() {

        ListIterator<String> iterator = listaMusicas.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("--- Lista de Reprodução ---");

        if(listaMusicas.isEmpty()){
            char escolha;
            System.out.println("Você não tem musicas :/\nDeseja adicionar musicas? s/n");
            escolha = scanner.nextLine().charAt(0);

            if(escolha == 's' || escolha == 'S'){
                adicionarMusica();
                System.out.println("Iniciar reprodução? s/n");
                escolha = scanner.nextLine().charAt(0);

                if(escolha == 's' || escolha == 'S'){
                    inciarReprodutorMusical();
                }
                else {
                    System.out.println("App Fechado!");
                }
            }
            else {
                System.out.println("App Fechado!");
            }
        }
        else {

            while (!exit) {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Próxima música");
                System.out.println("2. Música anterior");
                System.out.println("3. Escolher música");
                System.out.println("4. Pausar Musica");
                System.out.println("5. Retomar Musica");
                System.out.println("6. Adicionar Musica");
                System.out.println("7. Remover Musica");
                System.out.println("8. Exibir musicas Favoritas");
                System.out.println("9. Sair");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha

                switch (choice) {
                    case 1:
                        if (iterator.hasNext()) {
                            tocarMusica(iterator.next());
                        } else {
                            System.out.println("Você está na última música.");
                        }
                        break;
                    case 2:
                        if (iterator.hasPrevious()) {
                            tocarMusica(iterator.previous());
                        } else {
                            System.out.println("Você está na primeira música.");
                        }
                        break;
                    case 3:
                        System.out.println("Digite o nome da música:");
                        String musicaEscolhida = scanner.nextLine();

                        if (listaMusicas.contains(musicaEscolhida)) {
                            iterator = listaMusicas.listIterator(listaMusicas.indexOf(musicaEscolhida));
                            tocarMusica(iterator.next());
                        } else {
                            System.out.println("Música não encontrada.");
                        }
                        break;

                    case 4:
                        pausarMusica();
                        break;

                    case 5:
                        retomarMusica();
                        break;

                    case 6:
                        adicionarMusica();
                        break;

                    case 7:
                        removerMusica(iterator.next());
                        break;

                    case 8:
                        exibirMusicasFavoritas();
                        break;

                    case 9:
                        exit = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }

            scanner.close();

        }

    }

    // Colocando musica escolhida para tocar
    private void tocarMusica(String musica) {
        // numa classe de um app real aqui teria algumas bibliotecas usadas pra reproduzir
        // os determinados tipos de audio

        musicaAtual = musica;
        musicaPausada = false;
        System.out.printf("Tocando a  musica: %s\n", musica);

        Scanner sc = new Scanner(System.in);
        System.out.printf("Deseja adicionar %s em Favoritas? s/n\n", musica);
        char resposta = sc.nextLine().charAt(0);

        if(resposta == 's'){
            musicasFavoritas.add(musica);
            System.out.println("Favorita Adicionada!");
        } else {
            System.out.println("Entendido!");
        }

    }

    private void exibirMusicasFavoritas(){
        for(String musica: musicasFavoritas){
            System.out.printf(" - %s \n",musica);
        }
    }

    // Pausar musica
    private void pausarMusica() {
        if (musicaAtual != null && !musicaPausada) {
            musicaPausada = true;
            System.out.println("Música pausada: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música está tocando ou já está pausada.");
        }
    }

    // Retormar musica pausada
    private void retomarMusica() {
        if (musicaAtual != null && musicaPausada) {
            musicaPausada = false;
            System.out.println("Retomando: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música está pausada.");
        }
    }

    // Removendo musica
    private void removerMusica(String musica) {
         if (listaMusicas.contains(musica)){

            listaMusicas.remove(musica);
            System.out.printf("'%s' foi removido com sucesso!\n", musica);

            if (musicasFavoritas.contains(musica)){
                listaMusicas.remove(musica);
            }
         }
         else {
            System.out.println("Musica Inexistente");
         }
    }

    // Adicionando musica
    private void adicionarMusica() {

        Scanner scanner = new Scanner(System.in);

        String musica;
        char adicionar = 's';

        while (adicionar == 's') {

            System.out.print("Digite uma musica: ");
            musica = scanner.nextLine();

            listaMusicas.add(musica);

            System.out.print("Adicionar mais musica? s/n: ");
            adicionar = scanner.nextLine().charAt(0);

        }
    }
}
