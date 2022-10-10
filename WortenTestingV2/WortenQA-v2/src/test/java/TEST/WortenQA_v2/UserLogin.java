package TEST.WortenQA_v2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

//@Epic("Login Tests")
//@Feature("Invalid Login Features")
public class UserLogin {
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	UserLoginSelectors select;

	@BeforeEach
	public void chromeStart() {
		// initialize chrome
		DriverAdapter d = new DriverAdapter();
		driver = d.create("CHROME");
		actions = d.actions;

		wait = new WebDriverWait(driver, 5);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.worten.pt/cliente/conta#/myLogin");
		select = new UserLoginSelectors();
		select.getSelectors(driver);
	}

//	@Test
//	@Description("Verify sucessfull login ")
//	@DisplayName("sucessfullLogin")
//	public void sucessfullLogin() throws InterruptedException {
//		fillForm("arturdoalves@gmail.com", "124");
//		Thread.sleep(1000);
//		String ChildWindow = driver.getWindowHandles().iterator().next();
//		driver.switchTo().window(ChildWindow);
//		Assert.assertEquals("https://www.worten.pt/cliente/conta#/myDashboard", driver.getCurrentUrl());
//	}

	@Test
//	@Description("Verify not registered email")
	@DisplayName("notRegisteredEmail")
	public void notRegisteredEmail() throws InterruptedException {
		fillForm("artuaaaaardoalves@gmail.com", "1234");

		Assertions.assertEquals("O teu email não está associado a uma conta Worten.",
				select.notRegisteredEmail().getText());
	}

	@Test
	@DisplayName("Empty email")
	public void emptyEmail() throws InterruptedException {
		fillForm("", "1234");
		Assertions.assertEquals("Email obrigatório.", select.emptyEmail().getAttribute("innerHTML"));
	}

//	@Test
//	public void invalidEmail() throws InterruptedException {
//		fillForm("dsfsddfs@sasa", "1234");
//		Assert.assertEquals("E-mail inválido.", select.emptyEmail().getAttribute("innerHTML"));
//	}
//
//	@Test
//	public void wrongPassword() throws InterruptedException {
//		fillForm("arturdoalves@gmail.com", "12344");
//		Assert.assertEquals("A tua palavra-passe não está correta.", select.wrongPassword().getText());
//	}
//
//	@Test
//	public void invalidPassword() throws InterruptedException {
//		fillForm("arturdoalves@gmail.com", "aa");
//		Assert.assertEquals("Palavra-Passe inválida.", select.invalidPassword().getAttribute("innerHTML"));
//		Assert.assertEquals("Password tem que conter no minimo 4 caracteres",
//				select.shortPasswor().getAttribute("innerHTML"));
//	}
//
//	@Test
//	public void emptyPassword() throws InterruptedException {
//		fillForm("arturdoalves@gmail.com", "");
//		Assert.assertEquals("Palavra-Passe inválida.", select.invalidPassword().getAttribute("innerHTML"));
//		Assert.assertEquals("Palavra-Passe obrigatória.", select.emptyPassword().getAttribute("innerHTML"));
//	}

	@AfterEach
	public void closeWebsite() {
		driver.close();
	}

	public void fillForm(String email, String password) throws InterruptedException {
		select.aceptCookies.click();
		Thread.sleep(200);
		actions.moveByOffset(0, 200).perform();
		actions.click(select.email).sendKeys(select.email, email).build().perform();
		actions.click(select.password).sendKeys(select.password, password).build().perform();
		actions.click(select.loginBtn).perform();
		;
	}
}
