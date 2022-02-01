package test.java;

import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;

import main.java.Calculs;
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
class CalculsTest2 {

//	@Test
//	void test()
//	{
//		fail("Not yet implemented");
//	}

	// region Multiplier
    static Stream<Arguments> chargerJeuDeTestMultiplier() throws Throwable
    {
        return Stream.of(
            Arguments.of(2, 2, 4), // appellera : testMultiplier(2,2,4)
            Arguments.of(6, 6, 36),
            Arguments.of(3, 2, 3)
        );
    }

	@ParameterizedTest(name="Multiplication numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestMultiplier")
	void testMultiplier(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
		Calculs monCal = new Calculs(firstNumber, secondNumber);
		assertEquals(expectedResult, monCal.multiplier(), "test en échec pour " + firstNumber + " * " + secondNumber + " != " + expectedResult);
	}

	// endregion

	// region Additionner
	static Stream<Arguments> chargerJeuDeTestAdditionner() throws Throwable
	{
		return Stream.of(
				Arguments.of(2, 2, 4), // appellera : testMultiplier(2,2,4)
				Arguments.of(6, 6, 12),
				Arguments.of(3, 2, 5)
		);
	}

	@ParameterizedTest(name="Additionner numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestAdditionner")
	void testAdditionner(int firstNumber, int secondNumber, int expectedResult)
	{
		// Partie paramétrée
		Calculs monCal = new Calculs(firstNumber, secondNumber);
		assertEquals(expectedResult, monCal.additionner(), "test en échec pour " + firstNumber + " + " + secondNumber + " != " + expectedResult);
	}
	// endregion


	// region Additionner
	static Stream<Arguments> chargerJeuDeTestDiviser() throws Throwable
	{
		return Stream.of(
				Arguments.of(2, 2, 1),
				Arguments.of(12, 6, 2)
		);
	}

	@ParameterizedTest(name="Diviser numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestDiviser")
	void testDiviser(int firstNumber, int secondNumber, int expectedResult)
	{
		// Partie paramétrée
		Calculs monCal = new Calculs(firstNumber, secondNumber);
		assertEquals(expectedResult, monCal.diviser(), "test en échec pour " + firstNumber + " / " + secondNumber + " != " + expectedResult);
	}
	// endregion

	// region Additionner
	static Stream<Arguments> chargerJeuDeTestSoustraire() throws Throwable
	{
		return Stream.of(
				Arguments.of(2, 2, 0),
				Arguments.of(12, 6, 6)
		);
	}

	@ParameterizedTest(name="Soustraire numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestSoustraire")
	void testSoustraire(int firstNumber, int secondNumber, int expectedResult)
	{
		// Partie paramétrée
		Calculs monCal = new Calculs(firstNumber, secondNumber);
		assertEquals(expectedResult, monCal.soustraire(), "test en échec pour " + firstNumber + " - " + secondNumber + " != " + expectedResult);
	}
	// endregion

}
