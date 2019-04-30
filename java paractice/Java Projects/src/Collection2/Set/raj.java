package Collection2.Set;

public class raj {

	public static void main(String[] args) {
		
			Integer a=new Integer(10);
			String b=new String("raj");
			{
				System.out.println(a.equals(b));
				//System.out.println(a==b);

			}
			r r1=new r(10);
			r r2=new r(10);
			System.out.println(r1.equals(r2));
		
	}

}
class r{
	int a;
	r(int a){
		this.a=a;
	}
	@Override
	public int hashCode() {
		
		return a;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof r) {
			r m=(r)obj;
			return this.a==m.a;
		}
		return false;
	}
	
}