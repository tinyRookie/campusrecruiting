package com.huawei.test;

import java.sql.*;

/**
 * Created by yangzhiyue on 17-9-23.
 */
public class GetConnection {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库加载成功");
            String url = "jdbc:mysql://localhost:3306/test";
            Connection connection = null;
            connection = DriverManager.getConnection(url, "root", "123456");
            Statement statement = connection.createStatement();
            String sql = "select * from student";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
               // System.out.println(rs.getString(3));
            }
            rs.close();
            statement.close();
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
