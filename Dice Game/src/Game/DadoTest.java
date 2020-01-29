package Game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

class DadoTest extends Dado {

	@Test
	public void testGetResultado() {
		Dado d = new Dado();
		Logger dice = Logger.getLogger(Dado.class.getResult());
		assertEquals(7, d.getResult());
	}

}
