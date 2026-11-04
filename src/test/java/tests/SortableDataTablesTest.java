package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortableDataTablesTest extends BaseTest {

    @Test
    public void sortableDataTablesTest() {
        driver.get("https://the-internet.herokuapp.com/tables");

        WebElement cell1 = driver.findElement(By.xpath("//table[1]//tr[1]//td[1]"));
        String cell1Text = cell1.getText();
        assertEquals(cell1Text, "Smith", "Неверное значение в первой ячейке");

        WebElement cell2 = driver.findElement(By.xpath("//table[1]//tr[1]//td[2]"));
        String cell2Text = cell2.getText();
        assertEquals(cell2Text, "John", "Неверное значение во второй ячейке");

        WebElement cell3 = driver.findElement(By.xpath("//table[1]//tr[2]//td[3]"));
        String cell3Text = cell3.getText();
        assertEquals(cell3Text, "fbach@yahoo.com", "Неверное значение в ячейке Email");
    }
}
