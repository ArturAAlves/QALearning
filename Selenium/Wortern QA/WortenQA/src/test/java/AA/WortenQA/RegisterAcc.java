package AA.WortenQA;

import java.time.Duration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;

public class RegisterAcc {
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	RegisterAccSelectors select;

	@BeforeEach
	public void chromeStart() {
		// initialize chrome


		DriverAdapter d = new DriverAdapter();
		driver = d.create("CHROME");
		actions = d.actions;

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.worten.pt/cliente/conta#/create_account");
		select = new RegisterAccSelectors();
		select.getSelectors(driver);
	}

	@Test
	public void emailAlreadyRegistered() throws InterruptedException {
		fillForm("artur", "alves", "arturdoalves@gmail.com", "sasa", true);
		select.modalConfirmCreation().click();
		Assertions.assertEquals("O teu email já está associado a uma conta Worten.",
				select.modalAlreadyRegistred().getText());

	}

	@Test
	public void nameFielEmpty() throws InterruptedException {
		fillForm("", "alves", "arturdoalves@gmail.com", "sasa", true);
		Assertions.assertEquals("Nome obrigatório.", select.nameFielddError().getAttribute("innerHTML"));
		System.out.println(select.nameFielddError().getAttribute("innerHTML"));
	}

	@Test
	public void nameIsInvalid() throws InterruptedException {
		fillForm("a", "alves", "arturdoalves@gmail.com", "sasa", true);
		Assertions.assertEquals("Nome é inválido.", select.nameFielddError().getAttribute("innerHTML"));
		System.out.println(select.nameFielddError().getAttribute("innerHTML"));
	}

	@Test
	public void lastNameFieldError() throws InterruptedException {
		fillForm("artur", "", "arturdoalves@gmail.com", "sasa", true);
		Assertions.assertEquals("Apelido obrigatório.", select.surNameFieldError().getAttribute("innerHTML"));
	}

	@Test
	public void sureNameIsInvalid() throws InterruptedException {
		fillForm("artur", "a", "arturdoalves@gmail.com", "sasa", true);
		Assertions.assertEquals("Apelido é inválido.", select.surNameFieldError().getAttribute("innerHTML"));
		System.out.println(select.nameFielddError().getAttribute("innerHTML"));
	}

	@Test
	public void emailFieldIsInvalid() throws InterruptedException {
		fillForm("artur", "alves", "asasa@sasa", "sasa", true);
		Assertions.assertEquals("E-mail inválido.", select.emailFielIsInvalid().getAttribute("innerHTML"));
	}

	@Test
	public void emailIsEmpty() throws InterruptedException {
		fillForm("artur", "alves", "", "sasa", true);
		Assertions.assertEquals("Email obrigatório.", select.emailFieldError().getAttribute("innerHTML"));
	}

	@Test
	public void passwordFielEmpty() throws InterruptedException {
		fillForm("artur", "alves", "arturdoalves@gmail.com", "", true);
		Assertions.assertEquals("Palavra-Passe obrigatória.", select.passwordFieldError1().getAttribute("innerHTML"));
		Assertions.assertEquals("Palavra-Passe inválida.", select.passwordFieldError2().getAttribute("innerHTML"));
	}

	@Test
	public void passwordIsInvalid() throws InterruptedException {
		fillForm("artur", "alves", "arturdoalves@gmail.com", "aa", true);
		Assertions.assertEquals("Palavra-Passe inválida.", select.passwordFieldError2().getAttribute("innerHTML"));
		Assertions.assertEquals("Password tem que conter no minimo 4 caracteres",
				select.passwordFieldError3().getAttribute("innerHTML"));
	}

	@Test
	public void emptyTermsAndConditions() throws InterruptedException {
		fillForm("artur", "alves", "arturdoalves@gmail.com", "aaaa", false);
		Assertions.assertEquals("Por favor, aceita os Termos e Condições.",
				select.termsCheckboxFieldError().getAttribute("innerHTML"));
	}

	@AfterEach
	public void closeWebsite() {
		driver.close();
	}

	private void fillForm(String name, String lastName, String email, String password, Boolean terms)
			throws InterruptedException {
		select.aceptCookies.click();
		Thread.sleep(200);
		actions.scrollByAmount(0, 300).perform();
		if (terms) {
			actions.click(select.termsAndConditions).perform();
		}
		actions.click(select.name).sendKeys(select.name, name).build().perform();
		actions.click(select.lastName).sendKeys(select.lastName, lastName).build().perform();
		actions.click(select.email).sendKeys(select.email, email).build().perform();
		actions.click(select.displayPassword).perform();
		actions.click(select.password).sendKeys(select.password, password).build().perform();
		actions.click(select.submit).perform();
	}
}
