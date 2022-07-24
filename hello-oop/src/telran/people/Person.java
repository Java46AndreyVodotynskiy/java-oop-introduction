package telran.people;

public class Person implements Comparable<Person> {
	private long id;
	private int birthYear;
	private String email;
	
	public Person(long id, int birthYear, String email) {
		this.id = id;
		this.birthYear = birthYear;
		setEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		boolean emailRegex = email.matches(emailRegex());
		if(emailRegex) {
			this.email = email;
		} else {
			//TODO check email with possible IllegalArgumentException throwing
			//Regex simplified <first part>@<second part>
			// <first part> - letter, digit, dot, dash
			//second part - letter, dot
			throw new IllegalArgumentException(String.format("%s - wrong email, " + "Use 6 or more characters with a mix of letters, numbers and point", email
					));
		}
	}

	private String emailRegex() {
		String firstPart = "[0-9A-Za-z.-]{6,}";
		String secondPart = "[A-Za-z-]{2,}.{1}[a-z]{2,}";
		return String.format("((%s))@(%s)", firstPart, secondPart);
	}

	public long getId() {
		return id;
	}

	public int getBirthYear() {
		return birthYear;
	}
	
	public int compareTo(Person o) {
		
		return Long.compare(this.id, o.id);
	}
}


