package andrianopasquale97.U4W4D4.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class PizzaToppingKey implements Serializable {

    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

    @ManyToOne
    @JoinColumn(name = "topping_id")
    private Topping topping;

    // Costruttori, getter e setter

    // Implementare i metodi equals e hashCode
}

