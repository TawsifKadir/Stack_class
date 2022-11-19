package stack_practice;

public class Stack {
	private int StackSize;
	private char[] Stackarr;
	private int top;
	
	public Stack() {
		this.StackSize = 5;
		this.Stackarr = new char[this.StackSize];
		this.top = 0;
	} 
	public Stack(int size) {
		this.StackSize = size;
		this.Stackarr = new char[this.StackSize];
		this.top = 0 ;
	}
	public Stack(String data) {
		int length = data.length(); this.StackSize = length;
		this.Stackarr = new char[length];
		for(int i=0;i<length;i++) {
			Stackarr[i] = data.charAt(i);
			top++;
		}
	}
	
	public void push(char data) {
		if(isFull()) {
			this.StackSize*=2;
			char[] temp = new char[this.StackSize];
			for(int i=0;i<top;i++) {
				temp[i] = this.Stackarr[i];
			}
			Stackarr = temp;
		}
		Stackarr[top++] = data;
	}
	public char pop(){
		char ch = this.Stackarr[--top];
		//this.Stackarr[top] = (Character) null;
		return ch;
	}
	public void show() {
		for(int i=0;i<top;i++)System.out.println(this.Stackarr[i]);
	}
	public void peek() {
		System.out.print(Stackarr[top-1]);
	}
	public boolean isEmpty() {
		if(top == 0) 
			return true;
		return false;
	}
	public boolean isFull() {
		if(this.top == this.StackSize) {
			return true;
		}
		else {
			return false;
		}
	}
}
