/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrenLop;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author quang
 */
public class GuiNhanUDP {
    DatagramSocket Sserver;
    
    public void MoCong(int cong) throws Exception{
        Sserver= new DatagramSocket(cong);
        System.out.println("Da mo cong: " + cong);
    }
    
    public String Nhan() throws Exception{
        byte bodem[]=new byte[256]; //Tạo ra bộ đệm để nhận dữ liệu về
        DatagramPacket dr= new DatagramPacket(bodem,bodem.length);
        Sserver.receive(dr);//Đợi 1 kết nối đến
        String st= new String(dr.getData()).trim() ;//Lấy dữ liệu về và đổi sang chuỗi
        return st;
    }
 
    public void Gui(String data, String ip, int cong) throws Exception{
        DatagramSocket dg=new DatagramSocket();     //Tạo ra 1 DatagramSocket  để gửi
        byte bodem[]=new byte[256];                 //Tạo ra bộ đệm chứa dữ liệu cần gửi
        bodem=data.getBytes();                      //Chuyển chuỗi thành dãy các byte
        InetAddress mc=InetAddress.getByName(ip);   //Lấy thông tin của máy cần gửi
        DatagramPacket dr= new DatagramPacket(bodem,bodem.length,mc,cong);
        dg.send(dr);                                //Gửi dữ liệu đi
        dg.close();
    }
}
