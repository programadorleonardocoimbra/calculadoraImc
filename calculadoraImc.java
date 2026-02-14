
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
        double altura = scanner.nextDouble();

        
        
        // Calcular o IMC usando a fórmula: IMC = peso / (Peso * altura)
        double imc = peso / (altura * altura);

        
        
        // Comandos para exibir o resultado do IMC:
        System.out.printf("Seu IMC é: %.2f\n", imc);


        
        // Comandos para classificar o resultado do IMC:
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do Peso");
        } 
        
        else if ( imc < 25) {
            System.out.println("Classificação: Peso normal");
        }

        else if ( imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        }

        else if ( imc < 35) {
            System.out.println("Classificação: Obesidade GRAU I");
        }

        else if ( imc < 40) {
            System.out.println("Classificação: Obesidade GRAU II");
        }

        else{
            System.out.println("Classificação: Obesidade GRAU III");
        }

        
        // Fechar o scanner:
        scanner.close();


      
    }
    
}
