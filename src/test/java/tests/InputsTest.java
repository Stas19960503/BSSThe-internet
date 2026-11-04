package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {

    @Test
    public void inputsTest() {
        driver.get("https://the-internet.herokuapp.com/inputs");

        WebElement inputField = driver.findElement(By.tagName("input"));

        inputField.sendKeys("12345");
        assertEquals(inputField.getAttribute("value"), "12345", "Числа введены неверно");

        inputField.clear();

        inputField.sendKeys("abcde");
        assertEquals(inputField.getAttribute("value"), "", "Буквы не должны вводиться в числовое поле");

        inputField.sendKeys("5");

        inputField.sendKeys(Keys.ARROW_UP);
        assertEquals(inputField.getAttribute("value"), "6", "Стрелка вверх не увеличила значение");

        inputField.sendKeys(Keys.ARROW_DOWN);
        inputField.sendKeys(Keys.ARROW_DOWN);
        assertEquals(inputField.getAttribute("value"), "4", "Стрелка вниз не уменьшила значение");
    }
}
