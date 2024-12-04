import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu Cofrinho ---");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em reais");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha a moeda:\n 1. Dolar \n 2. Euro \n 3. Real");
                    int tipoMoeda = scanner.nextInt();
                    System.out.print("Digite o valor (use ',' ou '.'): ");
                    String valorInput = scanner.next();

                    // Substituir vírgula por ponto para padronizar o valor como ponto decimal
                    valorInput = valorInput.replace(",", ".");
                    double valor = Double.parseDouble(valorInput); // Converte para double

                    Moeda moeda;
                    if (tipoMoeda == 1) {
                        moeda = new Dolar(valor);
                    } else if (tipoMoeda == 2) {
                        moeda = new Euro(valor);
                    } else {
                        moeda = new Real(valor);
                    }
                    cofrinho.adicionar(moeda);
                    System.out.println("Moeda adicionada com sucesso!");
                    break;

                case 2:
                    System.out.println("Escolha a moeda para remover:");
                    cofrinho.listagemMoedas();
                    System.out.print("Digite o índice da moeda a ser removida: ");
                    int indice = scanner.nextInt();

                    // Remover moeda pelo índice informado
                    if (indice >= 0 && indice < cofrinho.getListaMoedas().size()) {
                        Moeda removida = cofrinho.remover(indice);
                        System.out.println(removida.info() + " removida com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 3:
                    cofrinho.listagemMoedas();
                    break;

                case 4:
                    System.out.println("Total em reais: R$ " + cofrinho.totalConvertido());
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
