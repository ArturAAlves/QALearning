package TEST.WortenQA_v2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class UserLoginSelectors {
	WebDriver driver = null;
	WebElement aceptCookies;
	WebElement email;
	WebElement password;
	WebElement loginBtn;

	
	public void getSelectors(WebDriver driver) {
		// TODO Auto-generated method stub
		this.driver = driver;
		this.aceptCookies = driver.findElement(By.className("w-cookies-popup__footer__primary-button"));
		this.email = driver.findElement(By.id("username"));
		this.password = driver.findElement(By.id("current-password"));
		this.loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Iniciar Sessão']"));

	}

	public WebElement notRegisteredEmail() throws InterruptedException {
		// TODO Auto-generated method stub)
		return driver
				.findElement(By.xpath("//p[normalize-space()='O teu email não está associado a uma conta Worten.']"));
	}

	public WebElement wrongPassword() throws InterruptedException {
		// TODO Auto-generated method stub)
		return driver.findElement(By.xpath("(//p[normalize-space()='A tua palavra-passe não está correta.'])[1]"));
	}

	public WebElement invalidPassword() throws InterruptedException {
		// TODO Auto-generated method stub)
		return driver.findElement(By.xpath("(//p[normalize-space()='Palavra-Passe inválida.'])[1]"));
	}

	public WebElement shortPasswor() throws InterruptedException {
		// TODO Auto-generated method stub)
		return driver
				.findElement(By.xpath("(//p[normalize-space()='Password tem que conter no minimo 4 caracteres'])[1]"));
	}

	public WebElement emptyPassword() throws InterruptedException {
		// TODO Auto-generated method stub)
		return driver.findElement(By.xpath("(//p[normalize-space()='Palavra-Passe obrigatória.'])[1]"));
	}

	public WebElement emptyEmail() throws InterruptedException {
		// TODO Auto-generated method stub)
		return driver.findElement(By.xpath("(//p[@class='form-error is-visible'])[1]"));
	}

	public WebElement invalidEmail() throws InterruptedException {
		// TODO Auto-generated method stub)
		return driver.findElement(By.xpath("(//p[@class='form-error is-visible'])[1]"));
	}

}