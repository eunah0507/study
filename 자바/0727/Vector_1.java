package ja_0727;
// Vector 중복가능
import java.util.Vector;

public class Vector_1 {
public static void main(String[] args) {
	
	Vector<String>  vv = new  Vector<String>(5); //capacity 가 5인 Vector
	                                             //<String>제너릭타입
	vv.add("1");
	vv.add("2");
	vv.add("3");
	vv.add("4");
	vv.add("5");
	vv.add("6");
	
	//Vector는 capacity를 초과한 분량을 추가하면 capacity가 자동으로 늘어난다.
	// capacity가 자동으로 늘어날 때는 원래의 2배씩! (5 * 2 = 10)
	
	print(vv);
	
	vv.trimToSize(); // 빈공간을 없앤다. 용량크기가 같이진다.
	
	System.out.println("=============================66");
	print(vv);
	vv.ensureCapacity(7); // Vector의 용량이 최소한 minCapacity가 되도록한다.
	System.out.println("=============================77");
    vv.add("1");
    vv.add("2");
    vv.add("3");
    vv.add("4");
    vv.add("5");
    vv.add("6");
    vv.add("7");
    vv.add("8");
     print(vv);	
     
     vv.setSize(8);
     System.out.println("===========================88");
     print(vv);
     
     vv.clear();  // Vector를 비운다 , capacity는 그대로
     System.out.println("===============================");
     print(vv);
     
}
    private static void print (Vector vv) {
     System.out.println(vv);
     System.out.println("vv.size : "+vv.size());
     System.out.println("vv.capacity : "+vv.capacity());

}

}
