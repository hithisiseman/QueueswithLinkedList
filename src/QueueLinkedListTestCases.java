import static org.junit.Assert.*;

import org.junit.Test;

public class QueueLinkedListTestCases {

	@Test
	public void testQSize() {
		
		Queue que=new Queue();
		assertEquals(0,que.size);
		
	}
	
	@Test
	public void testenqueue1() {
		
		Queue que=new Queue();
		que.enqueue(1);
		assertEquals(1,que.size);
		
	}
	
	@Test
	public void testenqueue2() {
		
		Queue que=new Queue();
		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);
		assertEquals(3,que.size);
		
	}

	@Test
	public void testenqueue3() {
		
		int n=50;
		Queue que=new Queue();
		
		for(int i=0;i<50;i++) {
			que.enqueue(i);
		}
		
		assertEquals(n,que.size);
		
	}
	
	@Test
	public void testenqueue4() {
		
		int n=50;
		Queue que=new Queue();
		
		for(int i=0;i<50;i++) {
			que.enqueue(i);
		}
		
		que.enqueue(51);
		assertEquals(n+1,que.size);
		
	}
	
	@Test
	public void testenqueue5() {
		
		int n=155;
		Queue que=new Queue();
		
		for(int i=0;i<150;i++) {
			que.enqueue(i);
		}
		
		que.enqueue(151);
		que.enqueue(152);
		que.enqueue(153);
		que.enqueue(154);
		assertEquals(n-1,que.size);
		
	}
	
	@Test
	public void testdequeue1() {
		
		Queue dque=new Queue();
		dque.enqueue(1);
		dque.dequeue();
		assertEquals(0,dque.size);
		
	}
	
	@Test
	public void testdequeue2() {
		
		int n=3;
		Queue dque=new Queue();
		dque.enqueue(1);
		dque.enqueue(2);
		dque.enqueue(3);
		dque.dequeue();
		dque.dequeue();
		assertEquals(n-2,dque.size);
		
	}
	
	@Test
	public void testdequeue3() {
		
		int n=50;
		Queue dque=new Queue();
		for(int i=0;i<50;i++) {
			dque.enqueue(i);
		}
		
		dque.dequeue();
		dque.dequeue();
		assertEquals(n-2,dque.size);
		
	}
	
	@Test
	public void testdequeue4() {
		
		int n=50;
		Queue dque=new Queue();
		for(int i=0;i<50;i++) {
			dque.enqueue(i);
		}
		
		for(int i=0;i<50;i++) {
			dque.dequeue();
		}
		
		assertEquals(0,dque.size);
		
	}
	
	@Test
	public void testdequeue5() {
		
		int n=50;
		Queue dque=new Queue();
		for(int i=0;i<50;i++) {
			dque.enqueue(i);
		}
		
		for(int i=0;i<25;i++) {
			dque.dequeue();
		}
		
		assertEquals(n-25,dque.size);
		
	}
	
	@Test
	public void testdequeue6() {
		
		int n=150;
		Queue dque=new Queue();
		for(int i=0;i<150;i++) {
			dque.enqueue(i);
		}
		
		for(int i=0;i<25;i++) {
			dque.dequeue();
		}
		
		assertEquals(n-25,dque.size);
		
	}
	
	@Test
	public void testdequeue7() {
		
		Queue dque=new Queue();
		dque.enqueue(1);
		dque.dequeue();
		dque.enqueue(2);
		dque.dequeue();
		dque.enqueue(3);
		dque.dequeue();
		dque.enqueue(4);
		dque.dequeue();
	
		assertEquals(0,dque.size);
	}

}
