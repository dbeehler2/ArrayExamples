
public class toPower {
	
	private static int size = 4;
	private static int power = 2;
	
	public static void main(String[] args) {
			
		System.out.println(Math.pow(size, power));
		
	}
	
	static void toPower () {		
		
}

	
	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		toPower.size = size;
	}

	public static int getPower() {
		return power;
	}

	public static void setPower(int power) {
		toPower.power = power;
	}


	public toPower(int size, int power) {
		super();
		this.size = size;
		this.power = power;
	}
}