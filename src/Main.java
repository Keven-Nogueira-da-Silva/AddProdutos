import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produtos> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        produtos.add(new Produtos("Madeira ", 32, 10.21));
        produtos.add(new Produtos("Cimento ", 20, 25.50));
        produtos.add(new Produtos("Areia ", 50, 8.30));

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("""
                    1 - Listar Produtos
                    2 - Adicionar Estoque
                    3 - Remover Estoque
                    0 - Sair""");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    for (Produtos p : produtos) {
                        System.out.println(p);
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do produto: ");
                    sc.nextLine();
                    String nomeAdd = sc.nextLine();
                    System.out.print("Quantidade a adicionar: ");
                    int qtdAdd = sc.nextInt();
                    for (Produtos p : produtos) {
                        if (p.getProduto().equalsIgnoreCase(nomeAdd)) {
                            p.adicionarProduto(qtdAdd);
                            System.out.println("Estoque atualizado!");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do produto: ");
                    sc.nextLine();
                    String nomeRem = sc.nextLine();
                    System.out.print("Quantidade para remover: ");
                    int qtdRem = sc.nextInt();
                    for (Produtos p : produtos) {
                        if (p.getProduto().equalsIgnoreCase(nomeRem)) {
                            p.removerProduto(qtdRem);
                            System.out.println("Estoque atualizado!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
