/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.sql.Timestamp;
import java.util.Date;
/**
 *
 * @author ASUS
 */
public class transaksi extends javax.swing.JFrame {
    private Connection connection;
    private DefaultTableModel tableModel;
    
    /**
     * Creates new form transaksi
     */
    public transaksi() {
        initComponents();
        initializeDatabaseConnection();
        initTableModelBarang();
        initTableModelPetugas();
        initTableModelKeranjang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        data_barang = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        output_petugas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        isiHarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        isiNamaBarang = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        isiJumlah = new javax.swing.JTextField();
        isiTotalBayar = new javax.swing.JTextField();
        isiPetugas = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        keranjang = new javax.swing.JTable();
        pindahBarang = new javax.swing.JButton();
        pindahPetugas = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transaksi");

        data_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama Barang", "Harga", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(data_barang);

        output_petugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "No HP", "Alamat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(output_petugas);

        jLabel1.setText("Harga");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Jumlah");

        jLabel4.setText("Total Bayar");

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jButton2.setText("Hitung");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        isiHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiHargaActionPerformed(evt);
            }
        });

        jLabel5.setText("Petugas");

        isiNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiNamaBarangActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        isiJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiJumlahActionPerformed(evt);
            }
        });

        isiTotalBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiTotalBayarActionPerformed(evt);
            }
        });

        isiPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiPetugasActionPerformed(evt);
            }
        });

        jButton3.setText("Tambah ke Keranjang");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        keranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama Barang", "Harga", "Jumlah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(keranjang);

        pindahBarang.setText("Barang");
        pindahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pindahBarangActionPerformed(evt);
            }
        });

        pindahPetugas.setText("Petugas");
        pindahPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pindahPetugasActionPerformed(evt);
            }
        });

        jLabel6.setText("Pindah Page");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel7.setText("TRANSAKSI");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel8.setText("TOKO ABDI JAYA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(isiTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(isiPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(57, 57, 57))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(pindahBarang)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(pindahPetugas))
                                                .addComponent(jLabel6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addGap(38, 38, 38)
                                                .addComponent(print)))
                                        .addGap(66, 66, 66))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isiHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isiJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)
                                    .addComponent(isiNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(536, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isiNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isiHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isiJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isiPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isiTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(print)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pindahBarang)
                    .addComponent(pindahPetugas))
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(177, 177, 177)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(515, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//print keranjang
    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        hitungTotalHarga();
        
        
        int rowCount = keranjang.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            String namaBarang = (String) keranjang.getValueAt(i, 0);
            //int jumlah = (int) keranjang.getValueAt(i, 2);
            int jumlah = Integer.parseInt((String) keranjang.getValueAt(i, 2));

            updateStockDiDatabase(namaBarang, jumlah);
            
        }
        

        
        tableModel.setRowCount(0);
        

    }//GEN-LAST:event_printActionPerformed
    private void initTableModelBarangUP() {
        String[] columnNames = {"Nama", "Harga","Stock"};
        tableModel = new DefaultTableModel(columnNames, 0);
        data_barang.setModel(tableModel);;
        loadDataFromDatabase();
        }
    private void updateStockDiDatabase(String namaBarang, int jumlah) {
        try {
            String updateQuery = "UPDATE barang SET stock = stock - ? WHERE nama = ?";
            PreparedStatement statement = connection.prepareStatement(updateQuery);
            statement.setInt(1, jumlah);
            statement.setString(2, namaBarang);
            statement.executeUpdate();

            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal Mengupdate Stock", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        hitungTotalHarga();
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void isiHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiHargaActionPerformed

    private void isiNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiNamaBarangActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void isiJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiJumlahActionPerformed

    private void isiTotalBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiTotalBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiTotalBayarActionPerformed

    private void isiPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiPetugasActionPerformed
// isi barang atau keranjang belanja
    private int getNewId() throws SQLException {
        String maxIdQuery = "SELECT MAX(id_pembayaran) FROM pembayaran";
        Statement maxIdStatement = connection.createStatement();
        ResultSet resultSet = maxIdStatement.executeQuery(maxIdQuery);
        int maxId = 0;
        if (resultSet.next()) {
            maxId = resultSet.getInt(1);
        }
        maxIdStatement.close();
        resultSet.close();
        return maxId + 1;
    }
    //insert data keranjang ke database
    private void insertDatabaseKeranjang(int idPembayaran, String namaBarang, double hargaBarang, int jumlahBarang) throws SQLException {
        String query = "INSERT INTO keranjang (id_pembayaran, nama_barang, harga, jumlah) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, idPembayaran);
        statement.setString(2, namaBarang);
        statement.setDouble(3, hargaBarang);
        statement.setInt(4, jumlahBarang);
        statement.executeUpdate();
        statement.close();
}
    //tombol print
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String namaBarang = isiNamaBarang.getText();
        String hargaBarangString = isiHarga.getText();
        String jumlahBarang = isiJumlah.getText();

        if (!namaBarang.isEmpty() && !hargaBarangString.isEmpty()) {
            double hargaBarang = Double.parseDouble(hargaBarangString);

            // Tambahkan baris baru ke dalam model tabel
            Object[] row = {namaBarang, hargaBarang, jumlahBarang};
            tableModel.addRow(row);

            // Kosongkan input setelah ditambahkan ke tabel
            isiNamaBarang.setText("");
            isiHarga.setText("");
            isiJumlah.setText("");

            try {
                // Dapatkan nilai id pembayaran baru
                int idPembayaran = getNewId();
                
                // Simpan data ke database
                insertDatabaseKeranjang(idPembayaran, namaBarang, hargaBarang, Integer.parseInt(jumlahBarang));
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                // Tangani kesalahan query di sini
            }
        } else {
            JOptionPane.showMessageDialog(this, "Isi Nama, Harga dan jumlah barang terlebih dahulu", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    //ambil data keranjang
    private void loadDataKeranjangFromDatabase() {
        String query = "SELECT id_pembayaran FROM keranjang";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idPembayaran = resultSet.getInt("id_pembayaran");

  

            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //pindah page mjfrane
    private void pindahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pindahBarangActionPerformed
        // TODO add your handling code here:
        JFrame  NewJFrame = new NewJFrame(); 
        this.dispose();

        JDialog dialog = new JDialog(this, "Data Buku", true);
        dialog.getContentPane().add(NewJFrame.getContentPane());
        dialog.setSize(NewJFrame.getSize());
        dialog.setLocationRelativeTo(this);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        // Menampilkan dialog
        dialog.setVisible(true);
    }//GEN-LAST:event_pindahBarangActionPerformed

    private void pindahPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pindahPetugasActionPerformed
        // TODO add your handling code here:
        JFrame  petugas = new petugas(); 
        this.dispose();

        JDialog dialog = new JDialog(this, "Data Petugas", true);
        dialog.getContentPane().add(petugas.getContentPane());
        dialog.setSize(petugas.getSize());
        dialog.setLocationRelativeTo(this);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        // Menampilkan dialog
        dialog.setVisible(true);
    }//GEN-LAST:event_pindahPetugasActionPerformed
    
    //keranjang
    
    private void initTableModelKeranjang() {
        String[] columnNames = {"NamaBarang", "Harga","jumlah Barang"};
        tableModel = new DefaultTableModel(columnNames, 0);
        keranjang.setModel(tableModel);
        
    }
    private double totalHarga = 0.0;
    private void hitungTotalHarga() {
        // Mendapatkan jumlah baris dalam tabel
        int rowCount = tableModel.getRowCount();
        
        // Reset total harga menjadi 0 sebelum menghitung ulang
        totalHarga = 0.0;

        // Iterasi melalui setiap baris tabel dan tambahkan harga ke totalHarga
        for (int i = 0; i < rowCount; i++) {
            double harga = Double.parseDouble(tableModel.getValueAt(i, 1).toString());
            int jumlah = Integer.parseInt(tableModel.getValueAt(i, 2).toString());
            totalHarga += harga * jumlah;
        }

        // Perbarui label total harga setelah menghitung total harga
        updateTotalHarga();
    simpanTotalPembayaran(totalHarga);
        }

    private void updateTotalHarga() {
        // Mengupdate label total harga dengan nilai yang disimpan dalam variabel totalHarga
        isiTotalBayar.setText(""+ totalHarga);
    }

    
    //tabel barang
    
    private void initTableModelBarang() {
        String[] columnNames = {"Nama", "Harga","Stock"};
        tableModel = new DefaultTableModel(columnNames, 0);
        data_barang.setModel(tableModel);;
        loadDataFromDatabase();
        data_barang.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            data_barangMouseClicked(evt);
        }
    });
    }
    
    private void loadDataFromDatabase() {
        String query = "SELECT nama, harga, stock FROM barang";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String namaBarang = resultSet.getString("nama");
                String hargaBarang = resultSet.getString("harga");
                String stockBarang = resultSet.getString("stock");
                Object[] row = {namaBarang, hargaBarang, stockBarang};
                tableModel.addRow(row);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
     private void initTableModelPetugas(){
        String [] columnName = {"Nama","no_hp","alamat"};
        tableModel = new DefaultTableModel(columnName,0);
        output_petugas.setModel(tableModel);
        mengambilDatabasePetugas();
        output_petugas.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            petugasMouseClicked(evt);
        }
    });
    }
    
    private void mengambilDatabasePetugas() {
        String query = "SELECT nama, no_hp,alamat FROM petugas";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String namaPetugas = resultSet.getString("nama");
                String no_hpPetugas = resultSet.getString("no_hp");
                String alamatPetugas = resultSet.getString("alamat");
                Object[] row = {namaPetugas, no_hpPetugas,alamatPetugas};
                tableModel.addRow(row);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void initializeDatabaseConnection() {
        String url = "jdbc:mysql://localhost:3306/toko_abdi_jaya";
        String username = "root";
        String password = "";

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //fugsi klik dan hitungg
    private void data_barangMouseClicked(java.awt.event.MouseEvent evt) {                                       
        int selectedRow = data_barang.getSelectedRow();

        // Ambil nilai dari kolom yang dipilih
        String namaBarang = (String) data_barang.getValueAt(selectedRow, 0);
        String hargaBarang = (String) data_barang.getValueAt(selectedRow, 1);

        // Set nilai ke jTextField yang sesuai
        isiNamaBarang.setText(namaBarang);
        isiHarga.setText(hargaBarang);
    }
    private String idPetugasTerpilih;

    private void petugasMouseClicked(java.awt.event.MouseEvent evt) {                                       
        int selectedRow = output_petugas.getSelectedRow();
        String namaPetugas = (String) output_petugas.getValueAt(selectedRow, 0);
        isiPetugas.setText(namaPetugas);
        idPetugasTerpilih = output_petugas.getValueAt(selectedRow, 0).toString();
    }

        
    //akhir ptransaksi tpotal
    private void simpanTotalPembayaran(double totalHarga) {
        // Menggunakan koneksi ke database Anda. Ganti url, username, dan password sesuai dengan pengaturan Anda.
        try {
            // Mendapatkan tanggal dan waktu saat ini
            Date date = new Date();
            Timestamp timestamp = new Timestamp(date.getTime());

            // Menyiapkan pernyataan SQL untuk menyimpan total pembayaran, tanggal, dan id petugas ke tabel pembayaran
            String query = "INSERT INTO pembayaran ( tanggal,total_harga, nama_petugas ) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            
            statement.setTimestamp(1, timestamp);
            statement.setDouble(2, totalHarga);
            statement.setString(3, idPetugasTerpilih);
            
            

            // Menjalankan pernyataan SQL
            statement.executeUpdate();

            // Menutup pernyataan
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //menjadikan file
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable data_barang;
    private javax.swing.JTextField isiHarga;
    private javax.swing.JTextField isiJumlah;
    private javax.swing.JTextField isiNamaBarang;
    private javax.swing.JTextField isiPetugas;
    private javax.swing.JTextField isiTotalBayar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable keranjang;
    private javax.swing.JTable output_petugas;
    private javax.swing.JButton pindahBarang;
    private javax.swing.JButton pindahPetugas;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}