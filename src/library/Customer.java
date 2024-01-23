package library;

public class Customer extends Person {

	public String dateBecameCustomer;
	public int cardId;

	public Customer() {
		super();
	}

	public Customer(String name, int age, String address, String tel, String dateBecameCustomer, int cardId) {
		super(name, age, address, tel);
		setDateBecameCustomer(dateBecameCustomer);
		setCardId(cardId);

	}

	public String getDateBecameCustomer() {
		return dateBecameCustomer;
	}

	public void setDateBecameCustomer(String dateBecameCustomer) {
		this.dateBecameCustomer = dateBecameCustomer;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	@Override
	public String toString() {
		return "Id:" + getId() + ", Name: " + getName() + ", Age: " + getAge() + ", Address: " + getAddress()
				+ ", Tel: " + getTel() + ", Date became Customer: " + dateBecameCustomer + ", Card ID: " + cardId;
	}

}
