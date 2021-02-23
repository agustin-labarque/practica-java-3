public class Fecha {
    int dia = 0;
    int mes = 0;
    int anio = 0;

    public Fecha(){

    }

    public Fecha(int dia, int mes, int anio) {
        if(fechaCorrecta(dia, mes, anio)){
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        }else{
            System.out.println("la fecha es incorrecta, dia, mes y anio quedan en 0");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String sumarUnDia(){
        dia++;
        if(dia == 29 && mes == 2 && !esBisiesto(anio)){
            sumarUnMes();
            dia = 1;
        }else if(dia == 30 && mes == 2){
            sumarUnMes();
            dia = 1;
        }else if(dia == 31 && mesTerminaEn30(mes)){
            sumarUnMes();
            dia = 1;
        }else if(dia == 32){
            dia = 1;
            sumarUnMes();
        }
        return this.toString();
    }

    public String toString(){
        return dia + ", " + mes + ", " + anio;
    }

    private boolean esBisiesto(int a){
        return false; //ToDo
    }

    private String sumarUnMes(){
        if(mes == 12){
            sumarUnAnio();
            mes = 1;
        }else{
            mes++;
        }
        return this.toString();
    }

    private boolean mesTerminaEn30(int m){
        return m == 4 || m == 6 || m == 9 || m == 11;
    }

    public String sumarUnAnio(){
        anio++;
        return this.toString();
    }

    public boolean fechaCorrecta(int d, int m, int a) {
        if (d > 31) {
            return false;
        }else if(m > 12 || m < 0){
            return false;
        }else if(d <= 0){
            return false;
        }else if(d <= 30 && mesTerminaEn30(m)){
            return true;
        }else if(d <= 28 && m == 2){
            return true;
        }else if(d == 29 && m == 2 && esBisiesto(a)){
            return true;
        }else if(!mesTerminaEn30(m)) {
            return true;
        }else{
            return false;
        }
    }
}
