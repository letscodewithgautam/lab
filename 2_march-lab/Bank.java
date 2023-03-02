package mar_02_23;

public class Bank {
	private long Account_Number;
	private String Account_Name;
	private Double Account_Balance,withdraw;
	public long getAccount_Number() {
		return Account_Number;
	}
	public void setAccount_Number(long account_Number) {
		Account_Number = account_Number;
	}
	public String getAccount_Name() {
		return Account_Name;
	}
	public void setAccount_Name(String account_Name) {
		Account_Name = account_Name;
	}
	public Double getAccount_Balance() {
		return Account_Balance;
	}
	public void setAccount_Balance(Double account_Balance) {
		Account_Balance = account_Balance;
	}
	public Double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(Double withdraw) {
		this.withdraw = withdraw;
	}
	
	
}
