/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST6;

/**
 *
 * @author TOSHIBA PC
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection konek;
    
    public static Connection getConnection(){
        try{
            konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum_visual","root","");
            JOptionPane.showMessageDialog(null, "Berhasil Konek");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Gagal Konek"+e.getMessage());
        }
        return konek;
    }
}
