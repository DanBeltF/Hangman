package hangman.view;

public class FabricNoViolent extends FabricHangman {

	@Override
	public Hangman getColorido() {
		// Hay que hacer algo
		return new HangmanNoViolent();
	}

	@Override
	public Hangman getNocolorido() {
		
		return new HangmanNoViolent();
	}

}
