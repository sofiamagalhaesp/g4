public class CalculoIluminacao {
    
    public static double calcularTotalVA(double areaMetrosQuadrados) {
        double totalVA;
        if (areaMetrosQuadrados <= 6) {
            totalVA = 100;
        } else {
            double x = areaMetrosQuadrados - 6;
            double y = Math.floor(x / 4);
            totalVA = 100 + (60 * y);
        }
        return totalVA;
    }

    public static int calcularQuantidadeDePontos(double totalVA) {
        return (int) (totalVA / 100) + 1;
    }
}
