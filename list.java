class list{
	Node head;
	Node a,b;

	public void create(){
		Node p = new Node();
		p.data = 50;
		head = p;

		Node q = new Node();
		q.data = 70;
		p.next = q;

		Node r = new Node();
		r.data = 80;
		q.next = r;

		Node s = new Node();
		s.data = 100;
		r.next = s;
		s.next = null;

		Node u = new Node();
		u.data = 64;
		p.next = u;
		u.next = q;

	}	

	void printList(){
		Node a = head;

		while(a != null){
			System.out.println(a.data);
			a = a.next;
		}
	}

	public void delete(int val){
		Node a;
		Node b;
		b = null;
		a = head;
		boolean found = false;
		while((a != null) && (found==false)){
			if(a.data == val){
				found = true;
			}else{
				b = a;
				a = a.next;
				
			}
		}

		if(found == true){
			if(b==null){
				head = a.next;
			}
			else{
				b.next = a.next;
			}
}
		

	}

	public static void main(String arg[]){
		list l1 = new list();
		l1.create();
		l1.printList();

		System.out.println("---------------------------------");
		l1.delete(80);
		l1.printList();
	}

}