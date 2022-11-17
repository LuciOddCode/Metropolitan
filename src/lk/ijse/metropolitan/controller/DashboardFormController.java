package lk.ijse.metropolitan.controller;

import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
import javafx.scene.input.MouseEvent;

public class DashboardFormController {
    public JFXHamburger hmbDashMenu;

    public void revealOnMouseClick(MouseEvent mouseEvent) {
        HamburgerSlideCloseTransition transition = new HamburgerSlideCloseTransition(hmbDashMenu);
        if(transition.getRate()==-1){
            transition.setRate(1);
            transition.play();
        }
        transition.setRate(-1);
        transition.play();
    }

    public void revealOnMouseEnter(MouseEvent mouseEvent) {
        HamburgerSlideCloseTransition transition = new HamburgerSlideCloseTransition(hmbDashMenu);
        transition.setRate(-1);
        transition.play();
    }

    public void exitOnMuseExit(MouseEvent mouseEvent) {
        HamburgerSlideCloseTransition transition = new HamburgerSlideCloseTransition(hmbDashMenu);
        transition.setRate(1);
        transition.play();
    }
}
