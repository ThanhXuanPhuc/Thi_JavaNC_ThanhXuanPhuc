/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    
    private int masp;
    private String tensp;
    private int dongia;
    private String hinh;
    private int maloai;
    private int khuyenmai;
    
    public SanPham() {       
    }
    
    public SanPham(int masp, String tensp, int dongia, String hinh, int maloai, int khuyenmai) {
        this.masp= masp;
        this.tensp= tensp;
        this.dongia = dongia;
        this.hinh= hinh;
        this.maloai = maloai;
        this.khuyenmai = khuyenmai;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getMaloai() {
        return maloai;
    }

    public void setMaloai(int maloai) {
        this.maloai = maloai;
    }

    public int getKhuyenmai() {
        return khuyenmai;
    }

    public void setKhuyenmai(int khuyenmai) {
        this.khuyenmai = khuyenmai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "masp=" + masp + ", tensp=" + tensp + ", dongia=" + dongia + ", hinh=" + hinh + ", maloai=" + maloai + ", khuyenmai=" + khuyenmai + '}';
    }
}
    
    
    
    

   