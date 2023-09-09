package tests;

import java.io.IOException;


import org.testng.annotations.Test;

import automationTask2.PayByCardPage;
import automationTask2.SeatSelectionPage;

public class BookingTripTest extends BaseTest {

	public BookingTripTest() throws IOException {
		super();
	}
	@Test
	public void TestBooking() throws InterruptedException {
	homePageObj.enterTripInformation();
	SeatSelectionPage selectObj =	homePageObj.selectSeat();
	PayByCardPage payByCardObj = selectObj.selectAndMakePayment(prop.getProperty("phoneNumber"), prop.getProperty("email"),prop.getProperty("passengerName"),prop.getProperty("passengerGender"),prop.getProperty("passengerAge"),prop.getProperty("concession"));
	payByCardObj.fillAllTheFields(prop.getProperty("cardNumber"),prop.getProperty( "month"),prop.getProperty("year") , prop.getProperty("cvv"), prop.getProperty( "cardHolderName"));
	}

}
