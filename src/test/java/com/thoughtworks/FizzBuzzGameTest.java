package com.thoughtworks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzGameTest {
    private int[] specialNums;
    private FizzBuzzGame fizzBuzzGame;

    @Before
    public void setUp(){
        specialNums=new int[]{3,5,7};
        fizzBuzzGame=new FizzBuzzGame();
        fizzBuzzGame.setSpecialNums(specialNums);
    }

    @Test
    public void should_return_Fizz_when_is_multiple_of_3() {
        assertEquals(fizzBuzzGame.getResult(6),"Fizz");
        assertEquals(fizzBuzzGame.getResult(9),"Fizz");
        assertEquals(fizzBuzzGame.getResult(99),"Fizz");
    }

    @Test
    public void should_return_Buzz_when_is_multiple_of_5() {
        assertEquals(fizzBuzzGame.getResult(10),"Buzz");
        assertEquals(fizzBuzzGame.getResult(25),"Buzz");
        assertEquals(fizzBuzzGame.getResult(55),"Buzz");
    }

    @Test
    public void should_return_Whizz_when_multiple_of_7() {
        assertEquals(fizzBuzzGame.getResult(14),"Whizz");
        assertEquals(fizzBuzzGame.getResult(49),"Whizz");
        assertEquals(fizzBuzzGame.getResult(77),"Whizz");
    }

    @Test
    public void should_return_Fizz_when_is_multiple_of_3_and_5() {
        assertEquals(fizzBuzzGame.getResult(15),"FizzBuzz");
        assertEquals(fizzBuzzGame.getResult(45),"FizzBuzz");
    }

    @Test
    public void should_return_Fizz_when_is_multiple_of_3_and_7() {
        assertEquals(fizzBuzzGame.getResult(21),"FizzWhizz");
        assertEquals(fizzBuzzGame.getResult(42),"FizzWhizz");
    }

    @Test
    public void should_return_Fizz_when_is_multiple_of_5_and_7() {
        assertEquals(fizzBuzzGame.getResult(175),"BuzzWhizz");
    }

    @Test
    public void should_return_Fizz_when_is_multiple_of_3_5_and_7() {
        assertEquals(fizzBuzzGame.getResult(105),"FizzBuzzWhizz");
    }

    @Test
    public void should_return_Fizz_when_have_3() {
        assertEquals(fizzBuzzGame.getResult(3),"Fizz");
        assertEquals(fizzBuzzGame.getResult(13),"Fizz");
        assertEquals(fizzBuzzGame.getResult(35),"Fizz");
        assertEquals(fizzBuzzGame.getResult(37),"Fizz");
        assertEquals(fizzBuzzGame.getResult(53),"Fizz");
        assertEquals(fizzBuzzGame.getResult(73),"Fizz");
    }
}
