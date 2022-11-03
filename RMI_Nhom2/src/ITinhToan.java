/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import bean.taikhoanbean;
import java.rmi.*;
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
    
}
