/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DbContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.SanPham;

/**
 *
 * @author ADMIN
 */
public class SanPhamDAO {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public ArrayList<SanPham> getTop6() {
        ArrayList<SanPham> ds = new ArrayList<>();
        String sql = "select top 6 * from SanPham where khuyenmai='true' order by dongia asc";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new SanPham(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getInt(5), rs.getInt(6)));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }    
    
     public ArrayList<SanPham> laySanPhamTheoLoai(int macd) {
        ArrayList<SanPham> ds = new ArrayList<>();
        String sql = "select * from SanPham where MaLoai=?";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, macd);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new SanPham(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getInt(5), rs.getInt(6)));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
    public static void main(String[] args) {
        SanPhamDAO sDao = new SanPhamDAO();
        for(SanPham s:sDao.laySanPhamTheoLoai(2))
        {
            System.out.println(s);
        }
    }
}
