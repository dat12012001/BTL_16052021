/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLCoffeeShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HIEU
 */
public class QLNuocUong {

//    static void sapXep() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    List<NuocUong> dsnu = new ArrayList<>();
    
    //Lấy danh sách thức uống từ CSDL
    public static List<NuocUong> findAllNU() throws SQLException {
        List<NuocUong> dsnu = new ArrayList<>();

        Connection connection; //Kết nối đến Database
        Statement statement; //Lấy dữ liệu từ CSDL

        connection = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshopdb",
                "root", "Duchieu2001");
        //query
        String sql = "SELECT * FROM nuocuong order by tenNU DESC";
        statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);//Trả về câu truy vấn CSDL

        while (resultSet.next()) { //next() chuyển dữ liệu trên từ hàng và đọc ra ngoài
            NuocUong nu = new NuocUong(
                    resultSet.getString("tenNU"),
                    resultSet.getDouble("giaBan"),
                    resultSet.getString("tinhTrang"),
                    resultSet.getString("thoidiemBan"),
                    resultSet.getString("danhMuc"),
                    resultSet.getString("loaiNU"));
            dsnu.add(nu);
        }
        return dsnu;
    }
    //Xóa nước uống
    public static void xoaNU(String tenNU) throws SQLException{
        Connection connection;
        PreparedStatement statement;
        
        connection = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshopdb",
                "root", "Duchieu2001");
        
        //query
        String sql = "DELETE FROM nuocuong WHERE tenNU = ?";
        statement = connection.prepareCall(sql);
        
        statement.setString(1, tenNU);
        
        statement.execute();//Thêm dữ liệu vào Database
    }
    //Thêm nước uống
    public static void themNU(NuocUong nu) throws SQLException {
        Connection connection;
        PreparedStatement statement;

        connection = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshopdb",
                "root", "Duchieu2001");

        //query
        String sql = "INSERT INTO nuocuong(tenNU, giaBan, tinhTrang, "
                + "thoidiemBan, danhMuc, loaiNU) VALUES(?,?,?,?,?,?)";
        statement = connection.prepareCall(sql); //Truyền câu truy vấn
        statement.setString(1, nu.getTenSP());
        statement.setDouble(2, nu.getGiaBan());
        statement.setString(3, nu.getTinhTrang());
        statement.setString(4, nu.getThoiDiemBan());
        statement.setString(5, nu.getDanhMuc());
        statement.setString(6, nu.getLoaiNU());

        statement.execute();//Thêm dữ liệu vào Database
    }
    //Tìm kiếm nước uống theo tên
    public static List<NuocUong> timKiemNU(String tenNU) throws SQLException {
        List<NuocUong> dsnu = new ArrayList<>();

        Connection connection;
        PreparedStatement statement;

        connection = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshopdb",
                "root", "Duchieu2001");

        //query
        String sql = "SELECT * FROM nuocuong WHERE tenNU = ?";
        //Tìm kiếm nước uống theo tên
        statement = connection.prepareCall(sql);
        statement.setString(1, tenNU); //SQL

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            NuocUong nu = new NuocUong(
                    resultSet.getString("tenNU"),
                    resultSet.getDouble("giaBan"),
                    resultSet.getString("tinhTrang"),
                    resultSet.getString("thoidiemBan"),
                    resultSet.getString("danhMuc"),
                    resultSet.getString("loaiNU"));
            dsnu.add(nu);
        }
        return dsnu;
    }
    //Tìm kiếm nước uống theo khoảng giá
    public static List<NuocUong> timKiemNU(double tuGia, double denGia) throws SQLException {
        List<NuocUong> dsnu = new ArrayList<>();

        Connection connection;
        PreparedStatement statement;

        connection = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshopdb",
                "root", "Duchieu2001");

        //query
        String sql = "SELECT * FROM nuocuong WHERE (giaBan >= ?) and (giaBan <= ?)";
        //Tìm kiếm thức ăn theo khoảng giá
        statement = connection.prepareCall(sql);
        statement.setDouble(1, tuGia); //SQL
        statement.setDouble(2, denGia); //SQL

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            NuocUong nu = new NuocUong(
                    resultSet.getString("tenNU"),
                    resultSet.getDouble("giaBan"),
                    resultSet.getString("tinhTrang"),
                    resultSet.getString("thoidiemBan"),
                    resultSet.getString("danhMuc"),
                    resultSet.getString("loaiNU"));
            dsnu.add(nu);
        }
        return dsnu;
    }
    //Sắp xếp danh sách nước uống giảm dần theo giá 
   public static List<NuocUong> sapXepNU() throws SQLException {
        List<NuocUong> dsnu = new ArrayList<>();

        Connection connection;
        PreparedStatement statement;

        connection = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshopdb",
                "root", "Duchieu2001");

        //query
        String sql = "SELECT * FROM nuocuong ORDER BY giaBan DESC";
        //Sắp xếp danh sách các thức uống giảm dần theo giá bán
        statement = connection.prepareCall(sql);

        ResultSet resultSet = statement.executeQuery();
//         statement.executeQuery();
         


        while (resultSet.next()) {
            NuocUong nu = new NuocUong(
                    resultSet.getString("tenNU"),
                    resultSet.getDouble("giaBan"),
                    resultSet.getString("tinhTrang"),
                    resultSet.getString("thoidiemBan"),
                    resultSet.getString("danhMuc"),
                    resultSet.getString("loaiNU"));
            dsnu.add(nu);
        }
        return dsnu;
    }
    
     public static List<NuocUong> sapxepTenNU() throws SQLException {
        List<NuocUong> dsnu = new ArrayList<>();

        Connection connection;
        PreparedStatement statement;

        connection = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshopdb",
                "root", "Duchieu2001");

        //query
        String sql = "SELECT * FROM nuocuong ORDER BY tenNU DESC";
        statement = connection.prepareCall(sql);

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            NuocUong nu = new NuocUong(
                    resultSet.getString("tenNU"),
                    resultSet.getDouble("giaBan"),
                    resultSet.getString("tinhTrang"),
                    resultSet.getString("thoidiemBan"),
                    resultSet.getString("danhMuc"),
                    resultSet.getString("loaiNU"));
            dsnu.add(nu);
        }
        return dsnu;
    
     }
     public static List<NuocUong> danhSachSXNU() throws SQLException {
        List<NuocUong> dsnu = new ArrayList<>();

        Connection connection; //Kết nối đến Database
        Statement statement; //Lấy dữ liệu từ CSDL

        connection = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshopdb",
                "root", "Duchieu2001");
        //query
        String sql = "SELECT * FROM nuocuong order by giaBan DESC";
        statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);//Trả về câu truy vấn CSDL

        while (resultSet.next()) { //next() chuyển dữ liệu trên từ hàng và đọc ra ngoài
            NuocUong nu = new NuocUong(
                    resultSet.getString("tenNU"),
                    resultSet.getDouble("giaBan"),
                    resultSet.getString("tinhTrang"),
                    resultSet.getString("thoidiemBan"),
                    resultSet.getString("danhMuc"),
                    resultSet.getString("loaiNU"));
            dsnu.add(nu);
        }
        return dsnu;
    }
}
