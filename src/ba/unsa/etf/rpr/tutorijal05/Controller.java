package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Label;

public class Controller {

    public Label display;
    private SimpleStringProperty value;
    private boolean imaTacka = false, imaDrugiBroj = false, imaOperacija = false, imaJednako = false;
    private double prviBroj;
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

    public void btn1() {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if (imaOperacija) imaDrugiBroj = true;
        value.set(value.get() + "1");
    }

    public void btn2() {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if (imaOperacija) imaDrugiBroj = true;
        value.set(value.get() + "2");
    }

    public void btn3() {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if (imaOperacija) imaDrugiBroj = true;
        value.set(value.get() + "3");
    }

    public void btn4() {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if (imaOperacija) imaDrugiBroj = true;
        value.set(value.get() + "4");
    }

    public void btn5() {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if (imaOperacija) imaDrugiBroj = true;
        value.set(value.get() + "5");
    }

    public void btn6() {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if (imaOperacija) imaDrugiBroj = true;
        value.set(value.get() + "6");
    }

    public void btn7() {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if (imaOperacija) imaDrugiBroj = true;
        value.set(value.get() + "7");
    }

    public void btn8() {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if (imaOperacija) imaDrugiBroj = true;
        value.set(value.get() + "8");
    }

    public void btn9() {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if (imaOperacija) imaDrugiBroj = true;
        value.set(value.get() + "9");
    }

    public void btn0() {
        if ((imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if (imaOperacija) imaDrugiBroj = true;
        if (!value.get().equals("0")) value.set(value.get() + "0");
    }

    public void dotBtn() {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("0.");
            imaJednako = false;
            imaTacka = true;
            if (imaOperacija) imaDrugiBroj = true;
            return;
        }
        if (!imaTacka) value.set(value.get() + ".");
        imaTacka = true;
    }

    public void plusBtn() {
        if (imaDrugiBroj) equalsBtn();
        prviBroj = Double.parseDouble(value.get());
        imaDrugiBroj = false;
        imaOperacija = true;
        operacija = '+';
    }

    public void minusBtn() {
        if (imaDrugiBroj) equalsBtn();
        prviBroj = Double.parseDouble(value.get());
        imaDrugiBroj = false;
        imaOperacija = true;
        imaTacka = false;
        operacija = '-';
    }

    public void multiplyBtn() {
        if (imaDrugiBroj) equalsBtn();
        prviBroj = Double.parseDouble(value.get());
        imaDrugiBroj = false;
        imaOperacija = true;
        imaTacka = false;
        operacija = '*';
    }

    public void divideBtn() {
        if (imaDrugiBroj) equalsBtn();
        prviBroj = Double.parseDouble(value.get());
        imaDrugiBroj = false;
        imaOperacija = true;
        imaTacka = false;
        operacija = '/';
    }

    public void percentBtn() {
        if (imaDrugiBroj) equalsBtn();
        prviBroj = Double.parseDouble(value.get());
        imaDrugiBroj = false;
        imaOperacija = true;
        imaTacka = false;
        operacija = '%';
    }

    public void equalsBtn() {
        if (imaOperacija) {
            imaJednako = true;
            double drugiBroj = Double.parseDouble(value.get());
            if (operacija == '+')
                value.set(String.valueOf(prviBroj + drugiBroj));
            else if (operacija == '-')
                value.set(String.valueOf(prviBroj - drugiBroj));
            else if (operacija == '*')
                value.set(String.valueOf(prviBroj * drugiBroj));
            else if (operacija == '/') {
                if (drugiBroj == 0) value.set("NaN");
                else value.set(String.valueOf(prviBroj / drugiBroj));
            } else if (operacija == '%')
                value.set(String.valueOf(prviBroj % drugiBroj));

            imaOperacija = false;
            imaTacka = false;
        }
    }


}
