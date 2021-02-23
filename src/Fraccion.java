public class Fraccion {
    int numerador;
    int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public static Fraccion sumar(Fraccion a, Fraccion b) {
        int nA = a.getNumerador();
        int dA = a.getDenominador();
        int nB = b.getNumerador();
        int dB = b.getDenominador();
        return new Fraccion(nA * dB + dA * nB,dA * dB);
    }

    public static Fraccion sumar(Fraccion a, int b) {
        return sumar(a, new Fraccion(b,1));
    }



    public static Fraccion restar(Fraccion a, Fraccion b) {
        int nA = a.getNumerador();
        int dA = a.getDenominador();
        int nB = b.getNumerador();
        int dB = b.getDenominador();
        return new Fraccion(nA*dB - nB*dA, dA*dB);
    }

    public static Fraccion restar(Fraccion a, int b) {
        return restar(a, new Fraccion(b,1));
    }


    public static Fraccion multiplicar(Fraccion a, Fraccion b) {
        int nA = a.getNumerador();
        int dA = a.getDenominador();
        int nB = b.getNumerador();
        int dB = b.getDenominador();
        return new Fraccion(nA*nB, dA*dB);
    }

    public static Fraccion multiplicar(Fraccion a, int b) {
        return multiplicar(a, new Fraccion(b,1));
    }

    public static Fraccion dividir(Fraccion a, Fraccion b) {
        int nA = a.getNumerador();
        int dA = a.getDenominador();
        int nB = b.getNumerador();
        int dB = b.getDenominador();
        return new Fraccion(nA*dB, dA*nB);
    }

    public static Fraccion dividir(Fraccion a, int b) {
        return dividir(a, new Fraccion(b,1));
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public String toString(){
        return numerador + "/" + denominador;
    }
}
