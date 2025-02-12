package Program;

public class JavaIO {
static void pr() {
	System.out.print("Hi ");
	System.out.print("Welcome");
}
static void prln() {
	System.out.println("Good Morning");
	System.out.println("How are You");
}
void err() {
	System.err.println("Error");
	System.err.println("Warning");
}
public static void main(String[] args) {
	pr();
	System.out.println();
	prln();
	JavaIO jv=new JavaIO();
	jv.err();
}
}