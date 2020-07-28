package list;

public class TestArray {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		ListArray<Character> list1 = new ListArray<Character>(3);
		list1.insertLast(new Character('b'));
		list1.insertLast(new Character('c'));
		list1.insertLast(new Character('d'));
		System.out.println(list1.toString());
		list1.remove(new Character('c'));
		System.out.println(list1.toString());
		System.out.println(list1.get(0));
		System.out.println(list1.search('b'));
		System.out.println(list1.getIndex('d'));
		System.out.println(list1.searchK(0));
		list1.insertFirst(new Character('a'));
		list1.insertFirst(new Character('f'));
		System.out.println(list1.toString());
	}

}
