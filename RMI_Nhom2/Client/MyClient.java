/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.rmi.*;

/**
 *
 * @author quang
 */
public class MyClient {
    public static void main(String[] args) {
        try{
            ITinhToan tt= (ITinhToan) Naming.lookup("rmi://localhost/TinhToan");
            System.out.print(tt.Cong(10, 20));
            System.out.print(tt.Tru(10, 20));
            System.out.print(tt.Nhan(10, 20));
            System.out.print(tt.Chia(10, 20));
        } catch(Exception tt){
            tt.printStackTrace();
        }
    }

}
