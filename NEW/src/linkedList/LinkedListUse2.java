package linkedList;

import java.util.*;

import java.util.LinkedList;


public class LinkedListUse2 {
	
	// Take input for LinkedList
	public static Node<Integer> TakeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		while(data != -1) {
			Node<Integer> curr = new Node<>(data);
			if(head == null) {
				head = curr;
				tail = curr;
			}else {
				tail.next = curr;
				tail = tail.next;
			}
			data = s.nextInt();
		}
//		s.close();
		return head;
	}
	
	// Printing the LinkdList
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	// Print the data using recursion
	public static void printRec(Node<Integer> head) {
		if(head == null) {
			return ;
		}
		printRec(head.next);
		System.out.print(head.data + " ");
	}
	
	// Insert data into linkedList recursively
	public static Node<Integer> InsertNode(Node<Integer> head,int data, int targetpos){
		if(head == null && targetpos > 0) {
			return head;
		}
		if(targetpos == 0) {
			Node<Integer> n = new Node<>(data);
			n.next = head;
			return n;
		}else {
			Node<Integer> smallHead = InsertNode(head.next,data,targetpos-1);
			head.next = smallHead;
			return head;
		}
		
	}
	
	// Delete data from the LL using recusion
	public static Node<Integer> DeleteNode(Node<Integer> head, int pos){
		
		if(head == null && pos > 0) {
			return head;
		}
		if(pos == 0) {
//			head = head.next;
			return head.next;
		}else {
			head.next = DeleteNode(head.next,pos-1);
			return head;
			
		}
	}
	
	// reverse the LinkedList using recusrion
	public static Node<Integer> reverseLL(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
			Node<Integer> smallHead = reverseLL(head.next);
			head.next.next = head;
			head.next = null;
		
		return smallHead;
		
	}
	
	// Midpoint of the linkedlist using reursion
	public static int Midpoint(Node<Integer> head) {
		Node<Integer> first = head;
		Node<Integer> second = head;
		if(head == null || head.next == null) {
			return head.data;
		}
		
		while(first.next != null && first.next.next != null) {
			first = first.next;
			second = second.next.next;
		}
		
		return first.data;
		
	}

	//Merge sort using linkedlist
	public static Node<Integer> mergeSort(Node<Integer> head1, Node<Integer> head2){
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		while(head1 != null && head2 != null) {
			if(head1.data <= head2.data) {
				if(head == null) {
					head = head1;
					tail = head1;
					head1 = head1.next;
				}else {
					tail.next = head1;
					tail = tail.next;
					head1 = head1.next;
				}
			}else {
				if(head == null) {
					head = head2;
					tail = head2;
					head2 = head2.next;
				}else {
					tail.next = head2;
					tail = tail.next;
					head2 = head2.next;
				}
			}
		}
		if(head1 != null) {
			tail.next = head1;
		}
		if(head2 != null) {
			tail.next = head2;
		}
		
		return head;
		
	}
	
	//Find node in linkedlist using recusion
	public static int FindNode(Node<Integer> head, int data) {
		if(head == null) {
			return -1;
		}
		if(head.data == data)
			return 0;
		
		int ans = FindNode(head.next,data);
		
		if(ans == -1)
			return -1;
		return ans+1;
	}

	//Delete N node for every n nodes
	
	public static Node<Integer> deleteNnodes(Node<Integer> head, int N, int r){
		Node<Integer> temp = head, t;
		if(head == null)
			return head;
		if(N == 0)
			return null;
		if(r == 0)
			return head;
		int count;
		
		while(temp != null) {
			for(count=1; count < N && temp!=null ; count++) {
				temp = temp.next;
			}
			
			if(temp == null)
				return head;
			t= temp.next;
			for(int i = 0; i<r && t!=null; i++) {
				t = t.next;
			}
			temp.next = t;
			temp = t;
		}
		return head;
	}
	
	
	public static void main(String[] args) {
//		Node<Integer> head = TakeInput();
//		print(head);
//		System.out.println();
//		printRec(head);
//		System.out.println();
//		Node<Integer> node = InsertNode(head,23,2);
//		print(node);
//		System.out.println();
//		node = reverseLL(node);
//		print(node);
		
//		Node<Integer> n1 = TakeInput();
//		print(n1);
//		System.out.println();
//		Node<Integer> n2 = TakeInput();
//		print(n2);
//		System.out.println();
//		Node<Integer> node = mergeSort(n1,n2);
//		print(node);
//		
		
//		LinkedList<Integer> list = new LinkedList<>();
//		list.
		
		
	}

}
