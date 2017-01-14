/**  
 * @Title: Music5.java
 * @Package interfaces
 * @Description: TODO(用一句话描述该文件做什么)
 * @author A18ccms A18ccms_gmail_com  
 * @date 2017年1月11日 上午8:28:31
 * @version V8.0  
*/ 
package music5;

import myTool.Print;
import polymorphism.Note;

/**
 * @author Administrator
 * @Description: 接口中的每一个方法都只是一个声明，这是编译器所允许的在接口中唯一能够存在的事物。
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年1月11日 上午8:28:31 
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
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
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
