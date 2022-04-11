package ro.fasttrackit.lab8.tema2;

import java.util.Scanner;

public class Ing implements Bank{
    public String bankName;
    public int suma;
    public int retras;

    public Ing(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String deposit() {
        Scanner scanner = new Scanner(System.in);
        int suma = scanner.nextInt();
        return "Ati depus suma de " + suma + " lei in banca " + bankName;
    }

    @Override
    public String withdraw() {
        Scanner scanner = new Scanner(System.in);
        int retras = scanner.nextInt();
        return "Ati retras suma de " + retras +" lei din banca " + bankName;
    }
}
