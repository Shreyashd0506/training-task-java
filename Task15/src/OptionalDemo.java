import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        // 1. Create Optional with a value
        System.out.println("Optional with Value");

        Optional<String> name = Optional.of("Shreyash");

        // get() returns value if present
        System.out.println("Name: " + name.get());


        // 2. Handle Empty Optional
        System.out.println("\n Empty Optional");

        Optional<String> emptyValue = Optional.empty();

        // isPresent() checks whether value exists
        if (emptyValue.isPresent()) {
            System.out.println("Value: " + emptyValue.get());
        } else {
            System.out.println("Value is not present");
        }


        // 3. Using orElse()
        System.out.println("\n Using orElse()");

        Optional<String> city = Optional.ofNullable(null);

        // If value is null, default value is returned
        String result = city.orElse("Pune");

        System.out.println("City: " + result);


        // 4. Using orElseThrow()
        System.out.println("\n Using orElseThrow()");

        Optional<String> country = Optional.of("India");

        // If value is missing, exception is thrown
        String value = country.orElseThrow(() ->
                new RuntimeException("Value not found!")
        );

        System.out.println("Country: " + value);
    }
}