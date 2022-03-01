package test.java;

import static org.junit.jupiter.api.Assertions.*;


import java.io.IOException;
import java.util.stream.Stream;

import main.java.Calculs;
import main.java.TriTableau;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Yo
 *
 */
@RunWith(Parameterized.class)
class TriTableuTest {

    // region Tri Croissant
    static Stream<Arguments> chargerJeuDeTestTriCroissant() throws Throwable
    {
        return Stream.of(
                Arguments.of(new int[] {5, 3, 10, 7}, new int[] {3, 5, 7, 10}),
                Arguments.of(new int[] {10, 2, 152, 17, 1, 0}, new int[] {0, 1, 2, 10, 17, 152}),
                Arguments.of(new int[] {3, 2, 1}, new int[] {1, 3, 2})
        );
    }

    @ParameterizedTest(name="Tri Croissant N° {index}: tableau={0}, résultat attendu = {1}")
    @MethodSource("chargerJeuDeTestTriCroissant")
    void testTriCroissant(int tabToSort[], int expected[]) throws IOException
    {
        TriTableau.triCroissant(tabToSort);
        assertArrayEquals(expected, tabToSort, "Test en échec");
    }
    // endregion
    
    // region Tri Décroissant
    @Test
    void testTriDeCroissant() throws IOException {

        int tabToSort[] = new int[] {5, 3, 10, 7};
        int excptedResult[] = new int[] {10, 7, 5, 3};

        TriTableau.triDecroissant(tabToSort);

        assertArrayEquals(excptedResult, tabToSort, "Test en échec zebi");
    }
    // endregion
}
