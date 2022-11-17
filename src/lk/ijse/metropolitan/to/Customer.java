package lk.ijse.metropolitan.to;

import lk.ijse.metropolitan.util.CrudUtil;

import java.sql.SQLException;

public class Customer {
    private String cId;
    private String name;
    private String email;
    private String address;
    private String phone;
    private String eId;

    public Customer() {
    }
    public Customer(String cId, String name, String email, String address, String phone, String eId) {
        this.cId = cId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.eId = eId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cId='" + cId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", eId='" + eId + '\'' +
                '}';
    }
}
