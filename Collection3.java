//LinkedList class  methods
import java.util.*;
class Collection3
{
public static void main(String as[])
{
	LinkedList ar=new LinkedList();
	ar.add(10);
	ar.add(10);
	ar.add(20);
	ar.add(20);
	ar.add("ram");
	// ArrayList ar1=new ArrayList();
	// ar1.add(0,10);
	// ar1.add(1,10);
	// ar1.add(2,20);
	// ar1.add(3,20);
	// System.out.println(ar.addAll(ar1));
	// System.out.println(ar.get(1));
	// System.out.println(ar.indexOf(20));
	// System.out.println(ar.lastIndexOf(30));
	// System.out.println(ar.listIterator(3));
	// System.out.println(ar.remove(3));
	// System.out.println(ar.set(2,40));
	// System.out.println(ar.subList(2,3));
	
	System.out.println(ar.getFirst());
	System.out.println(ar.getLast());
	System.out.println(ar.removeLast());
	System.out.println(ar.removeFirst());
	// ar.addFirst(50);
	// ar.addFirst(60);
	
	System.out.println(ar);
}
}