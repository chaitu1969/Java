package queues;

public class QueueUse {
		
	public static void main(String[] args) throws QueueFullException, QueueEmptyException {
		
		QueueUsingLL<Integer> q = new QueueUsingLL<Integer>();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
//		int i=0;
////		System.out.println(q.size()-2);
//		while(i < q.size()) {
////			System.out.println(q.front());
//			System.out.print(q.dequeue()+" ");
//			i++;
//		}
		
		while(!q.isEmpty()) {
			try {
				System.out.print(q.dequeue()+" ");
			} catch ( QueueEmptyException e) {
				// TODO: handle exception
			}
		}
		
	}
}
