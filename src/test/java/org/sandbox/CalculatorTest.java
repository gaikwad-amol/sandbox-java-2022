package org.sandbox;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

  private Calculator calculator;

  @BeforeClass
  public static void beforeClass() {
    // connect to database
  }


  @Before
  public void setup() {
    // add some test data
    System.out.println("Before ");
    calculator = new Calculator();
  }

  @After
  public void tearDown() {
    // reset the data
    System.out.println("After ");
    calculator = null;
  }

  @Test
  public void shouldAddPositiveNumbers() {
    System.out.println("Test 1 ");
    //Given
    Integer number1 = 2;
    Integer number2 = 3;

    // When
    Integer actualResult = calculator.add(number1, number2);

    // Then
    assertEquals(Integer.valueOf(5), actualResult);
  }

  @Test
  public void shouldAddNegativeNumbers() {
    System.out.println("Test 2 ");
    //Given
    Integer number1 = -2;
    Integer number2 = -3;

    // When
    Integer actualResult = calculator.add(number1, number2);

    // Then
    assertEquals(Integer.valueOf(-5), actualResult);
  }
}

