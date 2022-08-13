class ArrayFillDemo {
    public static void main(String[] args) {
	
        String[] a={"shanid","thanveer","jaza","aaban",
		"hafeefa","khadeeja","moosa"};
		
		
		for(String i: a){
			System.out.println(i);
		}
		System.out.println("===================");
		
		java.util.Arrays.fill(a,"nulll");
		
		for(String i: a){
			System.out.println(i);
		}
    }
}