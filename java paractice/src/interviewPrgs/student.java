package interviewPrgs;

public class student {

	public static void main(String[] args) {
students st=new students(20,"A","A@gmail",9493);
/*System.out.println(st.id);
System.out.println(st.name);
System.out.println(st.email);
System.out.println(st.phone);
*/
Class c=st.getClass().getSuperclass();
System.out.println(c);
System.out.println(st.hashCode());
System.out.println(st);

	}

}
class uuuu{}
class students extends uuuu{
	static int id;
	String name;
	String email;
	long phone;
	public students(int id,String name, String email, long phone) {
		super();
		this.id=id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "id="+id+"  name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	

}