class LinkedListOfEmails {

	
// Node class
    private class Node {                      
	   private Email element; 
	   private Node next;
	 
	 // Creates email node and next element which is null at first.
	 public Node(Email element) {
		this.element=element;
		this.next=null;	

}}
	 // declarations for list
	 private Node head;
	 private int size;	

// constructor that creates an empty list
LinkedListOfEmails(){
	head=null;
	size = 0;
}

    public void addEmail(Email E){
	
	Node now=null; 
     Node n = new Node(E);

          if(head==null) {
	          n.next=head;
	              head=n;
}

         else {
	      now=head;
            while (now.next != null && now.next.element.getTime() < now.element.getTime()) {
              now=now.next;
 }
             n.next=now.next;
             now.next= n;
                 size++;
}}

 
    public void read(int id) {

      Node now = head; 
      while (now != null) {
                         
 
         if (now.element.getID() == id) {
       System.out.println("Email id: " + now.element.getID());
       System.out.println("Subject: " + now.element.getSubject());
       System.out.println("Body: " + now.element.getMessage());
       System.out.println("Time received: " + now.element.getTime());
       if(now.element.getFlag()==true) {
	    System.out.println("Status: Read");
 }
    else
	     System.out.println("Status: Unread");
    now.element.setFlag(true);
     return; 
         }
       now = now.next;
        }
 
  System.out.println("No such email.");
 }
	  public Email delete(int id) {                 

		Node now = head; 
		Node getprev = null;
		  
		 if (now != null && now.element.getID() == id)
		{
		    head = now.next; 
		    return now.element;
		}
		     while (now != null && now.element.getID() != id)
		{
		     getprev = now;
		     now = now.next;
		}
		    return getprev.element;		  		
		}
	
 
 
    public void showAll(boolean flag) {
	
	System.out.print("Email        "+"Subject                   "+   "   Body                                     "+  "                     Time               "+ "    Read");
	Node now=head;
	while (now!= null)
	{
	if (flag == true || (flag == false && now.element.getFlag() == false)) {
	System.out.print("\n");
		System.out.print(now.element.getID()+"          ");
	  System.out.print(now.element.getSubject()+"             ");
	   System.out.print(now.element.getMessage()+"            ");
	    System.out.print(now.element.getTime()+"         ");
	     if(now.element.getFlag()==true) {
		 System.out.print("          Yes");
	 }
	    else
		     System.out.print("            No");
		 }
	     now = now.next;
	     System.out.print("\n");
	}
	}

   public int size() {

 	while(head!=null) {
 		size++;
 		head=head.next;
 	}
 	return size;
}





}

















































