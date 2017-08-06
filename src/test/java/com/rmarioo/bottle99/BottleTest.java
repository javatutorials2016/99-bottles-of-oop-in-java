package com.rmarioo.bottle99;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BottleTest
{

  private final Bottles bottles = new Bottles();

  @Test
  public void firstVerse() throws Exception
  {
    String result = bottles.verse(99);
    assertThat(result,is(
        "99 bottles of beer on the wall, " +
        "99 bottles of beer.\n" +
        "Take one down and pass it around, " +
        "98 bottles of beer on the wall.\n"));
  }

  @Test
  public void anotherVerse() throws Exception
  {
    String result = bottles.verse(3);
    assertThat(result,is(
        "3 bottles of beer on the wall, " +
        "3 bottles of beer.\n" +
        "Take one down and pass it around, " +
        "2 bottles of beer on the wall.\n"));
  }


}
