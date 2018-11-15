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

    private void pomocnaFunkcijaZaBrojeve() {
        if (value.get().equals("0") || (imaOperacija && !imaDrugiBroj) || imaJednako) {
            value.set("");
            imaJednako = false;
        }
        if (imaOperacija) imaDrugiBroj = true;
    }

    public void btn1() {
        pomocnaFunkcijaZaBrojeve();
        value.set(value.get() + "1");
    }

    public void btn2() {
        pomocnaFunkcijaZaBrojeve();
        value.set(value.get() + "2");
    }

    public void btn3() {
        pomocnaFunkcijaZaBrojeve();
        value.set(value.get() + "3");
    }

    public void btn4() {
        pomocnaFunkcijaZaBrojeve();
        value.set(value.get() + "4");
    }

    public void btn5() {
        pomocnaFunkcijaZaBrojeve();
        value.set(value.get() + "5");
    }

    public void btn6() {
        pomocnaFunkcijaZaBrojeve();
        value.set(value.get() + "6");
    }

    public void btn7() {
        pomocnaFunkcijaZaBrojeve();
        value.set(value.get() + "7");
    }

    public void btn8() {
        pomocnaFunkcijaZaBrojeve();
        value.set(value.get() + "8");
    }

    public void btn9() {
        pomocnaFunkcijaZaBrojeve();
        value.set(value.get() + "9");
    }

    public void btn0() {
        pomocnaFunkcijaZaBrojeve();
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

    private void pomocnaFunkcijaZaOperacije() {
        if (imaDrugiBroj) equalsBtn();
        prviBroj = Double.parseDouble(value.get());
        imaDrugiBroj = false;
        imaOperacija = true;
        imaTacka = false;
    }

    public void plusBtn() {
        pomocnaFunkcijaZaOperacije();
        operacija = '+';
    }

    public void minusBtn() {
        pomocnaFunkcijaZaOperacije();
        operacija = '-';
    }

    public void multiplyBtn() {
        pomocnaFunkcijaZaOperacije();
        operacija = '*';
    }

    public void divideBtn() {
        pomocnaFunkcijaZaOperacije();
        operacija = '/';
    }

    public void percentBtn() {
        pomocnaFunkcijaZaOperacije();
        operacija = '%';
    }

    public void equalsBtn() {
        if (imaOperacija && imaDrugiBroj) {

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
                value.set(String.valueOf(prviBroj / 100 * drugiBroj));
        }
        value.set(String.valueOf(Double.parseDouble(value.get())));
        imaJednako = true;
        imaOperacija = false;
        imaTacka = false;
    }
}
