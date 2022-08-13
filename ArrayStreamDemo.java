class ArrayStreamDemo {
    public static void main(String[] args) {
	
        String[] a={"shanid","thanveer","jaza","aaban",
		"hafeefa","khadeeja","moosa"};
		
		
		
		
		java.util.Arrays.stream(a).map(i->i+" ").forEach(System.out::print);
		
		
    }
}