public class CuentaCorriente {
    private String nombre = "";
    private int saldo = 0;

    public CuentaCorriente(String nombre, int saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cc){
        setSaldo(cc.getSaldo());
        setNombre(cc.getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void ingreso(int dinero){
        saldo += dinero;
        System.out.println("se agrego " + dinero + " a tu cuenta");
    }

    public void egreso(int dinero){
        saldo -= dinero;
        System.out.println("se desconto " + dinero + " de tu cuenta");
    }

    public void transferencia(int dinero, CuentaCorriente cc){
        this.egreso(dinero);
        cc.ingreso(dinero);
        System.out.println("se transfirio " + dinero + " a la cuenta de " + cc.getNombre());
    }

    public void reintegro(int dinero, CuentaCorriente cc){
        this.ingreso(dinero);
        cc.egreso(dinero);
        System.out.println("se te reintegro " + dinero + " de la cuenta de " + cc.getNombre());
    }
}
