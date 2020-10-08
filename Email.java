class Email {
	
private String subject;
private	int ID;
private	String message;
private	int time;
private	boolean flag;
			
	 public Email() {
		
		 this.subject=null;
		 this.ID=0;
		 this.message=null;
		 this.time=0;
		 this.flag=false;
		}
		
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public boolean getFlag() {
		
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

































}
