

public class SwitchCase {
    public static void main(String[] args) {
        
        String resposta = "g";

        switch (resposta) {

            case "p": {
                System.out.println("Roupa pequena");
                break;
            }
            case "g": {
                System.out.println("Roupa grande");
                break;
            }
            case "gg": {
                System.out.println("Roupa Extra-grande");
                break;
            }

            default: {
                System.out.println("Opção não encontrada");
                break;
            }



        }
        
    }
}
