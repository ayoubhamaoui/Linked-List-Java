
public class main {

	public static void main(String[] args) {
		LinkedList A=new LinkedList();
		A.insertAtFirst(1);
		A.insertAtFirst(2);
		A.insertAtFirst(5);
		A.insertAtEnd(7);
		A.insertAtEnd(45);
		A.insertAtPos(88, 3);
		//A.deleteFirst();
		//A.deleteFirst();
		A.deletePos(5);
	
		A.viewList();
		//System.out.println(A.getSize());
		

	}

}
