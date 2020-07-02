package Stack;

public class StackClass {
	
	
	int[] stack = new int[5];
	
	int top =0;
	
	public void push(int data) {
		stack[top]=data;
		top++;
	
		System.out.println(data);
		
		
				
	}
	
	public int pop() {
		int data;
		top--;
		data=stack[top];
		stack[top]=0;
		return data;
		
		
	}
	public void show() {
		for(int n: stack) {
			System.out.println(n);
			
		}

		
	
	
//	public int peek() {
//		if(!this.isEmpty()) {
//			return stack[top];
			
		}
	
	
	
	
	

}
