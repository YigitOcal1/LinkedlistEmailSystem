import java.io.BufferedReader;
import java.io.InputStreamReader;


public class EmailApplication {
	//----------------------------------------------------
    // linkedlist that can store emails
	//----------------------------------------------------
	static LinkedListOfEmails Inbox = new LinkedListOfEmails();
	 static LinkedListOfEmails Archive = new LinkedListOfEmails();
    static	 LinkedListOfEmails Trash = new LinkedListOfEmails();
	

 public static void main(String[] args) throws Exception  {
	
	 String usercommand="";
	 BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
   
	//----------------------------------------------------
	// I read inputs and do necessary operations with using methods, while loop and switch-case
	//----------------------------------------------------
     while((usercommand=bf.readLine()) != null) {
    	 
    	  String []  parameter;
    	  char command = usercommand.charAt(0);
		switch(command){
		//----------------------------------------------------
		// new mail add case
		//----------------------------------------------------	
		case 'N':
		try { parameter=usercommand.split("//");
		Email mail=new Email();
		mail.setSubject(parameter[1]);
		mail.setID(Integer.valueOf(parameter[2]));
		mail.setMessage(parameter[3]);
		mail.setTime(Integer.valueOf(parameter[4]));
		mail.setFlag(false);
		Inbox.addEmail(mail);}
		catch(Exception e) {
			System.out.println("Error");
		}
		break;
		//----------------------------------------------------
		// read mails with enter their ID
		//----------------------------------------------------	
		case 'R':
			try{parameter=usercommand.split(" ");
			Inbox.read(Integer.valueOf(parameter[1]));}
			catch(Exception e) {
				System.out.println("Error");
			}
	        break;
	    //----------------------------------------------------
		// archive method that carry mail that given ID inbox to archive folder 
		//----------------------------------------------------	
		case 'A':
		try {	parameter=usercommand.split(" ");
			Email mail=new Email();
			 mail=Inbox.delete(Integer.valueOf(parameter[1]));
			Archive.addEmail(mail);}
		catch(Exception e) {
			System.out.println("Error");
		}
		break;
		//----------------------------------------------------
		// Delete case it carry mail that given ID to inbox to trash folder 
		//----------------------------------------------------	
		case'D':
		try {	parameter=usercommand.split(" ");
			Email mail=new Email();
			mail=Inbox.delete(Integer.valueOf(parameter[1]));
			Trash.addEmail(mail);	}
		catch(Exception e) {
			System.out.println("Error");
		}
		break;
		//----------------------------------------------------
		// Show all mails according to input folder
		//----------------------------------------------------	
		case 'S':
			try{parameter=usercommand.split(" ");
			if(parameter[1].equals("Inbox")) {
				Inbox.showAll(true);
			}
			else if (parameter[1].equals("Archive")) {
				Archive.showAll(true);
			}
			else if(parameter[1].equals("Trash")) {
				Trash.showAll(true);
			}
			else {
				System.out.println("Error");}}
			catch(Exception e) {
				System.out.println("Error");
			}
			
			break;
			//----------------------------------------------------
			// Show all unread mails according to input folder
			//----------------------------------------------------	
		case 'U':
			try {parameter = usercommand.split(" ");
			if (parameter[1].equals("Inbox")) {
			Inbox.showAll(false);
			} else if (parameter[1].equals("Archive")) {
			Archive.showAll(false);
			} else if (parameter[1].equals("Trash")) {
			Trash.showAll(false);
			} else {
			System.out.println("Error");
			}}
			catch(Exception e) {
				System.out.println("Error");
			}
			break;
			
		
		case 'C':
			parameter = usercommand.split(" ");
		
		
		
		}}}
}
	



			
				  
				
			
			
			
			
			
			
			
			
			




 




