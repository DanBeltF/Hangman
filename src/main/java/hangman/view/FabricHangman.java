package hangman.view;

public abstract class FabricHangman {
	public static FabricClassic getFabricClassic(){
		return new FabricClassic();
	}
	public static FabricNoViolent getFabricNoViolent(){
		return new FabricNoViolent();
	} 
	
	public abstract Hangman getColorido();
	public abstract Hangman getNocolorido();
}
