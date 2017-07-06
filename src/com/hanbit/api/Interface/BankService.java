package com.hanbit.api.Interface;

import java.util.Vector;

import com.hanbit.api.Bean.BankBean;

public interface BankService {
public void  createBank(BankBean bean);
public	Vector<BankBean> list();
public Vector<BankBean> findByName(String name);
public	BankBean findByAccountNo(int accountNo);
public	int countAccount();
public	void updatePassword(BankBean bean);
public	void deposit(BankBean bean);
public	void withdraw(BankBean bean);
public void delete(int accountNo);
}
