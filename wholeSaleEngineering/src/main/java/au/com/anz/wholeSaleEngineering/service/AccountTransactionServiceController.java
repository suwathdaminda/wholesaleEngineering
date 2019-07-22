package au.com.anz.wholeSaleEngineering.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.anz.wholeSaleEngineering.AccountTransaction;

/**
 * Restful service implementation for AccountTransactionView
 * @author Suwath Mihindukulasooriya
 *
 */
@RestController
public class AccountTransactionServiceController {

		
	private static Map<String, List<AccountTransaction>> accountTransactionDetails = new HashMap<String, List<AccountTransaction>>();
	
	   
	// AccountTransaction Details
	/** @ToDo: Implement using a database.**/ 
	static {
		
			List<AccountTransaction> txnList = new ArrayList<>();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			GregorianCalendar calendar = new GregorianCalendar();
	    
			AccountTransaction SGCurrent212 = new AccountTransaction();
			SGCurrent212.setAccountNo("123-2223-212");
			SGCurrent212.setAccountName("Currenct");
		    
		    calendar.set(2018, 10, 8);
		    String valueDate = dateFormat.format(calendar.getTime());
		    SGCurrent212.setCurrency(valueDate);
		    SGCurrent212.setCurrency("SGD");
		    SGCurrent212.setCreditAmt(new BigDecimal(9540.48).setScale(2, RoundingMode.DOWN));
		    SGCurrent212.setTxType("Credit");
		    txnList.add(SGCurrent212);
		    
	      
		    SGCurrent212 = new AccountTransaction();
			SGCurrent212.setAccountNo("123-2223-212");
			SGCurrent212.setAccountName("Currenct");
		    
		    calendar.set(2012, 01, 12);
		    valueDate = dateFormat.format(calendar.getTime());
		    SGCurrent212.setCurrency(valueDate);
		    SGCurrent212.setCurrency("SGD");
		    SGCurrent212.setCreditAmt(new BigDecimal(7497.82).setScale(2, RoundingMode.DOWN));
		    SGCurrent212.setTxType("Credit");
		    txnList.add(SGCurrent212);
		    
		    SGCurrent212 = new AccountTransaction();
			SGCurrent212.setAccountNo("123-2223-212");
			SGCurrent212.setAccountName("Currenct");
		    
		    calendar.set(2012, 01, 12);
		    valueDate = dateFormat.format(calendar.getTime());
		    SGCurrent212.setCurrency(valueDate);
		    SGCurrent212.setCurrency("SGD");
		    SGCurrent212.setCreditAmt(new BigDecimal(5564.79).setScale(2, RoundingMode.DOWN));
		    SGCurrent212.setTxType("Credit");
		    txnList.add(SGCurrent212);

		    accountTransactionDetails.put("123-2223-212", txnList);
	}
	
	@RequestMapping(value = "/accountTransaction/{accountNo}")
	public ResponseEntity<Object> getAccountTransaction(@PathVariable("accountNo") String accountNo) {
	   return new ResponseEntity<>(accountTransactionDetails.get(accountNo), HttpStatus.OK);
	}
}
