package com.adactin.Adactin;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
public static WebDriver driver;
	        //send keys -1 
	       public static void sendin(WebElement element , String value) {
	            element.sendKeys(value);
		}
		 //click  -2
	       public static void eclick(WebElement element) {
	           element.click();
		}
	       //clear -3 
		    public void eclear(WebElement element) {
	              element.clear();
			}
		    
		    //checkbox -4
		    public static void checkbox(WebElement element) {
	              element.click();
			}
		    //isenable -5
		    public static void enable(WebElement element) {
	            boolean e = element.isEnabled();
	            System.out.println(e);
			}
		     //isdisplayed -6
		    public static void display(WebElement element) {
	              boolean d = element.isDisplayed(); 
	              System.out.println(d);
			}
		     //isselected -7
		    public static void selected(WebElement element) {
	              boolean s = element.isSelected();
	              System.out.println(s);
			}
		    //get text -8
		    public  static void print(WebElement element) {
	          String t = element.getText();
	          System.out.println(t);
			}
		    //get attribute -9
		    
		    public static void getattri(WebElement element,String value) {
	             String a = element.getAttribute(value);
	             System.out.println(a);
			}
		    
		    
		    //multipledropdown -10
		    public  static void multiple(WebElement element,String value,String options) throws Throwable {
	             Select s  = new Select(element);
	             try {
					if (options.equalsIgnoreCase("by index")) {
						//  string integer convert 
						 int p = Integer.parseInt(value);
						 s.selectByIndex(p);
						 	 
					}else if (options.equalsIgnoreCase("by value")) {
						s.selectByValue(value);
					}
					else if (options.equalsIgnoreCase("by visibletext")) {
						s.selectByVisibleText(value);
					}
					 else  {
						 throw new Exception(); 
					       
					}
				} catch (Exception e) {
					System.out.println("invalid select");
					
				}
	             
			}
		      
		    //browser launch -11
		    
		    public static WebDriver broswerlaunch(String browser) throws Throwable {

		    	
		    	try {
					if (browser.equalsIgnoreCase("chrome")) {
						System.setProperty("webdriver.chrome.driver","C:\\Users\\Reena\\eclipse-workspace\\AdactinProjectMain\\Adactin\\Adactin\\Chrome\\chromedriver.exe");
						
						 driver = new ChromeDriver();
						
					}
					else if (browser.equalsIgnoreCase("gecko")) {
						System.setProperty("webdriver.gecko.driver","");
						 driver = new FirefoxDriver();
						
					}
					else if (browser.equalsIgnoreCase("edge")) {
						System.setProperty("webdriver.edge.driver","C:\\Users\\Sys\\eclipse-workspace\\SeleniumProject\\Driver\\msedgedriver.exe");
						driver = new  EdgeDriver();	
					}
					else {
						throw new Exception();
					}
				} catch (Exception e) {
					System.out.println("invalid browser");
				}
		    	
		    	driver.manage().window().maximize();
		    	return driver;
		    	
		    }
		    //close -12
		    public static void close() {
	             driver.close();
			}
		 //quit -13
		    public static void quit() {
	                driver.quit();
			}
		    //to -14
		    public static void navigateto(String url) {
	             driver.navigate().to(url);
			}
		    
		    //back -15
		    public static void back() {
	              driver.navigate().back();
			}
		    //forward -16
		    public static void forward() {
	              driver.navigate().forward();
			}  
		    //refresh -17
		    public static void refresh() {
	                driver.navigate().refresh();
			}
		    //get -18
		    public static void get(String url) {
	             driver.get(url);
			}
		    //get title -19
		    public static void title() {
	             String ti = driver.getTitle();
	             System.out.println(ti);
			}
		    //get current url -20
		    public static void currenturl() {
	              String c = driver.getCurrentUrl();
	              System.out.println(c);
			}
		    //get options  -21
		    public static void options(WebElement element) {
	                Select s = new Select(element);
	                List<WebElement> o = s.getOptions();
	                for (WebElement get : o) {
						System.out.println(get.getText());
					}     		
			}
		    //is multiple  -22
		    private void multiple(WebElement element) {
	             Select s1 = new Select(element);
	             boolean m = s1.isMultiple();
	             System.out.println(m);
			}
		    //deselectall -23
		    public static void deselectall(WebElement element) {
	              Select s2 = new Select(element);
	              s2.deselectAll();
			}
		
		    //getfirstselected -24
		    public static void getfirst(WebElement element) {
	                  Select s3 = new Select(element);
	                  WebElement f = s3.getFirstSelectedOption();
	                  System.out.println(f.getText());
			}
		
		    //get all selected options -25
		    public static void getall(WebElement element) {
	           Select s4 = new Select(element);
	           List<WebElement> all = s4.getAllSelectedOptions();
	           for (WebElement get : all) {
	        	   System.out.println(get.getText());
				}
			}
		    //deselect -26
		    public static void deselect(WebElement element, String value , String options) throws Throwable {

		    	try {
					if (options.equalsIgnoreCase("by index")) {
						Select s5 = new Select(element);
						int p = Integer.parseInt(value);
						s5.deselectByIndex(p);
						
					}else if (options.equalsIgnoreCase("by value")) {
						Select s6 =   new Select(element);
						s6.deselectByValue(value);
					}else if (options.equalsIgnoreCase("by visibletext")) {
						Select s7 = new Select(element);
						s7.deselectByVisibleText(value);
					}else {
						throw new Exception();
					}
					
				} catch (Exception e) {
					System.out.println("invalid deselect  one");
				}
		    	
		    	
			}
		    //thread -27
		    public static void thread() throws Throwable {
	             Thread.sleep(5000);
			}
		    //waiting -28
		    public static void waiting() {
	               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		    //alert accept -29
		    public static void alertok() {
	              Alert a = driver.switchTo().alert();
	              a.accept();
			}
		    //alert dismiss -30
		    public static void alertcancel() {
	             Alert al = driver.switchTo().alert();
	             al.dismiss();
			}
		    //alert get text -31
		    public static void alerttext() {
	             Alert ale = driver.switchTo().alert();
	             String t = ale.getText();
	             System.out.println(t);
			}
		    //alert send keys -32
		    public  static void alertsend(String value) {
	                Alert a = driver.switchTo().alert();
	                   a.sendKeys(value);
	                      
			}
		    
		    //frame -33
		    public static void frame(int n) {
		    	   
	               driver.switchTo().frame(n);
			}
		    // default content -34
		    public  static void content() {
	              driver.switchTo().defaultContent();
			}
		    
		    
		    
		    //robot  -35
		    public static void robot(String options) throws Throwable {
	             Robot r = new Robot();
	             // AWT Exception
	             try {
					if (options.equalsIgnoreCase("down")) {
						r.keyPress(KeyEvent.VK_DOWN);
						r.keyRelease(KeyEvent.VK_DOWN);
						
						r.keyPress(KeyEvent.VK_ENTER);
						r.keyRelease(KeyEvent.VK_ENTER);
					}else {
						throw new Exception();
					}
				} catch (Exception e) {
					System.out.println("invalid key input");
				}
			}
		    
		    
		    //action chains -36
		    
		   public  static void action(WebElement element, String options) throws Throwable {
	             Actions a = new Actions(driver);
	             try {
					if (options.equalsIgnoreCase("click")) {
						a.click(element).perform();
					}else if (options.equalsIgnoreCase("context click")) {
						a.contextClick(element).perform();
					}else if (options.equalsIgnoreCase("double click")) {
						a.doubleClick(element).perform();
					}else if (options.equalsIgnoreCase("move to element")) {
						a.moveToElement(element).perform();
					}
//					else if (options.equalsIgnoreCase("drag and drop")) {
//						a.dragAndDrop(element, drop).perform();
//					}
					else {
						throw new Exception();
					}
				} catch (Exception e) {
					System.out.println("invalid mouse action");
				}
		}
		   // screenshot -37
		   public static void screenshot() throws Throwable {
//			  Date date = new Date();
//			  SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyy/dd/mm/ss");
//			  String s = sdf.format(date);
			  
			   TakesScreenshot  ts = (TakesScreenshot) driver;
			   File source = ts.getScreenshotAs(OutputType.FILE);
			   File destination = new File("C:\\Users\\Sys\\eclipse-workspace\\Adactin\\screenshots");
			   FileUtils.copyFile(source, destination);

			   System.out.println("photo taken");
			   
			   
		}
		   
		// screenshot -37
		   public static void shot() throws Throwable {
			  
			   TakesScreenshot  ts = (TakesScreenshot) driver;
			   File source = ts.getScreenshotAs(OutputType.FILE);
			   File destination = new File("C:\\Users\\Sys\\eclipse-workspace\\Adactin\\screenshots\\two.png");
			   FileUtils.copyFile(source, destination);

			   System.out.println("photo taken");
			   
			   
		}
		   
		
	}


