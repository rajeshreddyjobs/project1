package TypeCase.with.ReferenceType;

public class Lab422 {

	public static void main(String[] args) {

		D dobj=new D();
		A aobj=dobj;
		//B bobj=aobj;
		B bobj=(B)aobj;
		//D dobj2=aobj;
		D dobj2=(D)aobj;
		C cobj=aobj;
		
		
		A a1=new D();
		B b1=(B) new A();

		
	}

}
