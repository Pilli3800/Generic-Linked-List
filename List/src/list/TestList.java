package list;

public class TestList {

	@SuppressWarnings("deprecation") // Evita warnings con el constructor de Integer.
	public static void main(String[] args) {

		ListLinked<Integer> list1 = new ListLinked<Integer>();
		list1.insertFirst(new Integer(1));
		list1.insertFirst(new Integer(2));
		list1.insertLast(new Integer(3));
		list1.insertLast(new Integer(4));
		System.out.println(list1.toString());
		list1.setHead(list1.reverseList(list1.getHead()));
		System.out.println(list1.toString());
		list1.removeNode(list1.getNodeAt(2));
		System.out.println(list1.toString());
		System.out.println(list1.isEmpty());
		System.out.println(list1.length());
		System.out.println(list1.searchK(2));
		System.out.println(list1.search(2));
		System.out.println(list1.search(3));
		System.out.println(list1.getIndex(45));

		OrderListLinked<Integer> list2 = new OrderListLinked<Integer>();
		list2.initializeList();
		list2.insert(new Integer(45));
		list2.insert(new Integer(3));
		list2.insert(new Integer(7));
		list2.insert(new Integer(70));
		list2.insert(new Integer(96));
		list2.remove(new Integer(7));
		System.out.println(list2.search(3));
		System.out.println(list2.toString());

		OrderDescLinked<Integer> list3 = new OrderDescLinked<Integer>();
		list3.initializeList();
		list3.insert(new Integer(45));
		list3.insert(new Integer(3));
		list3.insert(new Integer(7));
		list3.insert(new Integer(70));
		list3.insert(new Integer(96));
		list3.remove(new Integer(70));
		System.out.println(list3.search(new Integer(70)));
		System.out.println(list3.toString());

	}

}
