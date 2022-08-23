package org.adactinfindby;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class AdactinFindBy extends BaseClass {

	public AdactinFindBy() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement user;

	@FindAll({ @FindBy(id = "password"), @FindBy(xpath = "(//input[@class='login_input'])[2]") })
	private WebElement pass;

	@FindAll({ @FindBy(name = "login"), @FindBy(id = "login") })
	private WebElement log;

	@FindBy(id = "location")
	private WebElement loc;

	@FindAll({ @FindBy(id = "hotels"), @FindBy(xpath = "(//select[@class='search_combobox'])[2]") })
	private WebElement hotel;

	@FindAll({ @FindBy(id = "room_type"), @FindBy(xpath = "(//select[@class='search_combobox'])[3]") })
	private WebElement room;

	@FindBy(id = "room_nos")
	private WebElement nos;

	@FindBy(name = "datepick_in")
	private WebElement pickin;

	@FindBy(id = "datepick_out")
	private WebElement pickout;

	@FindAll({ @FindBy(id = "adult_room"), @FindBy(name = "adult_room") })
	private WebElement adult;

	@FindAll({ @FindBy(id = "child_room"), @FindBy(xpath = "(//select[@class='search_combobox'])[6]") })
	private WebElement child;

	@FindAll({ @FindBy(id = "Submit"), @FindBy(name = "Submit") })
	private WebElement search;

	@FindAll({ @FindBy(id = "radiobutton_0"), @FindBy(name = "radiobutton_0") })
	private WebElement button;

	@FindAll({ @FindBy(id = "continue"), @FindBy(name = "continue") })
	private WebElement continuebutton;

	@FindAll({ @FindBy(id = "first_name"), @FindBy(name = "first_name") })
	private WebElement fname;

	@FindAll({ @FindBy(id = "last_name"), @FindBy(xpath = "(//input[@class='reg_input'])[2]") })
	private WebElement lname;

	@FindAll({ @FindBy(id = "address"), @FindBy(name = "address") })
	private WebElement address;

	@FindAll({ @FindBy(id = "cc_num"), @FindBy(name = "cc_num") })
	private WebElement cc;

	@FindAll({ @FindBy(id = "cc_type"), @FindBy(name = "cc_type") })
	private WebElement type;

	@FindAll({ @FindBy(id = "cc_exp_month"), @FindBy(name = "cc_exp_month") })
	private WebElement ccmon;

	@FindAll({ @FindBy(name = "cc_exp_year"), @FindBy(id = "cc_exp_year") })
	private WebElement ccyear;

	@FindAll({ @FindBy(name = "cc_cvv"), @FindBy(id = "cc_cvv") })
	private WebElement cvv;

	@FindAll({ @FindBy(name = "book_now"), @FindBy(id = "book_now") })
	private WebElement booknow;
	
	@FindBys({@FindBy(id="my_itinerary"),@FindBy(xpath="//*[@value='My Itinerary']")})
	private WebElement mylit;
	
	@FindAll({@FindBy(id="order_id_676874"),@FindBy(xpath="(//*[@class='select_text'])[1]")})
	private WebElement orderId;

	public WebElement getOrderId() {
		return orderId;
	}

	public void setOrderId(WebElement orderId) {
		this.orderId = orderId;
	}

	public WebElement getMylit() {
		return mylit;
	}

	public void setMylit(WebElement mylit) {
		this.mylit = mylit;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNos() {
		return nos;
	}

	public WebElement getPickin() {
		return pickin;
	}

	public WebElement getPickout() {
		return pickout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getCcmon() {
		return ccmon;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

}
