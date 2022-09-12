package Java05;

public class Java05 {
		
	public static void main(String[] args) {
		CBox box = new CBox();

		 box.length = 1; 
		 box.width = 1;
		 box.height = 1;
		 
		}
		
	}

class CBox {  
	int length; 
	int width;
	int height;
	
	int volume(){
		return length * width * height;
	}
	int surfaceArea() {
		return length * width * 2 + width * height * 2 + length * height * 2;
		
	}
	void showData() {
		System.out.println(length + width + height);
	}
	void showAll() {
		System.out.println(length + width + height +"," + length * width * height + length * width * 2 + width * height * 2 + length * height * 2);
}
