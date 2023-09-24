class Square {
	
	int length;
	public Square() {
		length = 10;
	}
	
	public Square(int length) {
		this.length = length;
	}
	
	public void printArea() {
		System.out.println(this.length * this.length);
	}
}
	
class Solution {
	
	public static void main(String args[]) {
		
		Square square1 = new Square();
		square1.printArea();
		
		Square square2 = new Square(7);
		square2.printArea();
		
	}
}
		
