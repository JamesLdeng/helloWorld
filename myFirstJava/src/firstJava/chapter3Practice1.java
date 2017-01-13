/**
 * 该类主要实现第三章练习一，标题有异议
 * 
 */
package firstJava;
import java.util.Scanner;

public class chapter3Practice1 {
	public static void main(String[] args) {
		//创建第一个Admin对象，并输出对象的属性
//		System.out.println("第一个Admin对象");
		Admin adminstrator1 = new Admin();
		adminstrator1.ID = "admin1";
		adminstrator1.Password ="123456";
//		adminstrator1.showId();
//		adminstrator1.showPassword();
//		System.out.println("");
		//再创建一个Admin对象，并输出该对象的属性
		/*System.out.println("第一个Admin对象");
		Admin adminstrator2 = new Admin();
		adminstrator2.ID = "admin2";
		adminstrator2.Password ="123456789";
		adminstrator2.showId();
		adminstrator2.showPassword();
		System.out.println("");*/
		 	boolean bool = true;
			System.out.println("请输入用户名：");
			Scanner scUser =new Scanner(System.in);
			String scUsername = scUser.next();
			System.out.println("请输入密码：");
			Scanner scpwd =new Scanner(System.in);
			String scPwd = scpwd.next();
			if (scUsername.equals(adminstrator1.ID) && scPwd.equals(adminstrator1.Password)) {
				do {
					System.out.println("");
					System.out.println("请输入新密码");
					Scanner scpwd1 =new Scanner(System.in);
					String scPwd1 = scpwd1.next();
					System.out.println("请再次输入新密码");
					Scanner scpwd2 =new Scanner(System.in);
					String scPwd2 = scpwd2.next();
					int newpwd = Integer.parseInt(scPwd1);
					if (scPwd1.equals(scPwd2)) {
						System.out.println("修改密码成功，您的新密码是：" + newpwd);
						for(int i = 0; i < scPwd1.length();i++){
							System.out.println(scPwd1.substring(i, i+1));
						}
						bool = false;
					}else {
						System.out.println("您两次输入的新密码不一致，请重新输入");
						bool = true;
					}
				} while (bool);
			}
		
	}
}


class Admin{
	//定义属性账号，定义为私有属性
	public String ID;
	//定义属性密码，定义为私有属性
	public String Password;
	
	//定义显示账号的方法，定义为公共方法
	public void showId() {
		System.out.println(ID);  
	}
	//定义显示密码的方法，定义为私有方法；
	public void showPassword() {
		System.out.println(Password);
	}
}


class customer{
	//定义客户的名字属性
	public String userName;
	//定义客户的积分属性
	public int score;
	//定义客户的卡类型
	public String cardType;
	
	//定义显示客户信息的方法
	public void showInfo() {
		System.out.println("用户名" + userName);
		System.out.println("用户积分" + score);
		System.out.println("用户的积分卡类型" + cardType);
	}
}