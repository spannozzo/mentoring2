package org.acme.tdd;

import java.util.Optional;
import org.springframework.stereotype.Component;


@Component
public class Validator {

	public boolean validateLength(String string, int length) {
		
		return string.length()>=length;
	}

	
	protected boolean checkHasANumber(String password) {
				
		
		Optional<Optional<Integer>> o=Optional.of(Optional.of(1));
		
		return password.chars()
				.boxed()
				.map(c->{
					
					return c;
				})
				.filter(Character::isDigit).count()>0;
		
	}
	
}
