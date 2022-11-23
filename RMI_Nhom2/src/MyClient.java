/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import bean.chitiettaikhoan;
import bean.taikhoanbean;
import java.rmi.*;
import java.util.ArrayList;


public class MyClient {
    public static void main(String[] args) {
        try{
            ITinhToan tt= (ITinhToan) Naming.lookup("rmi://localhost:1099/TinhToan");
//            System.out.print(tt.Cong(10, 20));
//            System.out.print(tt.Tru(10, 20));
//            System.out.print(tt.Nhan(10, 20));
//            System.out.print(tt.Chia(10, 20));
            taikhoanbean tk = tt.ktdn("1", "123");
            if(tk!=null) System.out.println(tk.getSoTien());
            else System.out.println("Dang nhap sai");
        } catch(Exception tt){
            tt.printStackTrace();
        }
    }

}
