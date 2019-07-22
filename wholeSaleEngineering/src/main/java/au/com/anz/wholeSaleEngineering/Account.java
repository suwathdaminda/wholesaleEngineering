package au.com.anz.wholeSaleEngineering;

import java.math.BigDecimal;
import java.util.Date;

/**
 * POJO to hold account view 
 * @author Suwath Mihindukulasooriya
 *
 */
public class Account {

	
	private String accountNo;
	private String accountName;
	private String accountType;
	private String balanceDate;
	private String currency;
	private BigDecimal openingAvailBal;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(String balanceDate) {
		this.balanceDate = balanceDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public BigDecimal getOpeningAvailBal() {
		return openingAvailBal;
	}
	public void setOpeningAvailBal(BigDecimal openingAvailBal) {
		this.openingAvailBal = openingAvailBal;
	}	
}
