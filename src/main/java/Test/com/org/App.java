package Test.com.org;

/**
 * Hello world!
 *
 */
public class App {
//	String name = "vik";
//	String name1 = "vik";

	public static void main(String[] args) {
		
//		int num = 37;
//		int i;
//		for (i = 2; i < num; i++) {
//			int n = num % i;
//			System.out.println(n);
//
//			if (n == 0) {
//				System.out.println("not Prime!");
//				break;
//			}
//		}
//		if (i == num) {
//			System.out.println("Prime number!");
//		}
		MaximumFinder obj=new MaximumFinder(null);
		MaximumFinder obj1=obj;
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		if(obj==obj1){
			System.out.println("yes");
		}
	}
}
