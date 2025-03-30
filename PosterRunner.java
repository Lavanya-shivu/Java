class PosterRunner{
	public static void main(String[] args){
		
		Poster poster=new Poster();
		poster.info();
		
		int size=70;
		Poster poster2=new Poster(size);
		poster2.info();
		
		int width=30;
		Poster poster3=new Poster(size,width);
		poster3.info();
		
		String color="black";
		Poster poster4=new Poster(size,width,color);
		poster4.info();
		
		String design="stars";
		Poster poster5=new Poster(size,width,color,design);
		poster5.info();
		
		String type="Job";
		Poster poster6=new Poster(size,width,color,design,type);
		poster6.info();
		
		
		String brand="IKONICK";
		Poster poster7=new Poster(size,width,color,design,type,brand);
		poster7.info();
		
		boolean useful= true;
		Poster poster8=new Poster(size,width,color,design,type,brand,useful);
		poster8.info();
		
		boolean isAvailable=true;
		Poster poster9=new Poster(size,width,color,design,type,brand,useful,isAvailable);
		poster9.info();
		
		int price=150;
		Poster poster10=new Poster(size,width,color,design,type,brand,useful,isAvailable,price);
		poster10.info();
		
		boolean ispasted = false;
		Poster poster11 = new Poster(size,width,color,design,type,brand,useful,isAvailable,price,
		ispasted);
		poster11.info();
		
	}
}