package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {

    public Label display;
    private SimpleStringProperty value;
    private boolean imaTacka = false, imaDrugiBroj = false, imaOperacija = false, imaJednako = false;
    private double prviBroj, drugiBroj;
    private char operacija;


    public Controller() {
        value = new SimpleStringProperty("0");
    }

    public SimpleStringProperty valueProperty() {
        return value;
    }

    public String getValue() {
        return value.get();
    }

    public void btn1Click(ActionEvent actionEvent) {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if(imaOperacija)imaDrugiBroj = true;
        value.set(value.get() + "1");
    }

    public void btn2(ActionEvent actionEvent) {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if(imaOperacija )imaDrugiBroj = true;
        value.set(value.get() + "2");
    }

    public void btn3(ActionEvent actionEvent) {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if(imaOperacija )imaDrugiBroj = true;
        value.set(value.get() + "3");
    }

    public void btn4(ActionEvent actionEvent) {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if(imaOperacija )imaDrugiBroj = true;
        value.set(value.get() + "4");
    }

    public void btn5(ActionEvent actionEvent) {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if(imaOperacija )imaDrugiBroj = true;
        value.set(value.get() + "5");
    }

    public void btn6(ActionEvent actionEvent) {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        value.set(value.get() + "6");
    }

    public void btn7(ActionEvent actionEvent) {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if(imaOperacija )imaDrugiBroj = true;
        value.set(value.get() + "7");
    }

    public void btn8(ActionEvent actionEvent) {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if(imaOperacija )imaDrugiBroj = true;
        value.set(value.get() + "8");
    }

    public void btn9(ActionEvent actionEvent) {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if(imaOperacija )imaDrugiBroj = true;
        value.set(value.get() + "9");
    }

    public void btn0(ActionEvent actionEvent) {
        if ((imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if(imaOperacija )imaDrugiBroj = true;
        if (!value.get().equals("0")) value.set(value.get() + "0");
    }

    public void dotBtn(ActionEvent actionEvent) {
        if ((imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("0.");
            imaJednako = false;
            imaTacka = true;
            return;
        }
        if (!imaTacka) value.set(value.get() + ".");
        imaTacka = true;
    }

    public void plusBtn(ActionEvent actionEvent) {
        if(imaDrugiBroj) equalsBtn(actionEvent);
        prviBroj = Double.parseDouble(value.get());
        imaDrugiBroj = false;
        imaOperacija = true;
        operacija = '+';
    }

    public void minusBtn(ActionEvent actionEvent) {
        if(imaDrugiBroj) equalsBtn(actionEvent);
        prviBroj = Double.parseDouble(value.get());
        imaDrugiBroj = false;
        imaOperacija = true;
        operacija = '-';
    }

    public void multiplyBtn(ActionEvent actionEvent) {
        if(imaDrugiBroj) equalsBtn(actionEvent);
        prviBroj = Double.parseDouble(value.get());
        imaDrugiBroj = false;
        imaOperacija = true;
        operacija = '*';
    }

    public void divideBtn(ActionEvent actionEvent) {
        if(imaDrugiBroj) equalsBtn(actionEvent);
        prviBroj = Double.parseDouble(value.get());
        imaDrugiBroj = false;
        imaOperacija = true;
        operacija = '/';
    }

    public void percentBtn(ActionEvent actionEvent) {
        if(imaDrugiBroj) equalsBtn(actionEvent);
        prviBroj = Double.parseDouble(value.get());
        imaDrugiBroj = false;
        imaOperacija = true;
        operacija = '%';
    }

    public void equalsBtn(ActionEvent actionEvent) {
        if(imaOperacija) {
            imaJednako = true;
            drugiBroj = Double.parseDouble(value.get());
            if(operacija == '+')
                value.set(String.valueOf(prviBroj + drugiBroj));
            else if(operacija == '-')
                value.set(String.valueOf(prviBroj - drugiBroj));
            else if(operacija == '*')
                value.set(String.valueOf(prviBroj * drugiBroj));
            else if(operacija == '/') {
                if(drugiBroj == 0) value.set("NaN");
                else value.set(String.valueOf(prviBroj / drugiBroj));
            }
            else if(operacija == '%')
                value.set(String.valueOf(prviBroj % drugiBroj));

            imaOperacija = false;
            imaTacka = false;
        }
    }


}
