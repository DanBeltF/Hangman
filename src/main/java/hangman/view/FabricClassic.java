package hangman.view;

public class FabricClassic extends FabricHangman{
	public Hangman getColorido(){
		Hangman hg=new HangmanClassic();
		hg.setColor();
		return hg;	
	}

	@Override
	public Hangman getNocolorido() {
		// TODO Auto-generated method stub
		return new HangmanClassic();
	}
}
