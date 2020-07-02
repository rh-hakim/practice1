package Stack;

public class TestStack {

	public static void main(String[] args) {


		StackClass st= new StackClass();
		st.push(2);
		st.push(4);
		st.push(3);
		
		
		

		st.show();


		System.out.println(st.pop());

		
	}

}
