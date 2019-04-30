package WookBook.practiceTest15;

public class Practice1 {

	public static void main(String[] args) {
		//hi h1=hi.setHi(100,"rajesh ","rajesh@");
		hi h1=hi.getHi();

		System.out.println(h1);
		h1.setSname("Rajesh Reddy");
		System.out.println(h1);
	}

}

final  class hi{
	
	private int sid;
	private String sname;
	private String email;
	static private hi h=new hi(10,"Raj","raj@gamil.com");

	
	private hi(int sid, String sname, String email){
		this.sid=sid;
		this.sname=sname;
		this.email=email;
		//System.out.println(sid+"--"+sname+"--"+email);
	}
	
	
	public static hi getHi() {
		return h;
	}
	
	public void setHi(int sid, String sname, String email) {
		this.sid=sid;
		this.sname=sname;
		this.email=email;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid=sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname=sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	@Override
	public String toString() {
		return sid+"--"+sname+"--"+email;
	}
}