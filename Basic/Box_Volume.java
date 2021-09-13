package Basic;

public class Box_Volume {
	
	double height;
	double width;
	double depth;
	// instance variable
	
	Box_Volume( double height, double width ,double depth) //local variable
	{
		 /* if I named local variable same to instance variable, its called Instance variable hiding
		 then if I want to use Local variable
		I have use "THIS" keyword
		*/
		this.height = height;
		this.width  = width;
		this.depth =  depth;
		
	}
	
	void displayvol () {
		
		double vol = height*width*depth;
		System.out.println("Volume is "+ vol);
	}

}
