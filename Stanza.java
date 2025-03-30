class Stanza{
	int numberOfLines;              
    String rhymeScheme;     
    String meter; 
    String theme;            
    boolean hasRefrain;         
    String firstLine;  
    String secondLine;  
    String thirdLine;     
    String fourthLine;   
    String poet;           
    int stanzaNumber;  
	
	public Stanza(){
		
	}
	public Stanza(int numberOfLines){
		this.numberOfLines=numberOfLines;
	}
	public Stanza(int numberOfLines,String rhymeScheme){
		this(numberOfLines);
		this.rhymeScheme=rhymeScheme;
	}
	public Stanza(int numberOfLines,String rhymeScheme,String meter){
		this(numberOfLines,rhymeScheme);
		this.meter=meter;
	}
	public Stanza(int numberOfLines,String rhymeScheme,String meter,String theme){
		this(numberOfLines,rhymeScheme,meter);
		this.theme=theme;
	}
	public Stanza(int numberOfLines,String rhymeScheme,String meter,String theme,boolean hasRefrain){
		this(numberOfLines,rhymeScheme,meter,theme);
		this.hasRefrain=hasRefrain;
	}
	public Stanza(int numberOfLines,String rhymeScheme,String meter,String theme,boolean hasRefrain,String firstLine){
		this(numberOfLines,rhymeScheme,meter,theme,hasRefrain);
		this.firstLine=firstLine;
	}
	public Stanza(int numberOfLines,String rhymeScheme,String meter,String theme,boolean hasRefrain,String firstLine,String secondLine){
		this(numberOfLines,rhymeScheme,meter,theme,hasRefrain,firstLine);
		this.secondLine=secondLine;
	}
	public Stanza(int numberOfLines,String rhymeScheme,String meter,String theme,boolean hasRefrain,String firstLine,String secondLine,String thirdLine){
		this(numberOfLines,rhymeScheme,meter,theme,hasRefrain,firstLine,secondLine);
		this.thirdLine=thirdLine;
	}
	public Stanza(int numberOfLines,String rhymeScheme,String meter,String theme,boolean hasRefrain,String firstLine,String secondLine,String thirdLine,String fourthLine){
		this(numberOfLines,rhymeScheme,meter,theme,hasRefrain,firstLine,secondLine,thirdLine);
		this.fourthLine=fourthLine;
	}
	public Stanza(int numberOfLines,String rhymeScheme,String meter,String theme,boolean hasRefrain,String firstLine,String secondLine,String thirdLine,String fourthLine,String poet){
		this(numberOfLines,rhymeScheme,meter,theme,hasRefrain,firstLine,secondLine,thirdLine,fourthLine);
		this.poet=poet;
	}
	public Stanza(int numberOfLines,String rhymeScheme,String meter,String theme,boolean hasRefrain,String firstLine,String secondLine,String thirdLine,String fourthLine,String poet,int stanzaNumber){
		this(numberOfLines,rhymeScheme,meter,theme,hasRefrain,firstLine,secondLine,thirdLine,fourthLine,poet);
		this.stanzaNumber=stanzaNumber;
}
public void info() {
		System.out.println("Stanza numberOfLines is" +this.numberOfLines);
		System.out.println("Stanza rhymeScheme is" +this.rhymeScheme);
		System.out.println("Stanza meter is" +this.meter);
		System.out.println("Stanza theme is" +this.theme);
		System.out.println("Stanza hasRefrain is" +this.hasRefrain);
		System.out.println("Stanza firstLine is" +this.firstLine);
		System.out.println("Stanza secondLine is" +this.secondLine);
		System.out.println("Stanza thirdLine is" +this.thirdLine);
		System.out.println("Stanza fourthLine is" +this.fourthLine);
		System.out.println("Stanza poet is" +this.poet);
		System.out.println("Stanza stanzaNumber is" +this.stanzaNumber);
		System.out.println("\n-------------------------------\n");
	}	
	}