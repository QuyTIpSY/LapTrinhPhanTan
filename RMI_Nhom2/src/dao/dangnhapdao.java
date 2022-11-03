/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.taikhoanbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author quang
 */
public class dangnhapdao {
    
    public taikhoanbean ktdn (String sotaikhoan, String matkhau) {
        try {
            // b1: Ket noi csdl
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            // b2: Lay du lieu ve
            String sql = "select * from TaiKhoan where SoTaiKhoan=? and MatKhau=?";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, sotaikhoan);
            cmd.setString(2, matkhau);
            ResultSet rs = cmd.executeQuery(sql);
            taikhoanbean tk = null;
            
            if(rs.next()) {
                String SoTaiKhoan = rs.getString("SoTaiKhoan");
                String HoTen = rs.getString("HoTen");
                long SoTien = rs.getLong("SoTien");
                String MatKhau = rs.getString("MatKhau");
                tk = new taikhoanbean(SoTaiKhoan, HoTen, SoTien, MatKhau);
            }
            rs.close();
            kn.cn.close();
            return tk;
            
        } catch(Exception e) {
            e.printStackTrace(); return null;
        }
    }
}
