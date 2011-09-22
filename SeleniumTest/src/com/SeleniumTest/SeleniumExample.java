package com.SeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import 	org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExample  {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        WebDriver driver = new HtmlUnitDriver();
        		  driver = new FirefoxDriver();
    
        // And now use this to visit Google
        driver.get("http://rentamelo-app.cloudfoundry.com");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");
       
        //WebElement element = driver.findElement(By.linkText("Ingresar"));
        //Prueba de login correcto
        driver.findElement(By.linkText("Ingresar")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.name("j_username")).sendKeys("admin");
        driver.findElement(By.name("j_password")).sendKeys("admin");
        driver.findElement(By.name("j_password")).submit();
        System.out.println(driver.getTitle());
        //driver.findElement(By.linkText("log out")).click();
        
        //Prueba de crear articulo
        driver.findElement(By.linkText("Crear articulo")).click();
        driver.findElement(By.name("name")).sendKeys("qwer");
        driver.findElement(By.name("summary")).sendKeys("asdf");
       // driver.findElement(By.name("deadLine")).sendKeys(""); //now
        driver.findElement(By.name("details")).sendKeys("zxcv");
        driver.findElement(By.name("create")).click();
        System.out.println(driver.getTitle());
        
        //Listado de Artículos: 
        //Boton de regreso a Inicio
        driver.findElement(By.className("home")).click();
        System.out.println(driver.getTitle());
        
        
        //Prueba de logout
        //Probar que no exista cookie de login
                 
        //Close the browser
        //driver.quit();
    }
}


