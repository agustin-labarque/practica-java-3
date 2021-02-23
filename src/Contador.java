public class Contador {
    private int contador = 0;

    /*
    Se crea un contador igual a 0
     */
    public Contador() {
    }

    public Contador(int contador) {
        this.contador = contador;
    }

    public Contador(Contador contador) {
        this.contador = contador.getContador();
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int incrementar(){
        return ++contador;
    }

    public int decrementar(){
        return --contador;
    }
}
