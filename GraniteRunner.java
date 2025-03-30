class GraniteRunner{
	public static void main(String[] args){
		
		Granite granite=new Granite();
		granite.info();
		
		int size=70;
		Granite granite2=new Granite(size);
		granite2.info();
		
		int width=30;
		Granite granite3=new Granite(size,width);
		granite3.info();
		
		String color="black";
		Granite granite4=new Granite(size,width,color);
		granite4.info();
		
		String design="stars";
		Granite granite5=new Granite(size,width,color,design);
		granite5.info();
		
		String type="Bengal Black Granite";
		Granite granite6=new Granite(size,width,color,design,type);
		granite6.info();
		
		
		String brand="Cambria";
		Granite granite7=new Granite(size,width,color,design,type,brand);
		granite7.info();
		
		String hardness= 6;
		Granite granite8=new Granite(size,width,color,design,type,brand,hardness);
		granite8.info();
		
		boolean isAvailable=true;
		Granite granite9=new Granite(size,width,color,design,type,brand,hardness,isAvailable);
		granite9.info();
		
		int price=1500;
		Granite granite10=new Granite(size,width,color,design,type,brand,hardness,isAvailable,price);
		granite410.info();
	}
}