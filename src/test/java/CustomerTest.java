import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void testStatementSingleRental() {
        Customer customer = new Customer("John Doe");
        Movie movie = new Movie("Interstellar", Movie.REGULAR);
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);

        String statement = customer.statement();

        assertTrue(statement.contains("Rental Record for John Doe"));
        assertTrue(statement.contains("Interstellar"));
        assertTrue(statement.contains("Amount owed is 3.5"));
        assertTrue(statement.contains("You earned 1 frequent renter points"));
    }

    @Test
    void testStatementMultipleRentals() {
        Customer customer = new Customer("Jane Doe");
        Movie movie1 = new Movie("Toy Story", Movie.CHILDRENS);
        Movie movie2 = new Movie("Joker", Movie.NEW_RELEASE);
        customer.addRental(new Rental(movie1, 4)); // children's
        customer.addRental(new Rental(movie2, 2)); // new release

        String statement = customer.statement();

        assertTrue(statement.contains("Toy Story"));
        assertTrue(statement.contains("Joker"));
        assertTrue(statement.contains("Amount owed is 9.0")); // 3.0 + 6.0
        assertTrue(statement.contains("You earned 3 frequent renter points")); // 1 + 2
    }
}
