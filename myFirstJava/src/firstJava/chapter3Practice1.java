/**
 * ������Ҫʵ�ֵ�������ϰһ������������
 * 
 */
package firstJava;
import java.util.Scanner;

public class chapter3Practice1 {
	public static void main(String[] args) {
		//������һ��Admin���󣬲�������������
//		System.out.println("��һ��Admin����");
		Admin adminstrator1 = new Admin();
		adminstrator1.ID = "admin1";
		adminstrator1.Password ="123456";
//		adminstrator1.showId();
//		adminstrator1.showPassword();
//		System.out.println("");
		//�ٴ���һ��Admin���󣬲�����ö��������
		/*System.out.println("��һ��Admin����");
		Admin adminstrator2 = new Admin();
		adminstrator2.ID = "admin2";
		adminstrator2.Password ="123456789";
		adminstrator2.showId();
		adminstrator2.showPassword();
		System.out.println("");*/
		 	boolean bool = true;
			System.out.println("�������û�����");
			Scanner scUser =new Scanner(System.in);
			String scUsername = scUser.next();
			System.out.println("���������룺");
			Scanner scpwd =new Scanner(System.in);
			String scPwd = scpwd.next();
			if (scUsername.equals(adminstrator1.ID) && scPwd.equals(adminstrator1.Password)) {
				do {
					System.out.println("");
					System.out.println("������������");
					Scanner scpwd1 =new Scanner(System.in);
					String scPwd1 = scpwd1.next();
					System.out.println("���ٴ�����������");
					Scanner scpwd2 =new Scanner(System.in);
					String scPwd2 = scpwd2.next();
					int newpwd = Integer.parseInt(scPwd1);
					if (scPwd1.equals(scPwd2)) {
						System.out.println("�޸�����ɹ��������������ǣ�" + newpwd);
						for(int i = 0; i < scPwd1.length();i++){
							System.out.println(scPwd1.substring(i, i+1));
						}
						bool = false;
					}else {
						System.out.println("����������������벻һ�£�����������");
						bool = true;
					}
				} while (bool);
			}
		
	}
}


class Admin{
	//���������˺ţ�����Ϊ˽������
	public String ID;
	//�����������룬����Ϊ˽������
	public String Password;
	
	//������ʾ�˺ŵķ���������Ϊ��������
	public void showId() {
		System.out.println(ID);  
	}
	//������ʾ����ķ���������Ϊ˽�з�����
	public void showPassword() {
		System.out.println(Password);
	}
}


class customer{
	//����ͻ�����������
	public String userName;
	//����ͻ��Ļ�������
	public int score;
	//����ͻ��Ŀ�����
	public String cardType;
	
	//������ʾ�ͻ���Ϣ�ķ���
	public void showInfo() {
		System.out.println("�û���" + userName);
		System.out.println("�û�����" + score);
		System.out.println("�û��Ļ��ֿ�����" + cardType);
	}
}