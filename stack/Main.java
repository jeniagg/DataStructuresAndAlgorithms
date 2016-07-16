package stack;

public class Main {

	public static void main(String[] args) {
		MyStack<Integer> st = new MyStack<Integer>();
		st.push(15);
		st.push(25);
		st.push(45);
		st.push(35);
		st.push(45);
		System.out.println(st.search(45));
		st.pop();
		System.out.println(st.peek());
		System.out.println(st.size());
		System.out.println(st.toString());
	}

}
