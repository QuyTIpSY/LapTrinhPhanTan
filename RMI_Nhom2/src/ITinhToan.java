/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import bean.chitiettaikhoan;
import bean.taikhoanbean;
import java.rmi.*;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author quang
 */
public interface ITinhToan extends Remote{
    public int Cong(int a, int b) throws Exception;
    public int Tru(int a, int b) throws Exception;
    public int Nhan(int a, int b) throws Exception;
    public double Chia(int a, int b) throws Exception;
    public taikhoanbean ktdn (String sotaikhoan, String matkhau) throws Exception;
    public String hoten(String sotaikhoan) throws Exception;
    public long sotien(String sotaikhoan) throws Exception;
    public void ruttien(String sotaikhoan, long sotienrut) throws Exception;
    public void chitiettaikhoan(java.sql.Date ngayruttien, long sotienrut, String sotaikhoan, String ghichu) throws Exception;
    public void NapTien(String sotaikhoan, long sotienrut) throws Exception;
    public void DoiMatKhau(String sotaikhoan, String matkhaumoi) throws Exception;
    public ArrayList<chitiettaikhoan> LichSuGD(String sotaikhoan) throws Exception;
}
