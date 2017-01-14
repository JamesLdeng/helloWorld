/**  
 * @Title: Music5.java
 * @Package interfaces
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author A18ccms A18ccms_gmail_com  
 * @date 2017��1��11�� ����8:28:31
 * @version V8.0  
*/ 
package music5;

import myTool.Print;
import polymorphism.Note;

/**
 * @author Administrator
 * @Description: �ӿ��е�ÿһ��������ֻ��һ�����������Ǳ�������������ڽӿ���Ψһ�ܹ����ڵ����
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��1��11�� ����8:28:31 
 */
interface Instrument{
	int VALUE = 5; //static & final
	void play(Note n); //Automatically public
	void adjust();
}
class Wind implements Instrument{
	public void play(Note n) {
		System.out.println("Wind.play()" + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		Print.print("Adjusting Wind");
	}
}
class Percussion implements Instrument{
	public void play(Note n) {
		System.out.println("Percussion.play()" + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		Print.print("Adjusting Percussion");
	}
}
class Stringed implements Instrument{
	public void play(Note n) {
		System.out.println("Stringed" + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		Print.print("Adjusting Stringed");
	}
}
class Brass extends Wind{
	public String toString() {
		return "Brass";
	}
}
class Woodwind extends Wind{
	public String toString(){
		return "Woodwind";
	}
}

public class Music5 {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	*/
	static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument [] e){
		for (Instrument i : e) {
			tune(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument [] orchest = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchest);
	}

}
