/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author quang
 */
public class taikhoanbean implements Serializable{
    private String SoTaiKhoan;
    private String HoTen;
    private long SoTien;
    private String MatKhau;

    public taikhoanbean() {
    }

    public taikhoanbean(String SoTaiKhoan, String HoTen, long SoTien, String MatKhau) {
        this.SoTaiKhoan = SoTaiKhoan;
        this.HoTen = HoTen;
        this.SoTien = SoTien;
        this.MatKhau = MatKhau;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public long getSoTien() {
        return SoTien;
    }

    public void setSoTien(long SoTien) {
        this.SoTien = SoTien;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
    
    
}
