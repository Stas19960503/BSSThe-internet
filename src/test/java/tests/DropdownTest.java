package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTest {

    @Test
    public void dropdownTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("dropdown"));

        Select dropdown = new Select(dropdownElement);

        List<WebElement> options = dropdown.getOptions();
        assertTrue(options.size() > 0, "В дроп-дауне должны быть элементы");

        dropdown.selectByIndex(1);
        WebElement selectedOption1 = dropdown.getFirstSelectedOption();
        assertEquals(selectedOption1.getText(), "Option 1", "Первый элемент не выбран");

        dropdown.selectByIndex(2);
        WebElement selectedOption2 = dropdown.getFirstSelectedOption();
        assertEquals(selectedOption2.getText(), "Option 2", "Второй элемент не выбран");
    }
}
