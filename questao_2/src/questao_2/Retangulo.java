package questao_2;

public class Retangulo {
	
	public double lado1;
    public double lado2;
    public double area;
    public double perimetro;
     	
    public Retangulo(double lado1, double lado2) {
    	  this.lado1 = lado1;
          this.lado2 = lado2;  
    }
    
    public double calcularArea() {
    	area = lado1 * lado2;
        return area; 	
    }
    
    public double calcularPerimetro() {
    	perimetro = 2 * (lado1 + lado2);
    	return perimetro;
    }

}