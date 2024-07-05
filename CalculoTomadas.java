public class CalculoTomadas {

    public static int calcularNumeroDeTomadas(double area, double perimetro) {
        if (area <= 6) {
            return 1;
        } else {
            return (int) Math.ceil(perimetro / 5);
        }
    }
}
