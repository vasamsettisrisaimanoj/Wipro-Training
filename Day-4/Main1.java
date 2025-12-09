class Main1
{
public static void main(String args[])
{
// create boxes using the various
// constructors
ThreeDimensionShape shape1 = new ThreeDimensionShape(5, 6, 7); 
ThreeDimensionShape shape2 = new ThreeDimensionShape();
ThreeDimensionShape shape3 = new ThreeDimensionShape(8);

double volume;

// get volume of first box volume = shape1.volume();
 
System.out.println("Volume of shape1 is " + shape1.volume());

// get volume of second box volume = shape2.volume();
System.out.println("Volume of shape2 is " + shape2.volume());

// get volume of cube volume = shape3.volume();
System.out.println("Volume of shape3 is " + shape3.volume());
}
}
class ThreeDimensionShape
 
{
double width, height, depth;

// constructor used when all dimensions are defined 
ThreeDimensionShape (double w, double h, double d)
{
     //write your code here
   this.width = w;
   this.height = h;
   this.depth = d;
}

// constructor used when one dimension is defined

ThreeDimensionShape (double l)
{
 //write your code here
 this.height=l;
 this.width =l;
 this.depth = l;
}

// constructor used when no dimension is specified 
ThreeDimensionShape()
{
   //write your code here
   this.height=0;
   this.width=0;
   this.depth=0;

}


// compute and return volume 
double volume()
{
return width * height * depth;
}
}