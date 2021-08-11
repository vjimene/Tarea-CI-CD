package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class TestWeb {

	private WebDriver driver; 
	
	@Test
	public void testOne() {	
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8080/");
		
		WebElement boton = driver.findElement(By.id("btnAgregar"));
		boton.click();
		WebElement nombre = driver.findElement(By.id("inputName"));
		nombre.sendKeys("Mauricio Nicolás");
		WebElement apellP = driver.findElement(By.id("inputFirstSurname"));
		apellP.sendKeys("Barrios");
		WebElement apellM = driver.findElement(By.id("inputSecondSurname"));
		apellM.sendKeys("Prouvay");
		WebElement email = driver.findElement(By.id("inputEmail"));
		email.sendKeys("maur1.mn9@gmail.com");
		WebElement tel = driver.findElement(By.id("inputTel"));
		tel.sendKeys("962354310");
		WebElement rut = driver.findElement(By.id("inputrut"));
		rut.sendKeys("196613021");
		WebElement birthday = driver.findElement(By.id("inputbd"));
		birthday.sendKeys("25101997");
		WebElement club = driver.findElement(By.id("inputclub"));
		club.sendKeys("Karate Kid");
		WebElement addCo = driver.findElement(By.id("inputAddressCo"));
		addCo.sendKeys("Caremen 446");
		WebElement telCo = driver.findElement(By.id("inputTelCo"));
		telCo.sendKeys("12345678");
		WebElement webPage = driver.findElement(By.id("inputWebPage"));
		webPage.sendKeys("https://www.google.com/");
		WebElement btnG = driver.findElement(By.id("btnguardar"));
		btnG.click();
		
		List<WebElement> lista =  driver.findElements(By.tagName("td"));
		assertEquals("Mauricio Nicolás", lista.get(1).getText());
		assertEquals("Barrios", lista.get(2).getText());
		assertEquals("Prouvay", lista.get(3).getText());
		assertEquals("maur1.mn9@gmail.com", lista.get(4).getText());
		assertEquals("Karate Kid", lista.get(5).getText());
		
		driver.quit();
	}
	
	@Test
	public void testTwo() {	
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8080/");
		
		WebElement boton = driver.findElement(By.id("btnEditar"));
		boton.click();
		WebElement nombre = driver.findElement(By.id("inputName"));
		nombre.clear();
		nombre.sendKeys("Piscolita");
		WebElement btnG = driver.findElement(By.id("btnguardar"));
		btnG.click();
		
		List<WebElement> lista =  driver.findElements(By.tagName("td"));
		assertEquals("Piscolita", lista.get(1).getText());
		
		driver.quit();
	}
	
	@Test
	public void testThree() {	
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8080/");
		
		WebElement boton = driver.findElement(By.id("btnEliminar"));
		boton.click();
		
		List<WebElement> lista =  driver.findElements(By.tagName("td"));
		assertEquals(true, lista.isEmpty());
		
		driver.quit();
	}

}
