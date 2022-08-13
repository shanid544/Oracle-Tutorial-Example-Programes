class ArrayCopyDemo1 {
    public static void main(String[] args) {
	
        String[] a={"shanid","thanveer","jaza","aaban",
		"hafeefa","khadeeja","moosa"};
		
		String[] b = java.util.Arrays.copyOfRange(a,1,7);
		

		for(String i: b){
			System.out.println(i);
		}
		
    }
}