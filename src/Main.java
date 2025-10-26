import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SmartThermostat smartThermostat = new SmartThermostat();
        int option;

        do{
            System.out.println("=== MENU ===");
            System.out.println("1 - Aumentar temperatura");
            System.out.println("2 - Diminuir temperatura");
            System.out.println("3 - Visualizar temperatura atual");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");
            option = scanner.nextInt();

            switch (option){
                case 1 -> smartThermostat.increaseTemperature();
                case 2 -> smartThermostat.decreaseTemperature();
                case 3 -> {
                    System.out.println("Temperatura atual: " + smartThermostat.getTemperature() + " graus Celsius.");
                }
                case 0 -> {
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida");
            }
        } while(true);
    }
}
