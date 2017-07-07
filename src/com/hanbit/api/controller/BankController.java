package com.hanbit.api.controller;

import java.util.Vector;

import javax.swing.JOptionPane;

import com.hanbit.api.Bean.BankBean;
import com.hanbit.api.ServiceImple.BankServiceImpl;

public class BankController {
	public static void main(String[] args) {
		BankBean bean=null;
		BankServiceImpl service=new BankServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("0.Exit  1. 계좌개설 2.계좌목록 3.이름검색 4.계좌번호조회5.계좌수6.계좌7.출금8.삭제")) {
			case "0":
				return;
			case"1":
				
				String []info=JOptionPane.showInputDialog("계좌개설- 이름/아이디/주민번호/입금액").split("/");
				bean=new BankBean();
				bean.setName(info[0]);
				bean.setId(info[1]);
				bean.setPassword(info[2]);
				bean.setMoney(Integer.parseInt(info[3]));
				bean.setSsn(info[4]);
				service.createBank(bean);
			JOptionPane.showMessageDialog(null, "환영합니다"+bean.toString());
				break;
			case"2":
				Vector<BankBean>vec=service.list();
				JOptionPane.showMessageDialog(null,vec);
				break;
			case"3":
				String name="";
				String foo=JOptionPane.showInputDialog("찾으실 이름을 입력하세요");
				Vector<BankBean> vec2=service.findByName(name);
				JOptionPane.showMessageDialog(null,vec2);
				break;
			case"4":
				int accountNo1=0;
				String bar=JOptionPane.showInputDialog("찾으실 계좌번호를 입력하세요");
				BankBean findByAccountNo  =service.findByAccountNo(accountNo1);
				JOptionPane.showMessageDialog(null,"빈객체");
				break;
			case"5":
				JOptionPane.showMessageDialog(null,"계좌수");
				break;
			case"6":
				String[] baz=JOptionPane.showInputDialog("계좌번호/비번변경").split("/");
				bean.setAccountNo(Integer.parseInt((baz[0])));
				bean.setPassword(baz[1]);
				service.updatePassword(bean);
				JOptionPane.showMessageDialog(null,"비번변경 완료");
				break;
			case"7":
				String[] qux=JOptionPane.showInputDialog("계좌번호/예금금액").split("/");
				service.deposit(bean);
				JOptionPane.showMessageDialog(null,"예금 완료");
				break;
			case"8":
				JOptionPane.showInputDialog("계좌번호/예금금액").split("/");
				service.withdraw(bean);
				JOptionPane.showMessageDialog(null,"출금 완료");
				break;
			case"9":
				String delete=JOptionPane.showInputDialog("삭제");
				service.delete(Integer.parseInt(delete));
				JOptionPane.showMessageDialog(null,"계좌삭제 완료");
				break;
			}
		}
	}
}
