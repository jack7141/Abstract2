package com.hanbit.api.Bean;

public class BankBean {
	private String name, password, id, date, ssn ;
	private  int accountNo, money;
	public static final String BANK_NAME="우리은행"; 
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public int accountNo() {
		return accountNo;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	public String toString(){
		return String.format( "계좌정보[이름:%s 아이디:%s 비밀번호:%s 주민등록번호:%s ]" ,name,id,password,ssn);
	}

}
