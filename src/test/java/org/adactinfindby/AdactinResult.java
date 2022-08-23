package org.adactinfindby;

import java.io.IOException;
import org.openqa.selenium.WebElement;

public class AdactinResult extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		// BaseClass b = new BaseClass();
		browserLaunch();
		getBrowser("https://adactinhotelapp.com/");

		AdactinFindBy aa = new AdactinFindBy();
		String excelValue = getExcelValue("Book1", "Mersal", 1, 0);
		aa.getUser().sendKeys(excelValue);

		String value = getExcelValue("Book1", "Mersal", 1, 1);
		aa.getPass().sendKeys(value);

		aa.getLog().click();

		String value2 = getExcelValue("Book1", "Mersal", 8, 2);
		aa.getLoc().sendKeys(value2);

		String value3 = getExcelValue("Book1", "Mersal", 4, 3);
		aa.getHotel().sendKeys(value3);

		String value4 = getExcelValue("Book1", "Mersal", 4, 4);
		aa.getRoom().sendKeys(value4);

		String value5 = getExcelValue("Book1", "Mersal", 2, 5);
		aa.getNos().sendKeys(value5);

		String value6 = getExcelValue("Book1", "Mersal", 1, 6);
		WebElement pickin = aa.getPickin();
		pickin.clear();
		pickin.sendKeys(value6);

		String value7 = getExcelValue("Book1", "Mersal", 1, 7);
		WebElement pickout = aa.getPickout();
		pickout.clear();
		pickout.sendKeys(value7);

		String value8 = getExcelValue("Book1", "Mersal", 2, 8);
		aa.getAdult().sendKeys(value8);

		String value9 = getExcelValue("Book1", "Mersal", 3, 9);
		aa.getChild().sendKeys(value9);

		aa.getSearch().click();
		aa.getButton().click();
		aa.getContinuebutton().click();

		String value10 = getExcelValue("Book1", "Mersal", 1, 10);
		aa.getFname().sendKeys(value10);

		String value11 = getExcelValue("Book1", "Mersal", 1, 11);
		aa.getLname().sendKeys(value11);

		String value12 = getExcelValue("Book1", "Mersal", 1, 12);
		aa.getAddress().sendKeys(value12);

		String value13 = getExcelValue("Book1", "Mersal", 2, 13);
		aa.getCc().sendKeys(value13);

		String value14 = getExcelValue("Book1", "Mersal", 2, 14);
		aa.getType().sendKeys(value14);

		String value15 = getExcelValue("Book1", "Mersal", 12, 15);
		aa.getCcmon().sendKeys(value15);

		String value16 = getExcelValue("Book1", "Mersal", 12, 16);
		aa.getCcyear().sendKeys(value16);

		String value17 = getExcelValue("Book1", "Mersal", 1, 17);
		aa.getCvv().sendKeys(value17);

		aa.getBooknow().click();
		Thread.sleep(6000);
		aa.getMylit().click();
		
		WebElement orderId = aa.getOrderId();
		String attribute = orderId.getAttribute("value");
		System.out.println(attribute);
		
		createExcelvalue("Book1", "Mersal", 1, 18, attribute);
		
	}

}
