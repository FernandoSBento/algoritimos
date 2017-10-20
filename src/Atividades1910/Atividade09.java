package Atividades1910;

import java.util.Random;
import java.util.Scanner;

public class Atividade09 {

    public static int digite() {
        Scanner e = new Scanner(System.in);

        e.nextInt();
        int n = 0;

        return n;
    }

    public static int PedirNumero() {
        Scanner e = new Scanner(System.in);
        int n = 0;

        System.out.println("Digite um numero: ");
        n = e.nextInt();

        return n;
    }

    public static int Gerador() {
        Scanner e = new Scanner(System.in);
        Random r = new Random();

        int v = 0;
        int n = 0;
        System.out.println("Digite um valor ");
        v = e.nextInt();

        n = r.nextInt(v);
        System.out.println(n);

        return n;
    }

    public static String Mes() {
        //Scanner e = new Scanner(System.in);
        int n;
        //String mes;
        //System.out.println("Digite ");
        n = PedirNumero();

        if (n == 1) {
            return "Janeiro";
        } else if (n == 2) {
            return "Fevereiro";
        } else if (n == 3) {
            return "Março";
        } else if (n == 4) {
            return "Abril";
        } else if (n == 5) {
            return "Maio";
        } else if (n == 6) {
            return "Junho";
        } else if (n == 7) {
            return "Julho";
        } else if (n == 8) {
            return "Agosto";
        } else if (n == 9) {
            return "Setembro";
        } else if (n == 10) {
            return "Outubro";
        } else if (n == 11) {
            return "Novembro";
        } else if (n == 12) {
            return "Dezembro";
        } else {
            return "Numero inválido";
        }

        
    }

    public static int fatorial() {
        int n = 0;

        System.out.println("Valor");
        n = PedirNumero();

        return n;
    }

    public static void main(String[] args) {

        Mes();

    }
}
