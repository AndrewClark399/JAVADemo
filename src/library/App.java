package library;

public class App {
	public static void main(String[] args) {

		Book tWITW = new Book();
		tWITW.setTitle("The Wind in the Willows");
		tWITW.setEdition(4);
		tWITW.setSection("D5");
		tWITW.setType("Paperback");
		tWITW.setGenre("Fiction");
		tWITW.setAvailable(true);

		Book oT = new Book();
		oT.setTitle("Oliver Twist");
		oT.setEdition(2);
		oT.setSection("D7");
		oT.setType("Hardback");
		oT.setGenre("Fiction");
		tWITW.setAvailable(true);

		Book gE = new Book();
		gE.setTitle("Great Expectations");
		gE.setEdition(7);
		gE.setSection("C3");
		gE.setType("Paperback");
		gE.setGenre("Fiction");
		tWITW.setAvailable(true);

//		ArrayList<Item> items = new ArrayList<>();
//		items.add(tWITW);
//		items.add(gE);
//		items.add(oT);
//
//		for (Item item : items) {
//			System.out.println(item.toString());
//			System.out.println("class: " + item.getClass().getSimpleName());
//		}
//
//		Collections.sort(items);
//
//		for (Item item : items) {
//			System.out.println(item.toString());
//			System.out.println("class: " + item.getClass().getSimpleName());
//		}

		Library myLibrary = new Library("New Library");
		myLibrary.addItem(oT);
		myLibrary.addItem(gE);
		myLibrary.addItem(tWITW);
		myLibrary.removeItem(2);

		myLibrary.checkOutItem(tWITW);

		Customer aa = new Customer("Aaron Appleton", 42, "3 Cherry Tree", "07123452313", "03/01/2024", 352);

		Customer bb = new Customer("Brenda Bright", 67, "1 New Road", "07534785224", "17/06/1999", 64);

		myLibrary.addCustomer(aa);
		myLibrary.addCustomer(bb);

		System.out.println(myLibrary.toString());

		myLibrary.update(1, "Barry");

	}
}