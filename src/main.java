
public class main {

	public static void main(String[] args) {
		LinkedList A=new LinkedList();
		A.insertAtFirst(1);
		A.insertAtFirst(2);
		A.insertAtFirst(5);
		A.insertAtEnd(7);
		A.insertAtEnd(45);
		A.insertAtFirst(3);
		A.insertAtEnd(1);
		A.insertAtPos(88, 3);
		//A.deleteFirst();
		//A.deleteFirst();
		//A.deletePos(5);
	    
		//Before sorting
		A.viewList();
		System.out.println("\n\n########### LIST DETAILS ##########");
		System.out.println("\tStart: "+A.getStart());
		System.out.println("\tQueue: "+A.getQueue());
		System.out.println("\tSize "+A.getSize());
		A.search(8);
		
		System.out.println("\n\n-----------using sorting method--------\n");
		//After sorting
		A.sort();
		A.viewList();
		System.out.println("\n\n########### LIST DETAILS ##########");
		System.out.println("\tStart: "+A.getStart());
		System.out.println("\tQueue: "+A.getQueue());
		System.out.println("\tSize "+A.getSize());
		
		System.out.println("\n\n-----------using sorting search--------\n");
		A.search(1);

	}

}
