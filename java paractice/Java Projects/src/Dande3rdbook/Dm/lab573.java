
package Dande3rdbook.Dm;

public class lab573  {

	public static void main(String[] args) {
		System.out.println("main Started");
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName()+"\t"+tg.getClass());
		
		/*th.start();
		try {
		Thread.sleep(2000);
		}catch(Exception e) {
			
		}*/
		for(int i=0;i<args.length;i++) {
			String st=args[i];
			System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName()+"\t"+tg.getClass()+"\t"+st);
			

		}
		System.out.println("main completed");

	}

}
