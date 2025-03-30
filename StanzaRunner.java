class StanzaRunner{
	public static void main(String args[]){
		
		Stanza stanza = new Stanza();
		stanza.info();
		
		int numberOfLines = 4;
		Stanza stanza1 = new Stanza(numberOfLines);
		stanza1.info();
		
		String rhymeScheme = "ABAB";
		Stanza stanza2 = new Stanza(numberOfLines,rhymeScheme);
		stanza2.info();
		
		String meter = "Iambic Pentameter";
		Stanza stanza3 = new Stanza(numberOfLines,rhymeScheme,meter);
		stanza3.info();
		
		String theme = "Nature"; 
		Stanza stanza4 = new Stanza(numberOfLines,rhymeScheme,meter,theme);
		stanza4.info();
		
		boolean hasRefrain = false; 
		Stanza stanza5 = new Stanza(numberOfLines,rhymeScheme,meter,theme,hasRefrain);
		stanza5.info();
		
		String firstLine = "The sun sets low beyond the trees,";
		Stanza stanza6 = new Stanza(numberOfLines,rhymeScheme,meter,theme,hasRefrain,firstLine);
		stanza6.info();
		
		String secondLine = "A golden glow that fills the air,"; 
		Stanza stanza7 = new Stanza(numberOfLines,rhymeScheme,meter,theme,hasRefrain,firstLine,secondLine);
		stanza7.info();
		
		String thirdLine = "A gentle whisper in the breeze,"; 
		Stanza stanza8 = new Stanza(numberOfLines,rhymeScheme,meter,theme,hasRefrain,firstLine,secondLine,thirdLine);
		stanza8.info();
		
		String fourthLine = "A moment’s peace beyond compare.";
		Stanza stanza9 = new Stanza(numberOfLines,rhymeScheme,meter,theme,hasRefrain,firstLine,secondLine,thirdLine,fourthLine);
		stanza9.info();
		
		String poet = "John Doe"; 
		Stanza stanza10 = new Stanza(numberOfLines,rhymeScheme,meter,theme,hasRefrain,firstLine,secondLine,thirdLine,fourthLine,poet);
		stanza10.info();
		
		int stanzaNumber = 1; 
		Stanza stanza11= new Stanza(numberOfLines,rhymeScheme,meter,theme,hasRefrain,firstLine,secondLine,thirdLine,fourthLine,poet,stanzaNumber);
		stanza11.info();
	
	}
}