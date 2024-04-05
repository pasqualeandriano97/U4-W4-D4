package andrianopasquale97.U4W4D4.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
@Getter

public class Pizza extends Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	private String name;
	@ManyToMany
	@JoinTable(
			name = "pizza_topping",
			joinColumns = @JoinColumn(name = "pizza_id"),
			inverseJoinColumns = @JoinColumn(name = "topping_id")
	)
	private List<Topping> toppings = new ArrayList<>();
	private boolean isXl = false;

	public Pizza(String name, List<Topping> toppingList, boolean isXl) {
		super(700, 4.3);
		this.name = name;
		this.toppings = toppingList;
		this.isXl = isXl;
	}

	@Override
	public int getCalories() {
		return super.getCalories() + this.getToppingList().stream().mapToInt(Topping::getCalories).sum();
	}

	public String getName() {
		return name;
	}

	public List<Topping> getToppingList() {
		return toppings;
	}

	public boolean isXl() {
		return isXl;
	}

//	@Override
//	public double getPrice() {
//		return super.getPrice() + this.getToppingList().stream().mapToDouble(Topping::getPrice).sum();
//	}

	@Override
	public String toString() {
		return "Pizza{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				", toppingList=" + toppings +
				", isXl=" + isXl +
				'}';
	}
}
