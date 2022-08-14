class InstanceofDemo {
    public static void main(String[] args) {
	
        
		Parent o1 = new Parent();
		Parent o2 = new Child();
		
		System.out.println("o1 instance of parent :"+ (o1 instanceof Parent));
		System.out.println("o1 instance of Child :"+ (o1 instanceof Child));
		System.out.println("o1 instance of MyInterface :"+ (o1 instanceof MyInterface));
		System.out.println("o2 instance of parent :"+ (o1 instanceof Parent));
		System.out.println("o2 instance of Child :"+ (o1 instanceof Child));
		System.out.println("o2 instance of MyInterface :"+ (o1 instanceof MyInterface));
		
		
		
		
    }
}

class Parent{}
class child extends Parent implements MyInterface{}
interface MyInterface{}
