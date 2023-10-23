
public class TypeCasting {

	public static void main(String[] args) {
		//Implicit Type Casting
		System.out.println("Implicit Type Casting");
		char c='F';
		System.out.println("before inplicit conversion: "+c);
		int v=c;
		System.out.println("after implicit conversion:"+v);
		int a=20;
		System.out.println("before inplicit conversion: "+a);
		double b=a;
		System.out.println("after implicit conversion:"+b+"\n");
		
		
		//Explicit Type Casting
		System.out.println("Explicit Type Casting");
		int e=65;
		System.out.println("Before Explicit conversion: "+e);
		char f=(char)e;
		System.out.println("After Explicit conversion: "+f);
		
		// TODO Auto-generated method stub

	}

}
