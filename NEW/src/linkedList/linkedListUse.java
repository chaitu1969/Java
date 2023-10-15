package linkedList;

import java.util.*;

public class linkedListUse {
	
	
	// Taking input function for LinkedList
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null;
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> currentNode = new Node<>(data);
			if(head == null) {
				head = currentNode;
			}else {
				Node<Integer> tail = head;
				while(tail.next != null) {
					tail = tail.next;
				}
				tail.next = currentNode;
			}
			data = s.nextInt();
		}
		s.close();
		return head;
	}
	
	// Optimized takeInput by minimizing the 
	
	public static Node<Integer> takeInputOptimize(){
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null;
		Node<Integer> tail = null;
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> current = new Node<>(data);
			if(head == null) {
				head = current;
				tail = current;
			}else {
				tail.next = current;
				tail = tail.next;
			}
			data = s.nextInt();
		}
		s.close();
		return head;
	}
	
	// Insert the node at the specified position
	
	public static Node<Integer> NodeAt(Node<Integer> head , int pos, int data){
		Node<Integer> N = new Node<>(data);
		if(pos == 0) {
			N.next = head;
			head = N;
			return N;
		} else {
			int count = 0;
			Node<Integer> prev = head;
			while(count < pos - 1 && prev != null) {
				count++;
				prev = prev.next;
			}
			if(prev != null) {
				N.next = prev.next;
				prev.next = N;
			}
			
		}
		return head;
		
	}
	
	// Delete a Node from linkedlist
	
	public static Node<Integer> DeleteNode(Node<Integer> head, int pos){
		if(pos == 0) {
			return head.next;
		}else {
			int count = 0;
			Node<Integer> temp = head;
			while(count < pos) {
				count++;
				temp = temp.next;
			}
			if(temp.next != null) {
				temp.next = temp.next.next;
			}
			return head;
		}
	}
	
	// used print function to print each node data
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	
	// used increment function to increase value of each node data by 1
	
	public static void increament(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}
	
	// Length of the LinkedList 
	
	public static void Len(Node<Integer> head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		System.out.println(count);
	}
	
	//Method for Eliminate duplicates
	public static Node<Integer> EliminateDuplicate(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> temp = head;
		Node<Integer> temp2 = head.next;
		
		while(temp2 != null) {
			if(temp.data == temp2.data) {
				temp.next = temp.next.next;
				temp2 = temp.next;
			}else {
				temp = temp2;
				temp2 = temp2.next;
			}
			
		}
		return head;
	}
	
	
	// method for print I'th node
	
	public static void INode(Node<Integer> head, int pos) {
		int count = 0;
		
		while(head!=null) {
			if(count == pos) {
				System.out.println(head.data);
				break;
			}else {
				head = head.next;
				count++;
			}
		}
	}
	
	// Finding node from the linkedList
	
	public static int findNode(Node<Integer>head, int data) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Please enter the data to check : ");
		Node<Integer> temp = head;
		int pos = -1;
		while(temp!=null) {
			pos++;
			if(temp.data == data) {
				return pos;
			}
			temp = temp.next;
		}
		return -1;
	}
	
	public static Node<Integer> CreateLinkedList() {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		n1.next = n2;
		Node<Integer> n3 = new Node<>(30);
		n2.next = n3;
		Node<Integer> n4 = new Node<>(40);
		n3.next = n4;
		
		
		return n1;
	}
	
	public static void main(String[] args) {
//		Node<Integer> n = new Node<>(15);
//		
//		System.out.println(n);
//		Node<String> n2 = new Node<>("Chaos");
////		n.next = n2;
////		System.out.println(n2);
////		System.out.println(n.data);
////		System.out.println(n.next);
////		System.out.println(n2.data);
//		
//		Node<Integer> head = CreateLinkedList();
//		
//		Node<Integer> temp = head;
//		
//		print(temp);
//		System.out.println();
//		increament(head);
//		print(head);
////		while(temp!=null) {
////			System.out.print(temp + " ");
////			
////			System.out.print(temp.data + " ");
////			
////			temp = temp.next;
////		}
//		System.out.println();
//		
//		System.out.println(head);
//		Len(head);
////		System.out.println();
//		INode(head,3);
//		
//		Node<Integer> Node = takeInputOptimize();
//		print(Node);
		
		Node<Integer> Node = takeInputOptimize();
		print(Node);
		Node = EliminateDuplicate(Node);
		System.out.println();
		print(Node);
//		Node = NodeAt(Node, 0, 9);
//		System.out.println();
//		print(Node);
//		System.out.println();
//		Node = DeleteNode(Node,0);
//		print(Node);
//		System.out.println();
//		System.out.println(findNode(Node,9));
		
	}

}
