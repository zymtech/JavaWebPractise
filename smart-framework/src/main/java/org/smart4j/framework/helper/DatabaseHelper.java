package org.smart4j.framework.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;

import static org.smart4j.framework.util.DBUtil.getConnection;


/**
 * !!!!!!!!!!!warning: uncompleted
 * Created by Administrator on 10/31/2016.
 */
public final class DatabaseHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseHelper.class);

    public static void beginTransaction(){
        Connection conn = getConnection();
        if (conn!=null){
            try{
                conn.setAutoCommit(false);
            }catch (SQLException e){
                LOGGER.error("begin transaction failed",e);
                throw new RuntimeException(e);
            } finally {
                //CONNECTION_HOLDER.set(conn);
            }
        }
    }

    public static void commitTransaction(){}

    public static void rollbackTransaction(){}
}
