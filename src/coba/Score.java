package coba;

import java.util.Scanner;

public class Score {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    static void run() {
        int jumlahMahasiswa;
        // Below are for average
        // double saver = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlahMahasiswa = sc.nextInt();

        double ips[] = new double[jumlahMahasiswa];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan IPS mahasiswa " + (i + 1) + " : ");
            ips[i] = sc.nextDouble();
        }

        System.out.println("\nMahasiswa   IPS   Jumlah SKS maks");
        System.out.println("=================================");
        for (int i = 0; i < ips.length; i++) {
            System.out.println("    " + (i + 1) + "\t    " + ips[i] + "\t\t" + jumlahSKS(ips[i]));
        }
        System.out.println("\nRata-rata IPS = " + rataIps(ips, jumlahMahasiswa));
        System.out.println("IPS tertinggi = " + ipsTertinggi(ips));
        System.out.println("IPS terendah  = " + ipsTerendah(ips));
    }

    static int jumlahSKS(double ips) {
        int sks = 0;
        if (ips > 2.75) {
            sks = 24;
        } else if (2.5 < ips && ips <= 2.75) {
            sks = 22;
        } else if (ips < 2.5) {
            sks = 20;
        }

        return sks;
    }

    static double rataIps(double[] totalIPS, int totalMahasiswa) {
        double saver = 0;
        for (int i = 0; i < totalMahasiswa; i++) {
            saver += totalIPS[i];
        }
        return saver / totalMahasiswa;
    }

    static double ipsTertinggi(double[] ips) {
        double min = ips[0], max = ips[0];
        for (int j = 0; j < ips.length; j++) {
            if (ips[j] > max) {
                max = ips[j];
            }
            if (ips[j] < min) {
                min = ips[j];
            }
        }
        return max;
    }

    static double ipsTerendah(double[] ips) {
        double min = ips[0], max = ips[0];
        for (int j = 0; j < ips.length; j++) {
            if (ips[j] > max) {
                max = ips[j];
            }
            if (ips[j] < min) {
                min = ips[j];
            }
        }
        return min;
    }
}
