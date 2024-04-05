package andrianopasquale97.U4W4D4;

import andrianopasquale97.U4W4D4.dao.ItemService;
import andrianopasquale97.U4W4D4.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class OrdersRunner implements CommandLineRunner {
	@Autowired
private ItemService itemService;
	@Override
	public void run(String... args) throws Exception {


		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U4W4D4Application.class);
		try {
			Menu m = (Menu) ctx.getBean("menu");
			m.printMenu();

			Table t1 = (Table) ctx.getBean("Tavolo2");

			Order o1 = new Order(3, t1);

			o1.addItem(ctx.getBean("pizza_margherita", Pizza.class));
			o1.addItem(ctx.getBean("hawaiian_pizza", Pizza.class));
			o1.addItem(ctx.getBean("salami_pizza_xl", Pizza.class));
			o1.addItem(ctx.getBean("lemonade", Drink.class));
			o1.addItem(ctx.getBean("lemonade", Drink.class));
			o1.addItem(ctx.getBean("wine", Drink.class));

			System.out.println("DETTAGLI TAVOLO 1:");
			o1.print();

			System.out.println("CONTO TAVOLO 1");
			System.out.println(o1.getTotal());
			Topping topping1 = ctx.getBean("toppings_tomato", Topping.class);
			            Topping topping2 = ctx.getBean("toppings_cheese", Topping.class);
						itemService.saveItem(topping1);
						            itemService.saveItem(topping2);
			Pizza pizza1=ctx.getBean("pizza_margherita", Pizza.class);
			pizza1.getToppingList().add(topping1);
//			            pizza1.getToppingList().add(topping2);
			itemService.saveItem(pizza1);
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		} finally {
			ctx.close();
		}
	}
}
