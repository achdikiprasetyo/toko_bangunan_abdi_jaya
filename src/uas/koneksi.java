package uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static final String URL = "jdbc:mysql://localhost:3306/toko_abdi_jaya";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private Connection connection;

    public koneksi() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Koneksi berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }

    public boolean isTerhubung() {
        return connection != null;
    }
    
    public void tutupKoneksi() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Koneksi ditutup");
            }
        } catch (SQLException e) {
            System.out.println("Gagal menutup koneksi: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
