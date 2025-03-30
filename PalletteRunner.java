class PalletteRunner{
	public static void main(String[] args){
		
		Pallette pallette1=new Pallette();
		pallette1.info();
		
		int size=40;
		Pallette pallette2=new Pallette(size);
		pallette2.info();
		
		int width=17;
		Pallette pallette3=new Pallette(size,width);
		pallette3.info();
		
		String color="pink";
		Pallette pallette4=new Pallette(size,width,color);
		pallette3.info();
		
		String use="painting";
		Pallette pallette5=new Pallette(size,width,color,use);
		pallette5.info();
		
		String type="plastic";
		Pallette pallette6=new Pallette(size,width,color,use,type);
		pallette6.info();
		
		
		String brand="paints";
		Pallette pallette7=new Pallette(size,width,color,use,type,brand);
		pallette7.info();
		
		String material="fiber";
		Pallette pallette8=new Pallette(size,width,color,use,type,brand,material);
		pallette8.info();
		
		boolean isAvailable=true;
		Pallette pallette9=new Pallette(size,width,color,use,type,brand,material,isAvailable);
		pallette9.info();
		
		int price=500;
		Pallette pallette10=new Pallette(size,width,color,use,type,brand,material,isAvailable,price);
		pallette10.info();
	}
}