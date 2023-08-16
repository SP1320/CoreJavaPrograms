package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
		Deque<Integer>qq=new ArrayDeque<Integer>();
		qq.offer(10);
		qq.offerFirst(9);
		qq.offerLast(11);
		System.out.println(qq);
		int r=qq.pollLast();
		System.out.println(r);
		System.out.println(qq);
	}

}
