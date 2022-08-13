class ArrayCopyDemo {
    public static void main(String[] args) {
	
        String[] a={"shanid","thanveer","jaza","aaban",
		"hafeefa","khadeeja","moosa"};
		
		String[] b = new String[4];
		
		//public static void arraycopy(Object src, int srcPos,Object dest, int destPos, int length)
		System.arraycopy(a,2,b,0,4);
		
		for(String i: b){
			System.out.println(i);
		}
		
    }
}