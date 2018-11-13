package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {

    public TextField rezultatField;
    private SimpleStringProperty display;

    public Controller() {
        display = new SimpleStringProperty("0");
    }

    public SimpleStringProperty displayProperty() {
        return display;
    }

    public String getDisplay() {
        return display.get();
    }

    //@FXML
    public void jednakoClick(ActionEvent actionEvent) {
        display.set("0");
    }

    public void btn1(ActionEvent actionEvent) {
        if (display.get().equals("0")) display.set("");
        display.set(display.get() + "1");
    }

    public void btn2(ActionEvent actionEvent) {
        if (display.get().equals("0")) display.set("");
        display.set(display.get() + "2");
    }

    public void btn3(ActionEvent actionEvent) {
        if (display.get().equals("0")) display.set("");
        display.set(display.get() + "3");
    }

    public void btn4(ActionEvent actionEvent) {
        if (display.get().equals("0")) display.set("");
        display.set(display.get() + "4");
    }

    public void btn5(ActionEvent actionEvent) {
        if (display.get().equals("0")) display.set("");
        display.set(display.get() + "5");
    }

    public void btn6(ActionEvent actionEvent) {
        if (display.get().equals("0")) display.set("");
        display.set(display.get() + "6");
    }

    public void btn7(ActionEvent actionEvent) {
        if (display.get().equals("0")) display.set("");
        display.set(display.get() + "7");
    }

    public void btn8(ActionEvent actionEvent) {
        if (display.get().equals("0")) display.set("");
        display.set(display.get() + "8");
    }

    public void btn9(ActionEvent actionEvent) {
        if (display.get().equals("0")) display.set("");
        display.set(display.get() + "9");
    }

    public void btn0(ActionEvent actionEvent) {
        if (!display.get().equals("0")) display.set(display.get() + "0");
    }
}
