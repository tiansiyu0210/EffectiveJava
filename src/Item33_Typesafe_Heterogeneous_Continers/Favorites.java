package Item33_Typesafe_Heterogeneous_Continers;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favorites {
    private static Map<Class<?>, Object> favourotes = new HashMap<>();

    public <T> void put(Class<T> type, T instanse){
        favourotes.put(Objects.requireNonNull(type), instanse);
    }

    public static <T> T get(Class<T> type){
        return type.cast(favourotes.get(type));
    }

    public static void main(String[] args) {
        favourotes.put(Integer.class, 5);
        favourotes.put(String.class, "a");

        System.out.println(get(Integer.class));
        System.out.println(get(String.class));
    }
}
