package Stack;

public class Stack {

	int[] name = new int[4];
	int top;

	public void push(int data) {
		if(top==4)
			System.out.println("stack is full");
		name[top]=data;
		top++;
			
	}

	public int pop() {
		int data;
		top--;
		data = name[top];
		name[top] = 0;
		return data;

	}

	public void show() {
		for (int n : name) {
			System.out.println(n);
		}
	}

	public int peek() {
		int data;

		data = name[top - 1];

		return data;
	}

	public int size() {
		return top;

	}

}
