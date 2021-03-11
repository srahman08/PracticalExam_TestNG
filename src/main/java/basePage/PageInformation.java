package basePage;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class PageInformation {
	WebDriver driver;

	public PageInformation(WebDriver driver2) {
		this.driver = driver2;
	}

	public void toggleMethod() {

		WebElement toggleAllCheckBox = driver.findElement(By.name("allbox"));
		toggleAllCheckBox.click();
	}

	public void checkItemMethod() {
		WebElement checkOneItem = driver.findElement(By.xpath("//input[@type='checkbox' and @name='todo[22]']"));
		checkOneItem.click();
	}

	public void deleteItem() {

		WebElement DeleteItem = driver.findElement(By.xpath("//input[@value='Remove']"));
		DeleteItem.click();

	}

	public void addCategory() {
		WebElement AddCategory = driver.findElement(By.xpath("//input[@name='categorydata']"));
		AddCategory.sendKeys("ShamimCategory");
	}

	public void clickAddCategory() {

		WebElement ClickToAddCategory = driver.findElement(By.xpath("//input[@value='Add category']"));
		ClickToAddCategory.click();

	}

	public void neverMindClick() {
		WebElement clickNeverMind = driver.findElement(By.linkText("Nevermind"));
		clickNeverMind.click();
	}

	public void validatingErroMsg() {

		SoftAssert softAssertion = new SoftAssert();
		WebElement AssertionMsg = driver.findElement(By.xpath("//body[contains(text(),'The category you want')]"));
		softAssertion.assertEquals(AssertionMsg.getText(),
				"The category you want to add already exists: ShamimCategory");
		System.out.println("The message printed: " + AssertionMsg.getText());
	}

	public void monthList() {

		WebElement ListOfMonths = driver.findElement(By.cssSelector("select[name='due_month']"));
		Select sel = new Select(ListOfMonths);
		List<WebElement> option = sel.getOptions();
		for (WebElement i : option) {
			System.out.println(i.getText());
		}

	}

}