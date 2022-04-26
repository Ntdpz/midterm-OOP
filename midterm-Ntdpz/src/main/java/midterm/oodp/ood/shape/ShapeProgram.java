package midterm.oodp.ood.shape;
public class ShapeProgram {
	public Shape[] shapeArray;
	//Parallelogram parallelogram = new Parallelogram(10, 5);
	//Triangle triangle = new Triangle(10, 5);
	public void start() {
		//TODO: declare and initialize an array of shape object called 'shapeArray' with the length of 2
		shapeArray = new Shape[2];
		shapeArray[0]= new Parallelogram(10,5);
		shapeArray[1]=new Triangle(10,5);
		// TODO Populate the shapeArray with Parallelogram and Triangle and send 10, 5 as parameters for the constructors
		
		printArea(shapeArray);
	
	}
	
	public void printArea(Shape[] shapeArray) {
		// TODO Loop through all the shape in the given list, and print their details 
		//Shape type:[Parallelogram]
		//base:[10.0], height:[5.0], area=[50.0]
		
		for(Shape shape: shapeArray) {
            System.out.println("Shape type : "+shape.typeName);
            System.out.println("base : "+ shape.base+","+shape.height+","+shape.calulateArea());
        }
		
		

        
    	
		
	}
	
	
	public static void main(String[] args) {	
			
		new ShapeProgram().start();		
				
	}

}
