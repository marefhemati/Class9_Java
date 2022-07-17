package genericMethod;

public class GenricM {
//Interview Question: what's Generic Method?
	//Create a single method to allows us to use it with different data type, that's called generic method. like below. 
	Integer[] m = {2, 4, 54, 45, 27, 78,};
	Character[] n = {'a', 'e', 'y', 't', };
	String[] p = {"tom", "mike", "jay", "shan"};
	
	
	
	public static <Z> void printArray(Z[] x) {
		for(Z e : x ) {
		System.out.println(e);
		}
	}
	public static void main(String[] args) {
		GenricM gen = new GenricM();
		
		printArray(gen.m);
	}

}
