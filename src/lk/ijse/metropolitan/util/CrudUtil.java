package lk.ijse.metropolitan.util;

import lk.ijse.metropolitan.db.DBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUtil {


    public static <T>T execute(String sql,Object...args) throws SQLException, ClassNotFoundException {
        PreparedStatement pstm = DBConnection.getInstance().getConnection().prepareStatement(sql);

        for (int i=0;i< args.length;i++){
            pstm.setObject((i+1),args[i]);
        }
        if(sql.startsWith("select")||sql.startsWith("SELECT")){
            return (T)pstm.executeQuery();
        }
        return (T)(Boolean) (pstm.executeUpdate()>0);
    }
}
