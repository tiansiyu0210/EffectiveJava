package Others.StreamExample.CollectorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CustomCollection2<T> implements Collector<T, List<T>, List<T>> {

    @Override
    public Supplier<List<T>> supplier() {

        return () -> {
            System.out.println("in the Supplier");
            return new ArrayList<>();
        };
    }

    @Override
    public BiConsumer<List<T>, T> accumulator() {
        return (list, t) -> {
            System.out.println("in the accumulator");
            if(t.toString().startsWith("b")){
                list.add(t);
            }
        };
    }

    @Override
    public BinaryOperator<List<T>> combiner() {
        return ((left, right) -> {
            left.addAll(right);
            return left;
        });
    }

    @Override
    public Function<List<T>, List<T>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.emptySet();
    }

    public static <T> CustomCollection2<T> getInstance() {
        return new CustomCollection2<>();
    }
}
