import java.util.Scanner;

/**
 * Created by armia on 2/15/2017.
 */
import java.util.Scanner;


public class Atest {


    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);

        String[] funcionario = new String[10];

        int i;

        for (i=0;i<10;i++) {

            System.out.println("nome do funcionario\n");
            funcionario[i] = reader.nextLine();

        }
        for (i=0;i<10;i++) {

            System.out.println(funcionario[i]);

        }
    }
}