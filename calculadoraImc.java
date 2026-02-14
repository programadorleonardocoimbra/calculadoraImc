
import java.util.Scanner;

public class calculadoraImc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Exibir o título da calculadora:
        System.out.println("====== CALCULADORA DE IMC ======");

        // Comandos para entrada de dados por parte do usuário:
        // Solicitar o peso do usuário:
        System.out.print("Digite seu peso em (kg): ");
        double peso = scanner.nextDouble();

        // Solicitar a altura do usuário:
        System.out.print("Digite sua altura em (Metros): ");
        double peso = scanner.nextDouble();

        // Calcular o IMC usando a fórmula: IMC = peso / (altura * altura)
        double imc = peso / (altura * altura);

        // Comandos para exibir o resultado do IMC:
        System.out.printf("Seu IMC é: %.2f\n", imc);


        // Comandos para classificar o resultado do IMC:
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do Peso");
        } else if ( imc < 25) {
            System
        }

    
        }
      
    }
    
}
