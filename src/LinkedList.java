
public class LinkedList{
	private int size;
	private Node start;
	private Node queue;
	
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
		if(size==0) {
			queue =n ;
		}
		size++;	
	}
	
	public void insertAtEnd(int x) {
		if(size==0) {
			Node n	=	new Node(x,start);
			start=n;
			queue=n;
		}else {
			Node n	=	new Node(x,null);
			//node parcourir la liste
			Node p;
			for(p=this.start;p.getNext()!=null;p=p.getNext());
			//we are sure that p is not null and he has ref of last node
			p.setNext(n);
			queue	=	n;
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
	
	public void deleteFirst() {
		if(size==0) {
			System.out.println("List is empty!!");
		}else {
			
			//I add p to set nest of first node null ( garbage cleaner) will clean this inref object
			Node p;
			p=start;
			start=start.getNext();
			p.setNext(null);
			size--;
		}
	}
	
	public void deleteEnd() {
		if(size==0&& size==1) {
			size=0;
			System.out.println("List is empty!!");
		}else {
			Node p,q;
			for(p=start,q=start.getNext();q.getNext()!=null;p=p.getNext(),q=q.getNext());
			p.setNext(null);
			size--;
		}
	}
	
	public void deletePos(int pos) {
		if(pos==1) {
			deleteFirst();
		}else if(pos==size) {
			deleteEnd();
		}else if(pos>1 && pos<size) {
			Node p;
			p=start;
			for(int i=1;i<pos-1;i++) {
				p=p.getNext();
			}
			p.setNext(p.getNext().getNext());
			size--;
		}
	}
	public int getSize() {
		return size;
	}
	
	public int getQueue() {
		return this.queue.getData();
	}
	
	public int getStart() {
		return this.start.getData();
	}
	
	public void viewList() {
		Node n;
		for(n=this.start;n!=null;n=n.getNext()) {
			System.out.print(n.getData()+"\t");
		}
	}
	
}
