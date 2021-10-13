package org.utilities;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
		public static WebDriver driver;
		public static Actions a;
		public static Robot r;
		public static JavascriptExecutor js;
		public static TakesScreenshot ts;
		public static Select s;
		public static WebDriverWait w;
		public static Alert al;
		public static File f;
		public static FileInputStream fin;
		public static Workbook wb;
		public static Sheet sheet;
		public static Row row;
		public static Cell cell;
		public static FileOutputStream fout;

		//1
		public static void launchChrome() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		//2
		public static void loadUrl(String url) {
			driver.get(url);	
		}
		//3
		public static void winMax() {
			driver.manage().window().maximize();
		}
		//4
		public static void printTitle() {
			System.out.println( driver.getTitle());
		}
		//5
		public static void printCurrentUrl() {
			System.out.println(driver.getCurrentUrl());
		}
		//6
		public static void fill(WebElement ele,String value) {
			ele.sendKeys(value);
		}
		//7
		public static void btnClick(WebElement ele) {
			ele.click();
		}
		//8
		public static void winRefresh() {
			driver.navigate().refresh();
		}
		//9
		public static void gtTxt(WebElement add) {
		  add.getText();	
		}
		//10
		public static void getAtt(WebElement att,String val) {
			att.getAttribute(val);
		}
		//11
		public static void winQuit() {
			driver.quit();
		}
		//12
		public static void winClose() {
			driver.close();
		}
		//13 action
		public static void actMove(WebElement ele) {
			a = new Actions(driver);
			a.moveToElement(ele).perform();
		}
		//14
		public static void actDragDrop(WebElement src,WebElement desc) {
			a = new Actions(driver);
			a.dragAndDrop(src,desc).perform();
		}
		//15
		public static void actUp(WebElement src ) {
			a = new Actions(driver);
			a.keyUp(src, null).perform();
		}
		//16
		public static void actDown(WebElement src) {
			a = new Actions(driver);
			a.keyDown(src, null).perform();
		}
		//17
		public static void dClick(WebElement ele) {
			a = new Actions(driver);
			a.doubleClick(ele).perform();
		}
		//18
		public static void cClick(WebElement ele) {
			a = new Actions(driver);
			a.contextClick(ele).perform();
		}
		//19 Robot
		public static void kEnter() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		//20
		public static void kUp() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
		//21
		public static void kDown() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		//22
		public static void kTab() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		//23
		public static void kX() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_X);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_X);
		}
		//24
		public static void kV() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		
		}
		//25
		public static void kC() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
		
		}
		//26
		public static void kA() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_A);
		}
		//27 java Script executor
	    public static void sUp(WebElement up) {
	    	js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false)",up);
		}
		//28
		public static void sDown(WebElement down) {
			js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",down);
		}
		//29
	    public static void jsAtt(WebElement ele,String v) {
	    	js = (JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].setAttribute('value','v')", ele);
		}
		//30
		public static void jsClick(WebElement btn) {
			js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", btn);		
		}
		//30 ScreenShot
		public static void scrShot(String desc) throws IOException {
			 ts = (TakesScreenshot)driver;	
	         File s = ts.getScreenshotAs(OutputType.FILE);
	         File d = new File(desc);
	         FileUtils.copyFile(s, d);
		}
		//31 Frames
		public static void fString(String id) {	
			driver.switchTo().frame(id);
		}
		//32
		public static void fName(String name) {
			driver.switchTo().frame( name);	
		}
		//33
		public static void fEle(WebElement e) {
			driver.switchTo().frame(e);	
		}
		//34
		public static void fIndex(int index) {
			driver.switchTo().frame(index);	
		}
		//35
		public static void frameName(String name) {
			 driver.switchTo().frame(name);
		}
		//36
		 public static void defCon() {
			 driver.switchTo().defaultContent();
		 }
		 //37
		 public static void parFrame() {
		 driver.switchTo().parentFrame();
		 }
		//38 DropDown
		public static void selectIndex(WebElement ele,int i) {
		    s = new Select(ele);
		    s.selectByIndex(i);		
		}
		//39
		public static void selectVisibleText(WebElement ele,String str) {
			   s = new Select(ele);
			   s.selectByVisibleText(str);	
		}
		//40
		public static void selectValue(WebElement ele,String stri) {
			   s = new Select(ele);
			   s.selectByValue(stri);		
		}
		//41
		public static void selectMultiple(WebElement ele) {
			   s = new Select(ele);
			   s.isMultiple();	
		}
		//42
		public static void getOption(WebElement ele) {
			   s = new Select(ele);
			   s.getOptions();		
		}
		//43
		public static void allSelOption(WebElement ele) {
			   s = new Select(ele);
			   s.getAllSelectedOptions();		
		}
		//44
		public static void firstSelOption(WebElement ele) {
			   s = new Select(ele);
			   s.getFirstSelectedOption();	
		}
		//45
		public static void deSelectIndex(WebElement ele,int i) {
		    s = new Select(ele);
		    s.deselectByIndex(i);		
		}
		//46
		public static void deSelectVisibleText(WebElement ele,String str) {
			  s = new Select(ele);
			  s.deselectByVisibleText(str);
		}
		//47
		public static void deSelectValue(WebElement ele,String stri) {
			   s = new Select(ele);
			   s.deselectByValue(stri);		
		}
		//48
		public static void deSelAll(WebElement ele) {
			  s = new Select(ele);
			  s.deselectAll();		
		}
		//49 Windows Handling
		public static void winStr(String url) {
			driver.switchTo().window(url); 	  		
		}
		//50
		public static void winTitle(String tit) {
			driver.switchTo().window(tit); 		
		}
		//51
		public static void winId (String id) {
			driver.switchTo().window(id);
		}
		//52
		public static void winHand() {
			driver.getWindowHandle();
		}
		//53
		public static void winHands() {
			driver.getWindowHandles();
		}
		//54 Waits
		public static void iWaits(int num) {
		    driver.manage().timeouts().implicitlyWait(num,TimeUnit.SECONDS);	
		}
		//55
		public static void eWaitsClick(int num,String id ) {
		    w = new WebDriverWait(driver,num);
		    w.until(ExpectedConditions.elementToBeClickable(By.id(id)));  
		}
		//56
		public static void sleep() throws InterruptedException {
			Thread.sleep(3000);
		}
		//57 Alert
		public static void alAccept() {   
			   driver.switchTo().alert();
			   al.accept();
		}
		//58
		public static void alDismiss() {   
			   driver.switchTo().alert();
			   al.dismiss();
		}
		//59
		public static void algetText() {   
			   driver.switchTo().alert();
			   al.getText();
		}
		//60
		public static void alSendkeys(String ele) {   
			   driver.switchTo().alert();
			   al.sendKeys(ele);
		}
		//61 File
		public static void nFile(String loc) {
			f = new File(loc);
		}
		//62
		public static void fileInput() throws FileNotFoundException {
		   fin = new FileInputStream(f);	
		}
		//63
		public static void WBook() throws IOException {
			wb = new XSSFWorkbook(fin);
		}
		//64
		public static void getSht(String val) {
			sheet = wb.getSheet(val);
		}
		//65
		public static void getRow(int val) {
			row = sheet.getRow(val);
		}
		//66
		public static void getCl(int val) {
		    cell = row.getCell(val);
		}
		//67
		public static void phyRow() {                   
		   sheet.getPhysicalNumberOfRows();
		}
		//68
	    public static void phyCell() {
		   row.getPhysicalNumberOfCells();	
		}
	    //69
	    public static void fileOutput() throws FileNotFoundException {
	    	fout = new FileOutputStream(f);
	    }
	    //70
	    public static void writeData() throws IOException {
	 	   wb.write(fout);
	    } 
	    public static void prntStTime() {
	    	Date dte = new Date();
	    	System.out.println(dte);
	    }
	    public static void prntEndTime() {
			Date dte = new Date();
			System.out.println(dte);
		}
		public static String getData(int row,int cell) throws IOException {
			File f =new File("C:\\Users\\PREETHA\\eclipse-workspace\\TestProject\\target\\ExcelData\\pree.xlsx");
			FileInputStream fin = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fin);
			Sheet sheet = wb.getSheet("greens");
			Row r1 = sheet.getRow(row);
			Cell c1 = r1.getCell(cell);
			String value = c1.getStringCellValue();
			return value;
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}


