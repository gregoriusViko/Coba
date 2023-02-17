package pbo.praktek;
public class reviewAlpro {
    public static void main(String[] args) {
        double[] curahHujan = {50, 70, 110, 80, 90, 130, 190, 240, 290, 310,
            280, 350, 390, 330, 280, 240, 244, 190, 230, 170, 100, 130, 80, 40,
            50, 70, 30, 80, 120, 190};
        
        tampilkanInfo(curahHujan);
        double rata2CurahHujan = ratHujan(curahHujan);
        System.out.println("Rata-rata curah hujan  = " + rata2CurahHujan);
        System.out.println("Kategori curah hujan = " + kategoriHujan(rata2CurahHujan));
        tinggiRendah(curahHujan);
        System.out.println("Jumlah hari dengan curah hujan tertinggi : " + jumlahCurahGolTinggi(curahHujan));
    }

    static double ratHujan(double[] curahHujan) {
        double total = 0;
        for (double i : curahHujan) {
            total += i;

        }
        double curahBiji = curahHujan.length;
        double ratHujan = total / curahBiji;
        return ratHujan;
    }

    static String kategoriHujan(double ratHujan) {
        String kategori = null;
        if (ratHujan >= 0 && ratHujan < 100) {
            kategori = "rendah";
        } else if (ratHujan >= 100 && ratHujan < 300) {
            kategori = "sedang";
        } else if (ratHujan >= 300 && ratHujan < 500) {
            kategori = "tinggi";
        }
        return kategori;

    }

    static void tampilkanInfo(double[] datHujan) {
        System.out.println("No\s\sCurah Hujan");
        System.out.println("===================");
        for (int i = 0; i < datHujan.length; i++) {
            System.out.println((i + 1) + "\t" + datHujan[i]);
        }
    }

    static int jumlahCurahGolTinggi(double[] data) {
        int jmlh = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 300) {
                jmlh++;
            }
        }
        return jmlh;
    }
    static void tinggiRendah(double [] data){
        double rendah = data[0], tinggi = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i]<rendah) {
                rendah = data[i];
            }
            if (data [i] > tinggi){
                tinggi = data[i];
            }
        }
        System.out.println("Curah hujan tertinggi dalam satu bulan :"+ tinggi);
        System.out.println("Curah hujan terendah dalam satu bulan :"+ rendah);
    }
}
