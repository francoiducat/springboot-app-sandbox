package com.ducatillon.springbootappsandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created on 01/24/2020.
 */
public class FooTest {

  @Test
  void getBar() {

    Foo foo = new Foo();
    String result = foo.getBar();
    assertEquals("FooBar", result);
  }
}
