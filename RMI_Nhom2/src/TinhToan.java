/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import bean.taikhoanbean;
import dao.dangnhapdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author quang
 */
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
    
}
