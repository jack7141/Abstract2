package com.hanbit.api.ServiceImple;

import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

import com.hanbit.api.Bean.BankBean;
import com.hanbit.api.Interface.BankService;

public class BankServiceImpl implements BankService {
	
	Vector<BankBean> vec;
	
	public BankServiceImpl(long BankBean) {
		Random r1=new Random(BankBean);
		vec = new Vector<BankBean>(10, 10);
	}

	

	@Override
	public void createBank(BankBean bean) {
		// 계좌개설
		int randomNO=(int)(Math.random()*99999999+10000000);
		Calendar now=Calendar.getInstance();
		int yy=now.get(now.YEAR);
		int mm=now.get(now.MONTH);
		int dd=now.get(now.DAY_OF_MONTH);
		vec.add(bean);
	}

	@Override
	public Vector<BankBean> list() {
		// 계좌전체목록
		return vec;
	}

	@Override
	public Vector<BankBean> findByName(String name) {
		// 이름검색(동명이인허용)
		Vector<BankBean> temp=new Vector<BankBean>(10,10);
		for(int i=0;i<temp.size();i++){
			if(name.equals(vec.get(i).getName())){
				
			}
		}
		return vec ;
	}

	@Override
	public BankBean findByAccountNo(int accountNo) {
//계좌조회
		Vector<BankBean> temp=new Vector<BankBean>(10,10);
	
		return null;
	}

	@Override
	public int countAccount() {
//전체계좌
		return vec.size();
	}

	@Override
	public void updatePassword(BankBean bean) {
		//비밀번호변경
	}

	@Override
	public void deposit(BankBean bean) {
		// 예금
	}

	@Override
	public void withdraw(BankBean bean) {
		// 인출
	}

	@Override
	public void delete(int accountNo) {
		// 삭제
	}
}
/*
 * @Override public void createBank(BankBean bean) { //계좌개설 }
 * 
 * @Override public BankBean[] list() { //계좌전체목록 return null; }
 * 
 * @Override public BankBean[] findByname(String name) { //이름검색(동명이인허용) return
 * null; }
 * 
 * @Override public BankBean findByAccountNo(int accountNo) { //계좌번호 조회 return
 * null; }
 * 
 * @Override public int countAccount() { //전계좌수 return 0; }
 * 
 * @Override public void updatePassword(BankBean bean) { //비번변경 }
 * 
 * @Override public void deposit(BankBean bean) { //계좌 }
 * 
 * @Override public void withdraw(BankBean bean) { //출금 }
 * 
 * @Override public void delete(int accountNo) { //삭제 } }
 */