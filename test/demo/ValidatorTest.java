package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

  @Test
  public void test_IsEven_With_Even_Number() {
    //arrange
    Validator validator = new Validator();

    // act
    boolean actual = validator.isEven(6);

    //assert
    assertTrue(actual);

  }

  @Test
  public void test_IsEven_With_Odd_Number() {
    //arrange
    Validator validator = new Validator();

    // act
    boolean actual = validator.isEven(7);

    //assert
    assertFalse(actual);

  }

}