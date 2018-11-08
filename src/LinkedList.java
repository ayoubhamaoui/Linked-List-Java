
public class LinkedList {
	private int size;
	private Node start;
	
	public LinkedList() {
		size	=	0;
		start	=	null;
	}
	
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}
	
	public void insertAtFirst(int x) {
		Node n=new Node(x,start);
		start=n;
		size++;	
	}
	
	public void insertAtEnd(int x) {
		if(size==0) {
			Node n	=	new Node(x,start);
			start=n;
		}else {
			Node n	=	new Node(x,null);
			//node parcourir la liste
			Node p;
			for(p=this.start;p.getNext()!=null;p=p.getNext());
			//we are sure that p is not null and he has ref of last node
			p.setNext(n);
		}
		size++;
	}
	
	public void insertAtPos(int val,int pos) {
		if(pos==1) {
			insertAtFirst(val);
		}else if(pos==size+1) {
			insertAtEnd(val);
		}else if(pos<=size && pos>1) {
			Node p;
			Node n = new Node(val,null);
	        
			p=this.start;
			for(int i=1;i<pos-1;i++) {
				p=p.getNext();
			}
			n.setNext(p.getNext());
			p.setNext(n);
		}
		size++;
	}
	public int getSize() {
		return size;
	}
	
	public void viewList() {
		Node n;
		for(n=this.start;n!=null;n=n.getNext()) {
			System.out.print(n.getData()+"\t");
		}
	}
}
