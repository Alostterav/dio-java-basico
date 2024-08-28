import java.util.Random;
import java.util.Scanner;

public class LacoWhile {
    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);
        System.out.println("Seu saldo: ");
        float saldo = input.nextFloat();
        float compra = 0.0f;
        input.close();

        Random random = new Random();
        
        while (compra < saldo) {
            if(saldo<=0) {
                break;
            }
            compra = random.nextFloat();
            System.out.printf("R$: %.2f\n",compra*30);
            saldo -= compra*30;
        }
    }
}
