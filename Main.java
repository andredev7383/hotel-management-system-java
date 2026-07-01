import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Quarto> quartos = new ArrayList<>();

        quartos.add(new Quarto(101));
        quartos.add(new Quarto(102));
        quartos.add(new Quarto(103));
        quartos.add(new Quarto(104));
        quartos.add(new Quarto(105));

        int opcao;

        do {

            System.out.println("\n===== HOTEL JAVA =====");
            System.out.println("1 - Fazer Check-in");
            System.out.println("2 - Fazer Check-out");
            System.out.println("3 - Listar Quartos");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome do hóspede: ");
                    String nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    Hospede hospede = new Hospede(nome, cpf);

                    System.out.print("Número do quarto: ");
                    int numero = scanner.nextInt();

                    boolean encontrado = false;

                    for (Quarto quarto : quartos) {

                        if (quarto.getNumero() == numero) {

                            encontrado = true;

                            if (!quarto.isOcupado()) {

                                quarto.fazerCheckIn(hospede);
                                System.out.println("Check-in realizado com sucesso!");

                            } else {

                                System.out.println("Quarto já está ocupado.");

                            }

                        }

                    }

                    if (!encontrado) {
                        System.out.println("Quarto não encontrado.");
                    }

                    break;

                case 2:

                    System.out.print("Número do quarto: ");
                    numero = scanner.nextInt();

                    encontrado = false;

                    for (Quarto quarto : quartos) {

                        if (quarto.getNumero() == numero) {

                            encontrado = true;

                            if (quarto.isOcupado()) {

                                quarto.fazerCheckOut();
                                System.out.println("Check-out realizado!");

                            } else {

                                System.out.println("Quarto já está vazio.");

                            }

                        }

                    }

                    if (!encontrado) {
                        System.out.println("Quarto não encontrado.");
                    }

                    break;

                case 3:

                    System.out.println("\n=== LISTA DE QUARTOS ===");

                    for (Quarto quarto : quartos) {
                        System.out.println(quarto);
                    }

                    break;

                case 4:

                    System.out.println("Encerrando o sistema...");

                    break;

                default:

                    System.out.println("Opção inválida.");

            }

        } while (opcao != 4);

        scanner.close();
    }
}
