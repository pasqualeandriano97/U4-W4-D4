package andrianopasquale97.U4W4D4.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity

@Getter
@Setter

public class Topping extends Item {
	    @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	private String name;

	@ManyToMany(mappedBy = "toppings")
	private Set<Pizza> pizzas = new HashSet<>();

	public Topping() {
    }
	public Topping(String name, int calories, double price) {
		super(calories, price);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Topping{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}
}
