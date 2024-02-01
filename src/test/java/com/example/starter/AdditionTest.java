package com.example.starter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

  @Test
  void tenPlusTwentyIsThirty(){
    Addition addObject = new Addition();
    assertEquals( 30,addObject.add(14,20));
  }





}
