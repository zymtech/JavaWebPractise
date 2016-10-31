package org.smart4j.framework.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Administrator on 10/31/2016.
 */
public class DBUtil {

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306:/demo";
    private static final String username = "root";
    private static final String password = "root";

    private static ThreadLocal<Connection> connContainer =
            new ThreadLocal<Connection>();

    public static Connection getConnection(){
        Connection conn = connContainer.get();
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connContainer.set(conn);
        }
        return conn;
    }

    public static void closeConnection(){
        Connection conn = connContainer.get();
        try{
            if (conn != null){
                conn.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connContainer.remove();
        }
    }
}
