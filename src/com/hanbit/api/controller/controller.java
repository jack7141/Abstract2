package com.hanbit.api.controller;

import javax.swing.JOptionPane;

import com.hanbit.api.Bean.BankBean;
import com.hanbit.api.ServiceImple.BankServiceImpl;

public class controller {
	public static void main(String[]args){
BankBean bean=null;
BankServiceImpl service=new BankServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("0.1.2.3.4.5.6.7.8.9.")) {
			case "0":
				return;

			case "1":
				JOptionPane.showInputDialog("이름/주민/아이디");
				bean=new BankBean();
				service.createBank(bean);
				JOptionPane.showMessageDialog(null,"");
				break;

			case"2":
				service.list();
				JOptionPane.showMessageDialog(null,"");
				break;
			case"3":
				JOptionPane.showInputDialog("");
				String name="";
				bean=new BankBean();
				service.findByName(name);
				JOptionPane.showMessageDialog(null,"");
				break;
			case"4":
				JOptionPane.showInputDialog("");
				int accountNo=0;
				service.findByAccountNo(accountNo);
				JOptionPane.showMessageDialog(null,"");
				break;
			case"5":
				service.countAccount();
				JOptionPane.showMessageDialog(null,"");
				break;
			case"6":
				JOptionPane.showInputDialog("");
				bean=new BankBean();
				service.updatePassword(bean);
				JOptionPane.showMessageDialog(null,"");
				break;
			case"7":
				JOptionPane.showInputDialog("");
				bean=new BankBean();
				service.deposit(bean);
				JOptionPane.showMessageDialog(null,"");
				break;
			case"8":
				JOptionPane.showInputDialog("");
				bean=new BankBean();
				service.withdraw(bean);
				JOptionPane.showMessageDialog(null,"");
				break;
			case"9":
				JOptionPane.showInputDialog("");
				int accountNo2=0;
				service.delete(accountNo2);
				JOptionPane.showMessageDialog(null,"");
				break;
			
			}
			
		}
		
	}

}
