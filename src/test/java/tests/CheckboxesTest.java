package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxesTest extends BaseTest {

    @Test
    public void checkboxesTest() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type=checkbox]"));

        WebElement firstCheckbox = checkboxes.get(0);
        WebElement secondCheckbox = checkboxes.get(1);

        assertFalse(firstCheckbox.isSelected(), "Первый чекбокс не должен быть выбран изначально");

        firstCheckbox.click();
        assertTrue(firstCheckbox.isSelected(), "Первый чекбокс должен быть выбран после клика");

        assertTrue(secondCheckbox.isSelected(), "Второй чекбокс должен быть выбран изначально");

        secondCheckbox.click();
        assertFalse(secondCheckbox.isSelected(), "Второй чекбокс не должен быть выбран после клика");
    }
}
