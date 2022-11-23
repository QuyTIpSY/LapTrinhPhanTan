/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author quang
 */
public class chitiettaikhoan implements Serializable{
    private int Id;
    private Date NgayRutTien;
    private long SoTienRutRa;
    private String SoTaiKhoan;
    private String Ghichu;

    public chitiettaikhoan() {
    }

    public chitiettaikhoan(int Id, Date NgayRutTien, long SoTienRutRa, String SoTaiKhoan, String Ghichu) {
        this.Id = Id;
        this.NgayRutTien = NgayRutTien;
        this.SoTienRutRa = SoTienRutRa;
        this.SoTaiKhoan = SoTaiKhoan;
        this.Ghichu = Ghichu;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getNgayRutTien() {
        return NgayRutTien;
    }

    public void setNgayRutTien(Date NgayRutTien) {
        this.NgayRutTien = NgayRutTien;
    }

    public long getSoTienRutRa() {
        return SoTienRutRa;
    }

    public void setSoTienRutRa(long SoTienRutRa) {
        this.SoTienRutRa = SoTienRutRa;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }
    
    
}
