public class Main {

    public static void main(String[] args){

        //String utils
        System.out.println(StringUtils.indexOfN("hola co", 'o', 3));

        System.out.println(StringUtils.rtrim("  hola  "));

        System.out.println(StringUtils.ltrim("  hola  "));

        System.out.println(StringUtils.trim("  hola  "));

        System.out.println(StringUtils.rpad("  hola  ", 'c', 2));


        //fecha
        Fecha fecha = new Fecha(1, 12, 2021);
        System.out.println(fecha.toString());

        fecha = new Fecha(30, 4, 1992);
        fecha.sumarUnDia();
        System.out.println(fecha.toString());

        fecha = new Fecha(31, 12, 1999);
        fecha.sumarUnDia();
        System.out.println(fecha.toString());

        //fraccion
        Fraccion fraccion = new Fraccion(5, 7);
        System.out.println(fraccion);

        Fraccion fraccionB = new Fraccion(8, 9);

        Fraccion sumaFraccion = Fraccion.sumar(fraccion, fraccionB);
        System.out.println(sumaFraccion);

        Fraccion restaFraccion = Fraccion.restar(fraccion, fraccionB);
        System.out.println(restaFraccion);

        Fraccion multiplicarFraccion = Fraccion.multiplicar(fraccion, fraccionB);
        System.out.println(multiplicarFraccion);

        Fraccion dividirFraccion = Fraccion.dividir(fraccion, fraccionB);
        System.out.println(dividirFraccion);

        Fraccion sumaNumero = Fraccion.sumar(fraccion, 5);
        System.out.println(sumaNumero);

        Fraccion restaNumero = Fraccion.restar(fraccion, 5);
        System.out.println(restaNumero);

        Fraccion multiplicacionNumero = Fraccion.multiplicar(fraccion, 5);
        System.out.println(multiplicacionNumero);

        Fraccion dividirNumero = Fraccion.dividir(fraccion, 5);
        System.out.println(dividirNumero);

        //libro
        Libro libro = new Libro("harry potter", "123891238", "jk rowling");
        System.out.println(libro.toString());

        libro.prestamo();
        libro.devolucion();

        //Contador
        Contador i = new Contador();
        System.out.println(i.incrementar());
        System.out.println(i.decrementar());
        System.out.println(i.decrementar());
        System.out.println(i.decrementar());
        System.out.println(i.decrementar());

        //Cuenta Corriente
        CuentaCorriente cc = new CuentaCorriente("Agustin Labarque", 9999);

        cc.egreso(200);
        cc.ingreso(500);
        cc.transferencia(1000, new CuentaCorriente("Pepito", 50));
        cc.reintegro(500, new CuentaCorriente("Pepito", 1050));

    }


}
