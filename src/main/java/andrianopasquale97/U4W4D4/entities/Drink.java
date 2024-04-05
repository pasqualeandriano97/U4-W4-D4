package andrianopasquale97.U4W4D4.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table
@Getter
@Setter

public class Drink extends Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	private String name;

	public Drink(String name, int calories, double price) {
		super(calories, price);
		this.name = name;
	}


	@Override
	public String toString() {
		return "Drink{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}
}
