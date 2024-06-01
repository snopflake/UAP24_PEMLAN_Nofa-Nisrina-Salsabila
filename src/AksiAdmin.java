import java.util.Scanner;

public class AksiAdmin extends Aksi {
    @Override
    public void tampilanAksi() {
        System.out.println("Aksi Admin:");
        System.out.println("1. Tambah Film");
        System.out.println("2. Lihat List Film");
        System.out.println("3. Logout");
        System.out.println("4. Tutup Aplikasi");
    }

    @Override
    public void keluar() {
        Akun.logout();
        System.out.println("Anda telah logout.");
    }

    @Override
    public void tutupAplikasi() {
        System.out.println("Aplikasi ditutup.");
        System.exit(0);
    }

    //INI METHOD LIHAT FILM (ADMIN)
    @Override
    public void lihatListFilm() {
        //Menampilkan daftar film
        System.out.println("Daftar Film:");
        for (Film film : Film.getFilms().values()) {
            System.out.println("Nama: " + film.getName() + " - Deskripsi: " + film.getDescription() +
                    " - Harga: " + film.getPrice() + " - Stok: " + film.getStock());
        }
    }

    //INI METHOD TAMBAH FILM (ADMIN)
    public void tambahFilm() {
        Scanner scanner = new Scanner(System.in);

        //Sesi input buat si admin
        System.out.print("Nama Film: ");
        String nama = scanner.nextLine();
        System.out.print("Deskripsi Film: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Harga Tiket: ");
        double harga = scanner.nextDouble();
        System.out.print("Stok Tiket: ");
        int stok = scanner.nextInt();
        scanner.nextLine();

        //Menambahkan film yang didaftarkan
        Film.addFilm(nama, deskripsi, harga, stok);
    }
}
