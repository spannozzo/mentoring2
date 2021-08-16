package org.acme.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddApplicationTests {

	
	@Autowired
	Validator myValidator;
	
	@Test
	void contextLoads() {
		Assertions.assertNotNull(myValidator);
	}
	
	int length = 7;
	
	@Test
	void should_validate_a_length() {
		Assertions.assertTrue(myValidator.validateLength("this_is_a_very_long_string",length));
	
	}
	@Test
	void should_fail_on_validate_a_length() {
		Assertions.assertFalse(myValidator.validateLength("123456",length));
	}
	
	@Test
	void should_validate_if_contains_a_number() {
		Assertions.assertTrue(myValidator.checkHasANumber("lorem_1psum"));
	}
	@Test
	void should_fail_if_not_contain_a_number() {
		Assertions.assertFalse(myValidator.checkHasANumber("lorem_ipsum"));
	}
	
	@Test
	void should_fail_on_empty_string() {
		Assertions.assertFalse(myValidator.checkHasANumber(""));
	}
	
}
