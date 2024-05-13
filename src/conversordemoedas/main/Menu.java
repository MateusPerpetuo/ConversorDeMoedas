package conversordemoedas.main;

import conversordemoedas.utils.ConvertCurrency;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    double amountToConvert;


    public void showMenu () {

        Scanner scan = new Scanner(System.in);
        double amountToConvert;
        int choice;

        do {
            System.out.println(menu());
            choice = scan.nextInt();

            switch (choice) {
                case 1:

                    ConvertCurrency.checkConvertionRate("USD", "BRL", scan);

                    break;
                case 2:
//                    Conversor.converterMoeda("BRL", "USD", scan);
//                    break;
//                case 3:
//                    Conversor.converterMoeda("USD", "ARS", scan);
//                    break;
//                case 4:
//                    Conversor.converterMoeda("ARS", "USD", scan);
//                    break;
//                case 5:
//                    Conversor.converterMoeda("USD", "COP", scan);
//                    break;
//                case 6:
//                    Conversor.converterMoeda("COP", "USD", scan);
//                    break;
//                case 7:
//                    DigitarMoeda.digitar(scan);
//                    break;
//                case 8:
//                    System.out.println("Saindo...");
//                    break;
                default:
                    System.out.println("*********************** - ERRO - *******************************");
                    System.out.println("Opção inválida.");
                    System.out.println("****************************************************************");

                    // Após exibir o resultado, aguarda a entrada do usuário para retornar ao menu principal
                    System.out.println("\nPressione Enter para voltar ao menu principal...");
                    scan.nextLine(); // Limpa o buffer
                    scan.nextLine(); // Aguarda a entrada do usuário
            }

        } while ( choice != 8);

        scan.close();
        System.exit(1);
    }
    private String menu(){
        String menu = """
                
                ****************************************************************
                
                ----------------------------------------------------------------
                
                         Seja bem-vindo(a) ao Conversor de Moedas!");

                ----------------------------------------------------------------
                
                1) Dólar >> Real Brasileiro
                2) Real Brasileiro =>> Dólar
                3) Dólar >> Peso Argentino
                4) Peso Argentino =>> Dólar
                5) Dólar >> Peso Colombiano
                6) Peso Colombiano =>> Dólar
                7) Digitar moeda de origem, destino e valor
                8) Sair

                Escolha uma opção válida:
                """;
        return menu;
    }

    private void amountToConvertMsg(){
        System.out.println("Digite o valor que deseja converter: ");
        amountToConvert = scan.nextDouble();
    }
}
