package stack_practice;
import java.util.*;

public class Main {


	public static boolean delimiterCheck(String string, Stack stack) {
		//int index = 0;
		char ch;
		for(int i=0;i<string.length()/2;i++) {
			ch = stack.pop();
			switch(ch) {
			case ')': if(string.charAt(i)!= '(') {
				System.out.println("Popped: "+ch+"Start: "+string.charAt(i));
				return false;
				}
				break;
			case '}':if(string.charAt(i)!= '{') {
				System.out.println("Popped: "+ch+"Start: "+string.charAt(i));
				return false;
				}
				break;
			case ']':if(string.charAt(i)!= '[') {
				System.out.println("Popped: "+ch+"Start: "+string.charAt(i));
				return false;
				}
				break;
			case '(': if(string.charAt(i)!= ')') {
				System.out.println("Popped: "+ch+"Start: "+string.charAt(i));
				return false;
				}
				break;
			case '{':if(string.charAt(i)!= '}') {
				System.out.println("Popped: "+ch+"Start: "+string.charAt(i));
				return false;
				}
				break;
			case '[':if(string.charAt(i)!= ']') {
				System.out.println("Popped: "+ch+"Start: "+string.charAt(i));
				return false;
				}
				break;
			}
		}
		return true;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = sc.nextLine();
		Stack stack = new Stack(string);
		System.out.print(delimiterCheck(string,stack));
		sc.close();
		
	}

}
