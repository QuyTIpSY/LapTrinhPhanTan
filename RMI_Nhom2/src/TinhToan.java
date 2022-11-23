/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import bean.chitiettaikhoan;
import bean.taikhoanbean;
import dao.dangnhapdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;

public class TinhToan extends UnicastRemoteObject implements ITinhToan{

    public TinhToan() throws RemoteException {
    }

    
    
    @Override
    public int Cong(int a, int b) throws Exception {
        int s= a+b;
        System.out.println("Tong: " + s);
        return s;
    }

    @Override
    public int Tru(int a, int b) throws Exception {
        int s= a-b;
        System.out.println("Hieu: " + s);
        return s;
    }
    
    @Override
    public int Nhan(int a, int b) throws Exception {
        int s= a*b;
        System.out.println("Tich: " + s);
        return s;
    }
    
    @Override
    public double Chia(int a, int b) throws Exception {
        double s= a/b;
        System.out.println("Thuong: " + s);
        return s;
    }

    dangnhapdao dn = new dangnhapdao();
    @Override
    public taikhoanbean ktdn(String sotaikhoan, String matkhau) throws Exception {
        return dn.ktdn(sotaikhoan, matkhau);
    }
    
    public String hoten(String sotaikhoan) throws Exception {
        return dn.TaiKhoan(sotaikhoan).getHoTen();
    }
    
    public long sotien(String sotaikhoan) throws Exception {
        return dn.TaiKhoan(sotaikhoan).getSoTien();
    }
    
    public void ruttien(String sotaikhoan, long sotienrut) throws Exception{
       dn.RutTien(sotaikhoan, sotienrut);
    }
    
    public void chitiettaikhoan(java.sql.Date ngayruttien, long sotienrut, String sotaikhoan, String ghichu) throws Exception{
       dn.ChiTietTaiKhoan(ngayruttien, sotienrut, sotaikhoan, ghichu);
    }
    
    public void NapTien(String sotaikhoan, long sotienrut) throws Exception{
       dn.RutTien(sotaikhoan, sotienrut);
    }
    
    public void DoiMatKhau(String sotaikhoan, String matkhaumoi) throws Exception{
       dn.DoiMatKhau(sotaikhoan, matkhaumoi);
    }
    
    public ArrayList<chitiettaikhoan> LichSuGD(String sotaikhoan) throws Exception{
        return dn.LichSuGD(sotaikhoan);
    }
}
