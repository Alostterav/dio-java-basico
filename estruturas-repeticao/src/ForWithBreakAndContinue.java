public class ForWithBreakAndContinue {
    public static void main(String[] args) {

        //usando o continue 
        for (int numero = 1; numero < 11; numero++){
            if (numero == 6){
                continue;
            }
            else {
                System.out.println("--: "+numero);
            }
        }

        //usando o break
        for (int numero = 1; numero < 11; numero++){
            if (numero == 6){
                break;
            }
            else {
                System.out.println("--: "+numero);
            }
        }
    }
}
