package polimorfismo;

/**
 *
 * @author William
 */
public class Cuadrado extends FiguraGeometrica {

    private double lado;

    public Cuadrado(double ladoP) {
        super();
        this.lado = ladoP;
        this.setArea(ladoP * ladoP);
        this.setPerimetro(ladoP * 4);
    }

    public double getLado() {
        return lado;
    }

    public static void mostrarDatosCuadrado(Cuadrado figura) {
        System.out.println("El area es:" + figura.getArea() + "para un lado de " + figura.getLado());
        System.out.println("El area es:" + figura.getArea() + "para un lado de " + figura.getLado());

    }
}
