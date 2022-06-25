package _07Chapter;

import java.util.Objects;

public class _01Equals {

	public static void main(String[] args) {
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		if (one.equals(two)) {
			System.out.println("one and two are equal");
		}
	}

}

class Moof {
	private int moofValue;

	Moof(int moofValue) {
		super();
		this.moofValue = moofValue;
	}

	public int getMoofValue() {
		return moofValue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(moofValue);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moof other = (Moof) obj;
		return moofValue == other.moofValue;
	}

}
