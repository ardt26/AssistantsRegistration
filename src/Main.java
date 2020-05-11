import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nim, nama, back;
        int banyak, nilai[] = new int[4];
        do{
            try{
                System.out.println("MENU FORM PENDAFTARAN");
                System.out.println("1. Asisten Laboratorium");
                System.out.println("2. Admin Laboratorium");
                System.out.print("Pilih Jenis Form : ");
                int pilih = scanner.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.println("\nFORM PENDAFTARAN ASISTEN LABORATORIUM");
                        System.out.print("Berapa data yang akan di inputkan : ");
                        banyak = scanner.nextInt();
                        for (int i = 0; i < banyak; i++) {
                            scanner.nextLine();
                            System.out.print("Input NIM\t: ");
                            nim = scanner.nextLine();
                            System.out.print("Input Nama\t: ");
                            nama = scanner.nextLine();
                            System.out.print("Input Nilai Tes Tulis\t\t\t: ");
                            nilai[0] = scanner.nextInt();
                            System.out.print("Input Nilai Tes Coding\t\t\t: ");
                            nilai[1] = scanner.nextInt();
                            System.out.print("Input Nilai Tes Wawancara\t\t: ");
                            nilai[2] = scanner.nextInt();
                            System.out.print("Input Nilai Tes Microteaching\t: ");
                            nilai[3] = scanner.nextInt();
                            DaftarAslab aslab = new DaftarAslab(nama, nim, nilai);
                            aslab.pengecekan();
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.println("\nFORM PENDAFTARAN ADMIN LABORATORIUM");
                        System.out.print("Berapa data yang akan di inputkan : ");
                        banyak = scanner.nextInt();
                        for (int i = 0; i < banyak; i++) {
                            scanner.nextLine();
                            System.out.print("Input NIM\t: ");
                            nim = scanner.nextLine();
                            System.out.print("Input Nama\t: ");
                            nama = scanner.nextLine();
                            System.out.print("Input Nilai Tes Tulis\t\t: ");
                            nilai[0] = scanner.nextInt();
                            System.out.print("Input Nilai Tes Coding\t\t: ");
                            nilai[1] = scanner.nextInt();
                            System.out.print("Input Nilai Tes Wawancara\t: ");
                            nilai[2] = scanner.nextInt();
                            System.out.print("Input Nilai Tes Jaringan\t: ");
                            nilai[3] = scanner.nextInt();
                            DaftarAdmin admin = new DaftarAdmin(nama, nim, nilai);
                            admin.pengecekan();
                            System.out.println();
                        }
                        break;
                }
            }catch (Exception e2){
                System.err.println("Input Harus Bilangan Bulat");
            }finally {
                scanner.nextLine();
                System.out.print("Kembali ke menu utama? (y/n) : ");
                back = scanner.nextLine().toLowerCase();
                System.out.println();
            }
        }while(back.equals("y"));
    }
}