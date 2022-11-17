package lk.ijse.metropolitan.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import lk.ijse.metropolitan.model.CustomerModel;
import lk.ijse.metropolitan.to.Customer;

import java.sql.SQLException;

public class CustomerFormController {
    public TextField txtCID;
    public TextField txtName;
    public TextField txtMail;
    public TextField txtAddress;
    public TextField txtPhone;
    public TextField txtEID;
    public Button btnSave;
    public Button btnClear;
    public TableView tblCustomer;
    public TableColumn cid;
    public TableColumn name;
    public TableColumn email;
    public TableColumn address;
    public TableColumn phone;
    public TableColumn delete;
    public TextField txtSearch;
    public AnchorPane pane;
    public AnchorPane paneCustomer;

    public void saveOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        String cId=txtCID.getText();
        String name=txtName.getText();
        String address=txtAddress.getText();
        String email=txtMail.getText();
        String phone=txtPhone.getText();
        String eId=txtEID.getText();

        Customer customer = new Customer(cId,name,email,address,phone,eId);

        CustomerModel.saveCustomer(customer);
    }
}
