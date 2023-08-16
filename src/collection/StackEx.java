package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer>s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(10);
		System.out.println("Stack Elements :" +s);
		System.out.println("Stack Size :"+s.size());
		System.out.println("Stack Empty :"+s.isEmpty());
		s.pop();
		System.out.println(" pop Stack Element :"+s);
		s.peek();
		System.out.println(" peek Stack Element :"+s.peek());
		int position=s.search(10);
		System.out.println(" print position :"+position);
		int index = s.indexOf(10);
		System.out.println(" print indexof :"+index);
		int index1 = s.lastIndexOf(30);
		System.out.println(" last index of :" +index1);
		
		

	}

}
