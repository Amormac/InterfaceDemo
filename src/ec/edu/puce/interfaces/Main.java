package ec.edu.puce.interfaces;

public class Main {

	public static void main(String[] args) {
		System.out.println("hola puce");
		
		Rectangulo rectangulo1 = new Rectangulo();
		rectangulo1.setAltura(10);
		rectangulo1.setBase(5);
		rectangulo1.setNombre("rectangulo 1");
		System.out.println("El area del " + rectangulo1.getNombre() + " es: " + rectangulo1.calcularArea());
		
		Circulo circulo1 = new Circulo();
		circulo1.setNombre("circulo 1");
		circulo1.setRadio(6);
		System.out.println("El area del " + circulo1.getNombre() + " es: " + circulo1.calcularArea());
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAltura(5);
		triangulo1.setBase(10);
		triangulo1.setNombre("triangulo 1");
		System.out.println("El area del " + triangulo1.getNombre() + " es: " + triangulo1.calcularArea());

	}
	

}
