/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.chitiettaikhoan;
import bean.taikhoanbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class dangnhapdao {
    
    public taikhoanbean ktdn (String sotaikhoan, String matkhau) {
        try {
            // b1: Ket noi csdl
            KetNoi kn=new KetNoi();
            kn.KetNoi();
            // b2: Lay du lieu ve
            String sql = "select * from TaiKhoan where SoTaiKhoan=? and MatKhau=?";
       
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, sotaikhoan);
            cmd.setString(2, matkhau);
            ResultSet rs = cmd.executeQuery();
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
    
    public taikhoanbean TaiKhoan (String sotaikhoan) {
        try {
            // b1: Ket noi csdl
            KetNoi kn=new KetNoi();
            kn.KetNoi();
            // b2: Lay du lieu ve
            String sql = "select * from TaiKhoan where SoTaiKhoan=?";
       
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, sotaikhoan);
            ResultSet rs = cmd.executeQuery();
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
    
    public void RutTien(String sotaikhoan, long sotien){
		try {
			KetNoi kn=new KetNoi();
			kn.KetNoi();
			
			String query="UPDATE TaiKhoan SET SoTien=? WHERE SoTaiKhoan=?";
			
			PreparedStatement cmd=kn.cn.prepareStatement(query);
			
			cmd.setLong(1, sotien);
			cmd.setString(2, sotaikhoan);
			
			cmd.executeUpdate();
			
			kn.cn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
    
    public void ChiTietTaiKhoan(java.sql.Date ngayruttien,long sotienrut, String sotaikhoan, String ghichu){
                try {
			KetNoi kn=new KetNoi();
			kn.KetNoi();
			
			String query="INSERT INTO ChiTietTaiKhoan(NgayRutTien, SoTienRutRa, SoTaiKhoan, GhiChu) VALUES (?,?,?,?)";
			
			PreparedStatement cmd=kn.cn.prepareStatement(query);
			
			cmd.setDate(1, ngayruttien);
			cmd.setLong(2, sotienrut);
                        cmd.setString(3, sotaikhoan);
                        cmd.setString(4, ghichu);
                        
			cmd.executeUpdate();			
			kn.cn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
    }
    
    public void NapTien(String sotaikhoan, long sotien){
		try {
			KetNoi kn=new KetNoi();
			kn.KetNoi();
			
			String query="UPDATE TaiKhoan SET SoTien=? WHERE SoTaiKhoan=?";
			
			PreparedStatement cmd=kn.cn.prepareStatement(query);
			
			cmd.setLong(1, sotien);
			cmd.setString(2, sotaikhoan);
			
			cmd.executeUpdate();
			
			kn.cn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
    }
    
    public void DoiMatKhau(String sotaikhoan, String matkhaumoi){
        try {
                KetNoi kn=new KetNoi();
		kn.KetNoi();
		
		String query="update TaiKhoan set MatKhau=? where SoTaiKhoan=?";
                
		PreparedStatement cmd=kn.cn.prepareStatement(query);
			
		cmd.setString(1, matkhaumoi);
		cmd.setString(2, sotaikhoan);
			
		cmd.executeUpdate();
			
		kn.cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<chitiettaikhoan> LichSuGD(String sotaikhoan){
        try {
            // b1: Ket noi csdl
            KetNoi kn=new KetNoi();
            kn.KetNoi();
            // b2: Lay du lieu ve
            String sql = "select * from ChiTietTaiKhoan where SoTaiKhoan=?";
       
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, sotaikhoan);
            ResultSet rs = cmd.executeQuery();
            ArrayList<chitiettaikhoan> ds= new ArrayList<chitiettaikhoan>();
            
            while(rs.next()) {
                int Id = rs.getInt("Id");
                Date NgayRutTien = rs.getDate("NgayRutTien");
                long SoTienRutRa = rs.getLong("SoTienRutRa");
                String SoTaiKhoan = rs.getString("SoTaiKhoan");
                String Ghichu = rs.getString("Ghichu");
                ds.add(new chitiettaikhoan(Id, NgayRutTien, SoTienRutRa, SoTaiKhoan, Ghichu));
            }
            rs.close();
            kn.cn.close();
            return ds;
            
        } catch(Exception e) {
            e.printStackTrace(); return null;
        }
    }
    
//    public static void main(String[] args) {
//        Date date=new java.util.Date();  
//        System.out.println(date);  
//    }
}
