package plus.withTeam;

public class Account {
	
	private String AccountNum;
	private String name;
	private long money;
	
	public Account(String AccountNum, String name, long money) {
		this.AccountNum = AccountNum;
		this.name = name;
		this.money = money;
	}	
	
	//예금
	public boolean despoit(long ammount) {
		if(ammount >=0) {
			this.money += ammount;
			return true;
		}else {
			return false;
		}
	}
	//출금
	public boolean withdraw(long ammount) {
		if(ammount >=0) {
			this.money -=ammount;
			return true;
		}else {
			return false;
		}
	}
	
	public String getAccountNum() {
		return AccountNum;
	}
	
	public String getName() {
		return name;
	}
	public long getMoney() {
		return money;
	}
	
}
