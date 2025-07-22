package variablesEstaticas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Usuario user1 = new Usuario("george12", "12345", "george@gmail.com");
//        Usuario user2 = new Usuario("sheyla99", "12345", "sheyla@gmail.com");
//
//        Usuario.numUsers = 1;
//
//        user2.numUsers = 2;
//
//        System.out.println(user1.numUsers);
//
        double PI = Calculadora.PI;

        final double E = 2.7182818284590452354;

        Calculadora.pow(1,2);
        Calculadora.tan(2323.32f);

        Calculadora.sin(121.23f);
        // userPepito123 --> user_pepito_123 // cammel case, snake case
    }
}
