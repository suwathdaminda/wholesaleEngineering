package au.com.anz.wholeSaleEngineering;

import java.math.BigDecimal;

/**
 * POJO for Account Transaction Details View
 * @author Suwath Mihindukulasooriya
 *
 */
public class AccountTransaction {

	
	private String accountNo;
	private String accountName;
	private String valueDate;
	private String currency;
	private BigDecimal debitAmt;
	private BigDecimal creditAmt;
	private String txType;
	private String txNarrative;

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
	public String getValueDate() {
		return valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public BigDecimal getDebitAmt() {
		return debitAmt;
	}
	public void setDebitAmt(BigDecimal debitAmt) {
		this.debitAmt = debitAmt;
	}
	public BigDecimal getCreditAmt() {
		return creditAmt;
	}
	public void setCreditAmt(BigDecimal creditAmt) {
		this.creditAmt = creditAmt;
	}
	public String getTxType() {
		return txType;
	}
	public void setTxType(String txType) {
		this.txType = txType;
	}
	public String getTxNarrative() {
		return txNarrative;
	}
	public void setTxNarrative(String txNarrative) {
		this.txNarrative = txNarrative;
	}
}
