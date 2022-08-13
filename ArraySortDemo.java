class ArraySortDemo {
    public static void main(String[] args) {
	
        String[] a={"shanid","thanveer","jaza","aaban",
		"hafeefa","khadeeja","moosa"};
		
		
		for(String i: a){
			System.out.println(i);
		}
		System.out.println("===================");
		
		java.util.Arrays.sort(a);
		
		for(String i: a){
			System.out.println(i);
		}
    }
}