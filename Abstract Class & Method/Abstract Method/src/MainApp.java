import parents.Shape;
import childs.Circle;
import childs.Triangle;
public class MainApp {
	public static void main(String [] args) {
		Shape lingkaran = new Circle("Biru", 20);
		Shape segitiga = new Triangle(10, 15, "Merah");
		
		System.out.println("Luas Lingkaran berwarna " + lingkaran.getColor()+" adalah " + lingkaran.getArea());
		System.out.println("Luas Segitiga berwarna " + segitiga.getColor() + " adalah " + segitiga.getArea());
		
	}
}
