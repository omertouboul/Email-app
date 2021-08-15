package eapp;
import java.util.Scanner;
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String company="company.com";
	
	public Email (String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("email created- "+this.firstName+ " " +this.lastName);
		this.department=setDepartment();
		System.out.println("Department: "+ this.department);
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password);
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"-"+company;
		System.out.println("Your email is:"+email);
	}
	private String setDepartment()
	{
		System.out.println("new worker "+firstName+". department codes"+"\n1 for sales\n2 for development\n3 for acounting\n0 for none\n enter department code: ");
		Scanner in= new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "dev";}
		else if(depChoice==3) {return "acct";}
		else {return " ";}
	}
	private String randomPassword(int length)
	{
		String passwordSet="abcdefghijklmnopqrstuwxyz0123456789!@#$%^&*()";
		char [] password=new char[length];
		for (int i = 0; i < length; i++) 
		{
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String (password);
	}
	public void setMailBoxCapacity(int capacity)
	{
		this.mailBoxCapacity=mailBoxCapacity;
	}
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail=alternateEmail;
	}
	public void changePassword(String password)
	{
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String showInfo() {
		return "DISPLAY NAME: " +firstName+" "+lastName+
				"\nCOMPANY EMAIL: "+email +
				"\nMAILBOX CAPACITY: "+mailBoxCapacity+"mb";
		
	}
	
	
	
	
	
}
