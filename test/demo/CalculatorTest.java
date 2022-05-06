package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void sum() {

    //arrange
    Calculator calculator = new Calculator();

    //act
    int actual = calculator.sum(1,2);

    //assert
    int expected = 3;
    assertEquals(expected,actual);

  }


  @Test
  void sumNegativeNumbers() {

    //arrange
    Calculator calculator = new Calculator();

    //act
    int actual = calculator.sum(-1,-2);

    //assert
    int expected = -3;
    assertEquals(expected,actual);

  }

  @Test
  void sumVeryLargeNumbers() {

    //arrange
    Calculator calculator = new Calculator();

    //act + assert
    assertThrows(IllegalArgumentException.class, () ->{
      calculator.sum(Integer.MAX_VALUE, Integer.MAX_VALUE);
    });


  }

  @Test
  void sumTooLargeNumbers() {

    //arrange
    Calculator calculator = new Calculator();

    //act + assert
    assertThrows(IllegalArgumentException.class, () ->{
      calculator.sum(100, 101);
    });


  }

}