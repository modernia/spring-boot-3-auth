package io.ansan.authentication;

import io.ansan.authentication.demo.DemoController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DemoControllerTest {

  @Test
  void testNotPath() {
    assertEquals(ResponseEntity.ok("Not protected route"), new DemoController().demo());
  }


}
