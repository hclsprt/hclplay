/******************************************************************************
 *  Compilation:  javac HiWorld.java
 *  Execution:    java HiWorld [arg0 arg1 ...]
 *
 ******************************************************************************/

public class HiWorld {

    public static void main(String[] args) {
        // Prints "Hi, World" to the terminal window.
        System.out.println("Hi, World");
	for (String s : args)
	{
		System.out.println(s);
	}
	System.out.println("Hi again");
    }

}
