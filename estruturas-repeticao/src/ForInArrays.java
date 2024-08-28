public class ForInArrays {
    public static void main(String[] args) {
        String nomes[] = {"Juliao","pitisgrilo","bradockins","fannyquita"};

        for(int contador = 0; contador < nomes.length; contador++){
            System.out.println(nomes[contador]);
        }

        // mesmo loop usando o for each

        for (String nome: nomes){
            System.out.println(nome);
        }
    }


    
}
