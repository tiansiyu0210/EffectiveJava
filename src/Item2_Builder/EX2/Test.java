package Item2_Builder.EX2;

import static Item2_Builder.EX2.NyPizza.Size.SMALL;

public class Test {

    NyPizza a = new NyPizza.Builder(SMALL)
            .addTopping(Pizza.Topping.SAUSAGE)
            .addTopping(Pizza.Topping.ONION).build();

    Calzone b = new Calzone.Builder()
            .addTopping(Pizza.Topping.HAM)
            .sauceInside().build();
}
