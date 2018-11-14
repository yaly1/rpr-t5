package ba.unsa.etf.rpr.tutorijal05;

import static org.junit.jupiter.api.Assertions.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

@ExtendWith(ApplicationExtension.class)
class MainTest {

    private Label display;

    @Start
    public void start(Stage stage) throws Exception {
        Parent mainNode = FXMLLoader.load(Main.class.getResource("digitron.fxml"));
        stage.setScene(new Scene(mainNode));
        stage.show();
        stage.toFront();
    }

    @Test
    void startWithZero(FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        assertEquals("0", display.getText());
    }

    @Test
    void numberOne(FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#btn1");
        assertEquals("1", display.getText());
    }

    @Test
    void number123(FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#btn1");
        robot.clickOn("#btn2");
        robot.clickOn("#btn3");
        assertEquals("123", display.getText());
    }

    @Test
    void number123Plus456(FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#btn1");
        robot.clickOn("#btn2");
        robot.clickOn("#btn3");
        robot.clickOn("#plusBtn");
        robot.clickOn("#btn4");
        robot.clickOn("#btn5");
        robot.clickOn("#btn6");
        assertEquals("456", display.getText());
    }

    @Test
    void number123Plus456Equals(FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#btn1");
        robot.clickOn("#btn2");
        robot.clickOn("#btn3");
        robot.clickOn("#plusBtn");
        robot.clickOn("#btn4");
        robot.clickOn("#btn5");
        robot.clickOn("#btn6");
        robot.clickOn("#equalsBtn");
        assertEquals("579.0", display.getText());
    }

    @Test
    void dotBtn(FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#btn8");
        robot.clickOn("#btn8");
        robot.clickOn("#dotBtn");
        robot.clickOn("#btn8");
        robot.clickOn("#btn8");
        robot.clickOn("#plusBtn");
        robot.clickOn("#btn1");
        robot.clickOn("#equalsBtn");
        assertEquals("89.88", display.getText());
    }

    @Test
    void zeroBtn(FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#btn0");
        robot.clickOn("#btn0");
        assertEquals("0", display.getText());
    }

    @Test
    void zeroBtn2(FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#btn0");
        robot.clickOn("#btn0");
        robot.clickOn("#btn1");
        robot.clickOn("#btn0");
        assertEquals("10", display.getText());
    }

    @Test
    void operationFirst1(FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#multiplyBtn");
        robot.clickOn("#btn3");
        robot.clickOn("#equalsBtn");
        assertEquals("0.0", display.getText());
    }

    @Test
    void operationFirst2(FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#plusBtn");
        robot.clickOn("#btn5");
        robot.clickOn("#equalsBtn");
        assertEquals("5.0", display.getText());
    }

    @Test
    void divideByZero(FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#btn8");
        robot.clickOn("#divideBtn");
        robot.clickOn("#btn0");
        robot.clickOn("#equalsBtn");
        assertEquals("NaN", display.getText());
    }

    @Test
    void operationsWithNaN(FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#btn8");
        robot.clickOn("#divideBtn");
        robot.clickOn("#btn0");
        robot.clickOn("#minusBtn");
        assertEquals("NaN", display.getText());
        robot.clickOn("#btn6");
        robot.clickOn("#percentBtn");
        assertEquals("NaN", display.getText());
        robot.clickOn("#btn4");
        robot.clickOn("#plusBtn");
        assertEquals("NaN", display.getText());
        robot.clickOn("#btn8");
        robot.clickOn("#btn0");
        robot.clickOn("#equalsBtn");
        assertEquals("NaN", display.getText());
    }

    @Test
    void twoPluses(FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#btn2");
        robot.clickOn("#plusBtn");
        robot.clickOn("#btn7");
        robot.clickOn("#plusBtn");
        assertEquals("9.0", display.getText());
    }

    @Test
    void conscutiveOperations(FxRobot robot) { // ((((((3 + 72.8 - 0.5) * 4 / 9) * 3) - .4) * 1.5) % 33 = 49.5
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#btn3");
        robot.clickOn("#plusBtn");
        robot.clickOn("#btn7");
        robot.clickOn("#btn2");
        robot.clickOn("#dotBtn");
        robot.clickOn("#btn8");
        robot.clickOn("#minusBtn");
        robot.clickOn("#btn0");
        robot.clickOn("#dotBtn");
        robot.clickOn("#btn5");
        robot.clickOn("#multiplyBtn");
        robot.clickOn("#btn4");
        robot.clickOn("#dotBtn");
        robot.clickOn("#divideBtn");
        robot.clickOn("#btn9");
        robot.clickOn("#equalsBtn");
        robot.clickOn("#multiplyBtn");
        robot.clickOn("#btn3");
        robot.clickOn("#minusBtn");
        robot.clickOn("#dotBtn");
        robot.clickOn("#btn4");
        robot.clickOn("#multiplyBtn");
        robot.clickOn("#btn1");
        robot.clickOn("#dotBtn");
        robot.clickOn("#btn5");
        robot.clickOn("#percentBtn");
        robot.clickOn("#btn3");
        robot.clickOn("#btn3");
        robot.clickOn("#equalsBtn");
        assertEquals("49.5", display.getText());
    }

    @Test
    void oneDot(FxRobot robot) { // 6. + 7.8 + .9 + 12.3
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#btn6");
        robot.clickOn("#dotBtn");
        robot.clickOn("#plusBtn");
        robot.clickOn("#btn7");
        robot.clickOn("#dotBtn");
        robot.clickOn("#btn8");
        robot.clickOn("#plusBtn");
        robot.clickOn("#dotBtn");
        robot.clickOn("#btn9");
        robot.clickOn("#plusBtn");
        robot.clickOn("#btn1");
        robot.clickOn("#btn2");
        robot.clickOn("#dotBtn");
        robot.clickOn("#btn3");
        robot.clickOn("#equalsBtn");
        assertEquals("27.0", display.getText());
    }

    @Test
    void multipleDots(FxRobot robot) { // 6. + 7.8 + .9 + 12.3
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#btn6");
        robot.clickOn("#dotBtn");
        robot.clickOn("#dotBtn");
        robot.clickOn("#plusBtn");
        robot.clickOn("#btn7");
        robot.clickOn("#dotBtn");
        robot.clickOn("#dotBtn");
        robot.clickOn("#btn8");
        robot.clickOn("#plusBtn");
        robot.clickOn("#dotBtn");
        robot.clickOn("#dotBtn");
        robot.clickOn("#btn9");
        robot.clickOn("#plusBtn");
        robot.clickOn("#btn1");
        robot.clickOn("#btn2");
        robot.clickOn("#dotBtn");
        robot.clickOn("#dotBtn");
        robot.clickOn("#dotBtn");
        robot.clickOn("#btn3");
        robot.clickOn("#equalsBtn");
        assertEquals("27.0", display.getText());
    }

}