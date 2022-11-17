package lk.ijse.metropolitan.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SupplierFormController {
    public AnchorPane paneSupplier;
    public TextField txtCID;
    public TextField txtName;
    public TextField txtMail;
    public TextField txtPhone;
    public Button btnSave;
    public Button btnClear;
    public TableView tblSupplier;
    public TableColumn colSID;
    public TableColumn colComName;
    public TableColumn colMail;
    public TableColumn colPhone;
    public TableColumn colDate;
    public TableColumn colDelete;
    public TextField txtSearch;

    public void saveOnAction(ActionEvent actionEvent) {
    }
}
