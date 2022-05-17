/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kelompok3;

/**
 *
 * @author Tria Ade Pertiwi
 * 19/04/2022 11:20
 */
import java.sql.*;
public class Koneksi {
static final String DRIVER = "com.mysql.jdbc.Driver";
static final String URL = "jdbc:mysql://localhost/penjualan_barang";
static final String USER = "root";
static final String UPASS = "";

static Connection conn;
static Statement Stat;
    public static void konek(){
        try {
           Class.forName(DRIVER);
           conn = DriverManager.getConnection(URL, USER, UPASS);
           Stat = conn.createStatement();
           System.out.println("KONEKSI BERHASIL");
        }  catch (Exception e) {
           System.out.println("KONEKSI GAGAL");
           }
        }
    public static void main(String args[]) {
    konek();
    }
}
        
    

