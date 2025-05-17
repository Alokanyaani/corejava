package operator;

class Car {
	
}
class Maruti extends Car{
	
}
public class Relation {
	public static void main(String[] args){
		Car  c1 = new Car();
		Maruti  m1= new Maruti ();
		
		System.out.println(c1 instanceof Maruti);
		}

}
