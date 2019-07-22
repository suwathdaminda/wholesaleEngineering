package au.com.anz.wholeSaleEngineering.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.format.DateTimeFormatterBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.anz.wholeSaleEngineering.Account;

/**
 * Restful service implementation for Account View
 * @author Suwath Mihindukulasooriya
 *
 */
@RestController
public class AccountServiceController {

	
	private static List<Account> accountDetails = new ArrayList<>();
	   
	// Account Details
	/** @ToDo: Implement using a database.**/ 
	static {
		
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			GregorianCalendar calendar = new GregorianCalendar();
	    
			Account SGSavings726 = new Account();
		    SGSavings726.setAccountNo("585309209");
		    SGSavings726.setAccountName("SGSavings726");
		    SGSavings726.setAccountType("Savings");
		    calendar.set(2018, 10, 8);
		    String balanceDate = dateFormat.format(calendar.getTime());
		    SGSavings726.setBalanceDate(balanceDate);
		    SGSavings726.setCurrency("SGD");
		    SGSavings726.setOpeningAvailBal(new BigDecimal(84327.51).setScale(2, RoundingMode.DOWN));
		    accountDetails.add(SGSavings726);
	      
		    Account AUSavings933 = new Account();
		    AUSavings933.setAccountNo("791066619");
		    AUSavings933.setAccountName("AUSavings933");
		    AUSavings933.setAccountType("Savings");
		    calendar.set(2018, 10, 8);
		    balanceDate = dateFormat.format(calendar.getTime());
		    AUSavings933.setBalanceDate(balanceDate);
		    AUSavings933.setCurrency("AUD");
		    AUSavings933.setOpeningAvailBal(new BigDecimal(88005.93).setScale(2, RoundingMode.DOWN));
		    accountDetails.add(AUSavings933);
		    
		    Account AUCurrent433 = new Account();
		    AUCurrent433.setAccountNo("321143048");
		    AUCurrent433.setAccountName("AUCurrent433");
		    AUCurrent433.setAccountType("Current");
		    calendar.set(2018, 10, 8);
		    balanceDate = dateFormat.format(calendar.getTime());
		    AUCurrent433.setBalanceDate(balanceDate);
		    AUCurrent433.setCurrency("AUD");
		    AUCurrent433.setOpeningAvailBal(new BigDecimal(38010.62).setScale(2, RoundingMode.DOWN));
		    accountDetails.add(AUCurrent433);
		    
		    Account SGCurrent166 = new Account();
		    SGCurrent166.setAccountNo("347786244");
		    SGCurrent166.setAccountName("SGCurrent166");
		    SGCurrent166.setAccountType("Current");
		    calendar.set(2018, 10, 8);
		    balanceDate = dateFormat.format(calendar.getTime());
		    SGCurrent166.setBalanceDate(balanceDate);
		    SGCurrent166.setCurrency("SGD");
		    SGCurrent166.setOpeningAvailBal(new BigDecimal(50664.65).setScale(2, RoundingMode.DOWN));
		    accountDetails.add(SGCurrent166);
		    
		    Account AUCurrent374 = new Account();
		    AUCurrent374.setAccountNo("680168913");
		    AUCurrent374.setAccountName("AUCurrent374");
		    AUCurrent374.setAccountType("Current");
		    calendar.set(2018, 10, 8);
		    balanceDate = dateFormat.format(calendar.getTime());
		    AUCurrent374.setBalanceDate(balanceDate);
		    AUCurrent374.setCurrency("AUD");
		    AUCurrent374.setOpeningAvailBal(new BigDecimal(41327.28).setScale(2, RoundingMode.DOWN));
		    accountDetails.add(AUCurrent374);
	}
	   
	   
	@RequestMapping(value = "/accountDetail")
	public ResponseEntity<Object> getAccount() {
	   return new ResponseEntity<>(accountDetails, HttpStatus.OK);
	}
}
