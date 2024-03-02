package basics.arrays.stack;

public class ImplLinkedList {

	public static class Node {
		int data;
		Node next;

	}

	public static class Linkedlist {

		private static Node head;
		private static Node tail;
		private static int size;

		public static void addFirst(int n) {

			if (size == 0) {
				Node temp = new Node();

				temp.data = n;
				temp.next = null;
				head = tail = temp;
				size++;
			} else {
				Node temp = new Node();

				temp.data = n;
				temp.next = head;
				head = temp;
				size++;
			}

		}

		public static void addLastt(int n) {
			if (size == 0) {
				Node temp = new Node();

				temp.data = n;
				temp.next = null;
				head = tail = temp;
				size++;
			} else {
				Node temp = new Node();

				temp.data = n;
				temp.next = null;
				tail.next = temp;
				tail = temp;

				size++;

			}

		}

		public static void addAt(int indx, int val) {
			if (size == 0) {
				addFirst(val);
			} else if (indx < 0 || indx >= size) {
				System.out.println("invalid argument");
				
			} else if(indx == size-1)
			{
				addLastt(val);
			}
			else {
				Node temp = head;
				for (int i = 0; i < indx - 1; i++) {
					temp = temp.next;
				}

				Node current = new Node();
				current.data = val;
				current.next = temp.next;
				temp.next = current;
				size++;

			}

		}

		public static void display() {

			Node temp = head;
			while (temp != null) {
				int val = temp.data;
				System.out.print(val + " ");
				temp = temp.next;

			}

			System.out.println();
		}

		public static int getsize() {
			if (size == 0) {
				return -1;
			} else {
				return size;
			}

		}

		public static void removeFirst() {

			if (size == 0) {
				System.out.println("Empty List");
			} else if (size == 1) {
				head = tail = null;
				size = 0;
			} else {
				head = head.next;
				size--;

			}

		}

		public static int getFirst() {

			if (size == 0) {
				System.out.println("EMpty List");
				return -1;
			} else {

				return head.data;
			}
		}

		public static int getLast() {

			if (size == 0) {
				System.out.println("EMpty List");
				return -1;
			} else {

				return tail.data;
			}
		}

		public static int getAt(int idx) {

			if (size == 0 || idx > size || idx < 0) {
				System.out.println("Empty List");
				return -1;
			} else {
				Node temp = head;
				// int val=0;
				for (int i = 0; i < idx; i++) {
					// val = temp.data;
					temp = temp.next;
				}

				return temp.data;

			}

		}

		public static void removeLast() {
			if (size == 0) {
				System.out.println("Empty List");

			} else if (size == 1) {
				head = tail = null;
				size = 0;
			} else {
				Node temp = head;

				for (int i = 0; i < size - 2; i++) {
					temp = temp.next;
				}

				tail = temp;
				tail.next = null;
				size--;

				size--;

			}

		}

		public static void removeAt(int indx) {
			if (indx == 0) {
				removeFirst();

			} else if (indx >= size || indx < 0) {
				System.out.println("Invalid Argument");
			} else if (indx == size - 1) {
				removeLast();
			} else {
				Node temp = head;

				for (int i = 0; i < indx - 1; i++) {
					temp = temp.next;
				}

				temp.next = temp.next.next;

				size--;

			}

		}

		private static Node getNodeAt(int indx) {
			Node temp = head;

			for (int i = 0; i < indx; i++) {
				temp = temp.next;
			}

			return temp;
		}

		public static void reverse() {

			int lf = 0;
			int rt = size - 1;

			while (lf < rt) {
				Node n1 = getNodeAt(lf);
				Node n2 = getNodeAt(rt);
				int temp = n1.data;
				n1.data = n2.data;
				n2.data = temp;

				lf++;
				rt--;
			}

		}

		public static void reversePointer() {

			int lf = 0;
			int rt = size - 1;

			while (lf < rt) {
				Node n1 = getNodeAt(lf);
				Node n2 = getNodeAt(rt);
				int temp = n1.data;
				n1.data = n2.data;
				n2.data = temp;

				lf++;
				rt--;
			}
			

		}

		
		public static int KthElementFromLast(int k) {

			
			Node slow =head;
			Node fast = head;;
			for(int i=0;i<k; i++)
			{
				fast = fast.next;
			}
			
			
			while(fast != null)
			{
				slow= slow.next;
				fast= fast.next;
			}
			
			return slow.data;

		}
		
		
	public static int MiddleElement() {

			
			Node slow =head;
			Node fast = head;;
		
			
			
			while(fast != null && fast.next.next != null )
			{
				slow= slow.next;
				fast= fast.next.next;
			}
			
			return slow.data;

		}
		
	}

	public static void main(String[] args) {

		Linkedlist lst = new Linkedlist();
		lst.addLastt(10);
		lst.display();
		lst.addLastt(20);
		lst.display();
		lst.addLastt(30);
		lst.display();
		lst.addLastt(40);
		lst.display();
		lst.addLastt(50);
		lst.display();
		lst.addFirst(60);
		lst.display();
		lst.addFirst(70);
		lst.addLastt(80);
		lst.display();
		lst.removeFirst();
		lst.display();
		System.out.println(lst.getAt(3));
		lst.addAt(3, 90);
		lst.display();
		lst.removeAt(3);
		lst.display();
		lst.reverse();
		lst.display();
		lst.reversePointer();
		lst.display();
		System.out.println(lst.KthElementFromLast(3));
		
		System.out.println(lst.MiddleElement());
		

	}
}
