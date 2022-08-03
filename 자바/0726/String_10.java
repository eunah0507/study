package ja_0726;

public class String_10 {
	public static void main(String[] args) {
		
		String str_1 = "korea";
		String str_2 = "korea";
		
		System.out.println("str_1 : " + System.identityHashCode(str_1));
		System.out.println("str_2 : " + System.identityHashCode(str_2));
		
		System.out.println("String str_1 = \"korea\" ");
		System.out.println("String str_2 = \"korea\" ");
		System.out.println();
		
		if (str_1 == str_2) 
		{
			System.out.println("str_1 == str_2 = true");
		}
		else
		{
			System.out.println("str_1 == str_2 = false");
		}
		
		if (str_1.equals(str_2))
		{
			System.out.println("str_1.equals(str_2) = true");
		}
		else
		{
			System.out.println("str_1.equals(str_2) = false");
		}
		
		System.out.println();
		
		String str_3 = new String("seoul");
		String str_4 = new String("seoul");
		
		System.out.println();
		
		System.out.println("String str_3 = \"korea\" ");
		System.out.println("String str_4 = \"korea\" ");
		System.out.println();
		
		if (str_3 == str_4) 
		{
			System.out.println("str_3 == str_4 = true");
		}
		else
		{
			System.out.println("str_3 == str_4 = false");
		}
		
		if (str_3.equals(str_4))
		{
			System.out.println("str_3.equals(str_4) = true");
		}
		else
		{
			System.out.println("str_3.equals(str_4) = false");
		}
		
		System.out.println();
		
		System.err.println("str_3 : " + System.identityHashCode(str_3));
		System.err.println("str_4 : " + System.identityHashCode(str_4));
		
	}
}
