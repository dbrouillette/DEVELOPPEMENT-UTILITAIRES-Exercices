import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class TestRectangle {
	
	@Test
	void TestAire() {
		Rectangle r = new Rectangle();
		r.setHauteur(5);
		r.setLargeur(10);
		assertEquals(50, r.getAire());
		//
	}

	@Test
	void TestLargeurNonNegative() throws Exception {
		Rectangle r = new Rectangle();

	    Throwable exception = assertThrows(ArithmeticException.class, () -> r.setLargeur(-1));
	    assertEquals("Ceci est une valeur invalide!", exception.getMessage());
	}
	
	
	
}
