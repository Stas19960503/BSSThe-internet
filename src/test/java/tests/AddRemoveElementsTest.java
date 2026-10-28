package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void addRemoveElements() {

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addButton.click();
        addButton.click();

        List<WebElement> deleteButtons = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));

        assertEquals(deleteButtons.size(), 2, "Количество элементов не совпадает с ожидаемым");

        deleteButtons.get(0).click();

        deleteButtons = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));

        assertEquals(deleteButtons.size(), 1, "Количество элементов не совпадает с ожидаемым");
    }
}
