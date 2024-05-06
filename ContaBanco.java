package Conta;

import java.util.Scanner;

  public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("034-2");
        String agencia = scanner.nextLine();

        System.out.println("1041");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Arthur de Oliveira");
        String nomeCliente = scanner.nextLine();

        System.out.println("P524.24");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                           ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
  }    