import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RentalTest {

    @Test
    void testGetChargeForRegularMovie() {
        Movie movie = new Movie("Titanic", Movie.REGULAR);
        Rental rental = new Rental(movie, 3);

        assertEquals(3.5, rental.getCharge());
    }

    @Test
    void testGetChargeForNewRelease() {
        Movie movie = new Movie("Avatar 2", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 2);

        assertEquals(6.0, rental.getCharge());
    }

    @Test
    void testGetChargeForChildrensMovie() {
        Movie movie = new Movie("Frozen 2", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 4);

        assertEquals(3.0, rental.getCharge());
    }

    @Test
    void testFrequentRenterPointsRegular() {
        Movie movie = new Movie("Titanic", Movie.REGULAR);
        Rental rental = new Rental(movie, 1);

        assertEquals(1, rental.getFrequentRenterPoints());
    }

    @Test
    void testFrequentRenterPointsNewReleaseShort() {
        Movie movie = new Movie("Dune", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 1);

        assertEquals(1, rental.getFrequentRenterPoints());
    }

    @Test
    void testFrequentRenterPointsNewReleaseLong() {
        Movie movie = new Movie("Dune 2", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 2);

        assertEquals(2, rental.getFrequentRenterPoints());
    }
}
