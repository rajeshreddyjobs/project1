package Dande3rdbook;
public class Lab443 {

	public static void main(String[] args) {
showClassInfo("JLC");
Student stu=new Student();
showClassInfo(stu);

	}
static void showClassInfo(Object obj) {
	System.out.println(obj);
	Class cls=obj.getClass();
	System.out.println("Class Name : "+cls.getName());
	/*Object ob1=cls.getName();
	System.out.println(ob1.show1(10));*/
Class scls=cls.getSuperclass();
	
	if(scls!=null) {
		System.out.println("Super class : "+obj.getClass().getSuperclass().getName());
	}else {
		System.out.println("Class: "+obj.getClass().getName());
	}
}
}
class person{
	static void show1(int i) {
		System.out.println("Show1()");
	}
}
class Student extends person{
	static void show2(int i) {
		System.out.println("Show2()");
	}
}