package andrianopasquale97.U4W4D4.entities;

import jakarta.persistence.*;

import jakarta.persistence.Table;
import lombok.Getter;
@Entity

@Inheritance(strategy = InheritanceType.JOINED)
@Getter
public abstract class Item {
	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	protected int calories;
	protected double price;

	public Item() {
	}

	public Item(int calories, double price) {
		this.calories = calories;
		this.price = price;
	}

	public double getPrice() {
		        return this.price;
	}

	public int getCalories() {
		return calories;
	}



}
