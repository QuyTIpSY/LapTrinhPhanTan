/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author quang
 */
public class TinhToan implements ITinhToan{

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
    public double Chia(double a, double b) throws Exception {
        double s= a/b;
        System.out.println("Thuong: " + s);
        return s;
    }
    
}
