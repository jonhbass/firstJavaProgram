/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;
/**
 * @author jbmai
 */

import java.util.Scanner;

public class GerenciaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingApp bankingApp = new BankingApp();

        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> bankingApp.setPersonalData();
                case 2 -> bankingApp.checkBalance();
                case 3 -> bankingApp.deposit();
                case 4 -> bankingApp.withdraw();
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (choice != 5);

        System.out.println("Obrigado por utilizar o sistema. Até logo!");
    }

    private static void displayMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Informar dados pessoais");
        System.out.println("2. Consultar saldo");
        System.out.println("3. Realizar depósito");
        System.out.println("4. Realizar retirada");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }
}

class BankingApp {
    private double balance;

    public void setPersonalData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        scanner.nextLine();
        System.out.print("Digite o sobrenome: ");
        scanner.nextLine();
        System.out.print("Digite o CPF: ");
        scanner.nextLine();
        System.out.println("Dados pessoais atualizados.");
    }

    public void checkBalance() {
        System.out.println("Saldo atual: R$" + balance);
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do depósito: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Depósito realizado. Novo saldo: R$" + balance);
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da retirada: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Saldo insuficiente.");
        } else {
            balance -= amount;
            System.out.println("Retirada realizada. Novo saldo: R$" + balance);
        }
    }
}

