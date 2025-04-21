import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MovieTest {

    @Test
    void testMovieInitialization() {
        Movie movie = new Movie("Inception", Movie.NEW_RELEASE);

        assertEquals("Inception", movie.getTitle());
        assertEquals(Movie.NEW_RELEASE, movie.getPriceCode());
    }

    @Test
    void testSetPriceCode() {
        Movie movie = new Movie("Frozen", Movie.CHILDRENS);
        movie.setPriceCode(Movie.REGULAR);

        assertEquals(Movie.REGULAR, movie.getPriceCode());
    }
}
