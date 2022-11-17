package lk.ijse.metropolitan.model;

import lk.ijse.metropolitan.to.Customer;
import lk.ijse.metropolitan.util.CrudUtil;

import java.sql.SQLException;

public class CustomerModel {


    public static boolean saveCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        String sql="INSERT INTO customerModel VALUES(?,?,?,?,?,?)";
        return CrudUtil.execute(sql, customer.getcId(), customer.getName(), customer.getEmail(), customer.getAddress()
                , customer.getPhone(), customer.geteId());
    }


}
