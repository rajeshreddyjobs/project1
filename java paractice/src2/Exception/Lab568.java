package Exception;
public class Lab568 {

	public static void main(String[] args) {
		System.out.println("main Started");
		String nm="";
		try {
			StudentService serv=new StudentService();
			nm=serv.getNameBySid(null);
			nm=serv.getNameBySid("");
			nm=serv.getNameBySid("JLC-088");
			nm=serv.getNameBySid("JLC-32");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
class EmptySidException extends RuntimeException{}

class StudentService{
	String getNameBySid(String sid) {
		if(sid==null)
			throw new NullPointerException();
		else if(sid.isEmpty())
			throw new EmptySidException();
		else if(sid.equals("JLC-032"))
			return "Rajesh Reddy";
		else
			throw new StudentNotFoundException(sid);
	}
}

class StudentNotFoundException extends RuntimeException{
	public StudentNotFoundException(String sid) {
		super(sid);
	}
}