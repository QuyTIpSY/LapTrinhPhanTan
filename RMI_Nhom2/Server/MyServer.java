/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.rmi.*; import java.rmi.server.*;

/**
 *
 * @author quang
 */
public class MyServer {
    public static void main(String[] args) {
        try{
            TinhToan tt= new TinhToan();
            //Quang ba doi tuong tt de may khach co the goi phuong thuc trong tt
            UnicastRemoteObject.exportObject(tt);
            //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
            Naming.bind("rmi://localhost/TinhToan", tt);
            System.out.print("Da cho may khach goi den:");
        }catch(Exception tt) {
            tt.printStackTrace();
        }
    }
}
