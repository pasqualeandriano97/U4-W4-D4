package andrianopasquale97.U4W4D4.entities;
import jakarta.persistence.Table;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
@Table(name = "pizza_topping")
public class PizzaTopping {



        @EmbeddedId
        private PizzaToppingKey id;

        // Costruttori, getter e setter

        // Eventuali altri campi aggiuntivi
    }


