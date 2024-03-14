
package polimorfismo;

/**
 *
 * @author William
 */
public class FiguraGeometrica {

    private double area;
    private double perimetro;

    public void figuraGeometrica() {
        area = 0.0;
        perimetro = 0.0;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void mostrarDatosFigura(FiguraGeometrica figura) {
        System.out.println("El area es:" + area);
        System.out.println("El perimetro es: " + perimetro);
        
    }
}
