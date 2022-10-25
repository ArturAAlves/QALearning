
package AA.WortenQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class RegisterAccSelectors {
	WebDriver driver = null;
	WebElement aceptCookies;
	WebElement name;
	WebElement lastName;
	WebElement email;
	WebElement password;
	WebElement displayPassword;
	WebElement termsAndConditions;
	WebElement createAccBtn;
	WebElement submit;
	WebElement confirmCreation;


	public void getSelectors(WebDriver driver) {
		// TODO Auto-generated method stub
		this.driver = driver;
		this.aceptCookies = driver.findElement(By.className("w-cookies-popup__footer__primary-button"));
		this.name = driver.findElement(By.id("input-name"));
		this.lastName = driver.findElement(By.id("input-last-name"));
		this.createAccBtn = driver
				.findElement(By.cssSelector(".nav-a.w-menu-private[href='/cliente/conta#/create_account']"));
		this.email = driver.findElement(By.id("input-email"));
		this.password = driver.findElement(By.id("password-field"));
		this.displayPassword = driver
				.findElement(By.xpath("//button[@aria-label='Mostrar Password']//*[name()='svg']"));
		this.termsAndConditions = driver.findElement(By.id("checkbox2"));
		this.submit = driver.findElement(By.cssSelector("button[type='submit']"));
		this.confirmCreation = driver.findElement(By.className("w-button-primary"));
	}

	public WebElement modalConfirmCreation() throws InterruptedException {
		// TODO Auto-generated method stub);
		return driver.findElement(By.className("w-button-primary"));
	}

	public WebElement modalAlreadyRegistred() throws InterruptedException {
		// TODO Auto-generated method stub)
		return driver.findElement(By.xpath("//*[@id=\"clientarea\"]/div/div/div[3]/div/div/div[2]/div/p"));
	}

	public WebElement nameFielddError() throws InterruptedException {
		// TODO Auto-generated method stub);
		return driver.findElement(By.xpath("(//p[normalize-space()='Nome obrigatório.'])[1]"));
	}

	public WebElement surNameFieldError() throws InterruptedException {
		// TODO Auto-generated method stub);
		return driver.findElement(By.xpath("(//p[normalize-space()='Apelido obrigatório.'])[1]"));
	}

	public WebElement emailFieldError() throws InterruptedException {
		// TODO Auto-generated method stub);
		return driver.findElement(By.xpath("(//p[normalize-space()='Email obrigatório.'])[1]"));
	}
	
	public WebElement emailFielIsInvalid() throws InterruptedException {
		// TODO Auto-generated method stub);
		return driver.findElement(By.xpath("(//p[normalize-space()='E-mail inválido.'])[1]"));
	}

	public WebElement passwordFieldError1() throws InterruptedException {
		// TODO Auto-generated method stub);
		return driver.findElement(By.xpath("(//p[normalize-space()='Palavra-Passe obrigatória.'])[1]"));
	}

	public WebElement passwordFieldError2() throws InterruptedException {
		// TODO Auto-generated method stub);
		return driver.findElement(By.xpath("(//p[normalize-space()='Palavra-Passe inválida.'])[1]"));
	}

	
	public WebElement passwordFieldError3() throws InterruptedException {
		// TODO Auto-generated method stub);
		return driver.findElement(By.xpath("(//p[normalize-space()='Password tem que conter no minimo 4 caracteres'])[1]"));
	}

	public WebElement termsCheckboxFieldError() throws InterruptedException {
		// TODO Auto-generated method stub);
		return driver.findElement(By.xpath("(//p[@class='form-error is-visible h-mb-0'])[1]"));
	}

	
}


