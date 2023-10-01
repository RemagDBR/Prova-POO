package questao_2;

public class Principal {

	public static void main(String[] args) {
	
		Retangulo retangulo = new Retangulo(10, 5);
		
		double area = retangulo.calcularArea();
        System.out.println("Área: " + area);
        
        double perimetro = retangulo.calcularPerimetro();
        System.out.println("Perímetro: " + perimetro);
    }
		
		
		
	}