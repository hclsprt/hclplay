/******************************************************************************
 *  Compilation:  javac HiWorld.java
 *  Execution:    java HiWorld [arg0 arg1 ...]
 *
 ******************************************************************************/

public class HiWorld {

    public static void main(String[] args) {
        // Prints "Hi, World" to the terminal window.
	String str="";
        System.out.println("Hi, World");
	for (String s : args)
	{
		if (str != "") str += " ";
		str += s;
		System.out.println(s);
		System.out.println(str);
	}
        System.out.println("See you soon!");
    }

}
