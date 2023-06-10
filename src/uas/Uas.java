package uas;

public class Uas {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
        

        
        koneksi koneksiDB = new koneksi();
        if (koneksiDB.isTerhubung()) {
            System.out.println("Koneksi berhasil terhubung");
        } else {
            System.out.println("Koneksi gagal terhubung");
        }
        koneksiDB.tutupKoneksi();
    }
}
