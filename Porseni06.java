import java.util.Scanner;

public class Porseni06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahCabor = 4;  
        int jumlahAtlet = 5;   

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine(); 

        System.out.println("\n=== Daftar Atlet Porseni ===");

        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.print("Masukkan nama Politeknik ke-" + (i + 1) + ": ");
            String namaPoliteknik = sc.nextLine();

            System.out.println("Politeknik: " + namaPoliteknik);

            for (int j = 0; j < jumlahCabor; j++) {
                System.out.print("Masukkan nama cabang olahraga ke-" + (j + 1)+ " (Badminton/Tenis Meja/Basket/Bola Voli) " + ": ");
                String namaCabor = sc.nextLine();
                
                System.out.println("Cabang Olahraga: " + namaCabor);

                for (int k = 0; k < jumlahAtlet; k++) {
                    System.out.print("Masukkan nama atlet ke-" + (k + 1) + ": ");
                    String namaAtlet = sc.nextLine();
                    System.out.println("- Atlet ke-" + (k + 1) + ": " + namaAtlet);
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
