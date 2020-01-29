package Game;
import java.util.Random;
import java.util.logging.Logger;

public class Dado {

	private int firstDice;
	private int secondDice;
	private String resultado;
	private int somaDados;
	private Random generador = new Random();
	
	public Dado() {
		this.firstDice = rollTheDice();
		this.secondDice = rollTheDice();
		this.resultado = "";
		this.somaDados = 0;
	}
	
	public int rollTheDice() {
		return generador.nextInt(6) + 1;
	}
	
	public String getResultado() {
		somaDados = firstDice + secondDice;
		if (somaDados == 7) {
			resultado = "Parabéns você ganhou!";
		} else { resultado = "Jogue novamente!"; }
		return resultado;
	}
	
	
	Logger d = Logger.getLogger(Dado.class.getResutado()); 
}
