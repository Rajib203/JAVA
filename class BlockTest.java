class Block{
	Block(){
		System.out.println("Constructor");
	}

	{
		System.out.println("Instance Integer block 1");
	}
s
	{
		System.out.println("Instance Integer block 2");
	}

	static {
		System.out.println("Ststic block 1....");
	}

	static {
		System.out.println("Ststic block 2....");
	}
}

public class BlockTest {
	public static void main(String[] args){
		Block ob = new Block();
		}
}