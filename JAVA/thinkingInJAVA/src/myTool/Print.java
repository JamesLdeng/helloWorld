//:myTool/Print.java
//Print methods that can be used without
//qualifiers, using Java SE8 static imports:
package myTool;

import java.io.PrintStream;

public class Print {
	//Print with a new line:
	public static void print(Object obj) {
		System.out.println(obj);
	}
	//Print a new line by itself:
	public static void print() {
		System.out.println();
	}
	//Print with no line break:
	public static void printnb(Object obj) {
		System.out.print(obj);
	}
	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}
}
