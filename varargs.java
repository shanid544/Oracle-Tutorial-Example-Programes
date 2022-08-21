public class varargs{

	static void fun(int... a){
	
		System.out.println("a de length "+a.length);
		for(int i:a){
			System.out.print(i);
			}
		System.out.println();
	}
	
	public static void main(String[] args){
	
		fun(3);
		fun(1,2,3,4,5,6);
		
	}
}
