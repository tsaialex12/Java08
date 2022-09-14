
public class homework01 {

	public static void main(String[] args) {
		CTest test = new CTest();
			test.a(3);
			test.a(8);
			test.a(0);

	}

}
class CTest {

	void a(int x) {
		if(x==0) {
			System.out.println("此數為0");
		}else if(x%2==1) {
			System.out.println("此數為奇數");
		}else if(x%2==0) {
			System.out.println("此數為偶數");
		}
	}
	
}
