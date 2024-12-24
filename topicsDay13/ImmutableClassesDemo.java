package chapter4;

final class Person {
	
	private final String name;
	private final int age;
    private final Address address; // A mutable field

    public Person(String name, int age, Address address) {

		this.name = name;
		this.age = age;
		this.address = address;
	}



	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public Address getAddress() {
        // Return a copy of the mutable object
        return new Address(address.getStreet(), address.getCity());
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address=" + address + "}";
    }

}

class Address {
	private String street;
	private String city;

	public Address(String street, String city) {
		this.street = street;
		this.city = city;
	}

	// Getters and setters
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address{street='" + street + "', city='" + city + "'}";
	}

}
public class ImmutableClassesDemo {
    public static void main(String[] args) {
        // Create an Address object
        Address address = new Address("Main Street", "New York");

        // Create an immutable Person object with the Address
        Person person = new Person("John Doe", 30, address);

        // Print the original Person object
        System.out.println("Original Person: " + person);

        // Attempt to modify the address after creating the person
        address.setStreet("Changed Street");
        System.out.println("After modifying address: " + person);

        // Attempt to modify the address via getter
        person.getAddress().setStreet("Another Street");
        System.out.println("After modifying via getter: " + person);
    }
}
