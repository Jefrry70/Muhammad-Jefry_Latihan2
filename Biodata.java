public class Biodata {
    // Atribut
    private String namaLengkap;
    private String npm;
    private String programStudi;
    private int angkatan;

    // Constructor
    public Biodata(String namaLengkap, String npm, String programStudi, int angkatan) {
        this.namaLengkap = namaLengkap;
        this.npm = npm;
        this.programStudi = programStudi;
        this.angkatan = angkatan;
    }

    // Method untuk menampilkan biodata
    public void tampilkanBiodata() {
        System.out.println("Nama Lengkap  : " + namaLengkap);
        System.out.println("NPM           : " + npm);
        System.out.println("Program Studi : " + programStudi);
        System.out.println("Angkatan      : " + angkatan);
    }

    // Main method untuk contoh penggunaan
    public static void main(String[] args) {
        Biodata mahasiswa = new Biodata("Muhammad Jefry", "2310010647", "Informatika", 2023);
        mahasiswa.tampilkanBiodata();
    }
}