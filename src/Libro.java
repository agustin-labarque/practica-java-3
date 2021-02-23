public class Libro {
    String titulo;
    String isbn;
    String autor;
    Boolean prestado = false;

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void prestamo(){
        prestado = true;
        System.out.println("El libro " + titulo + " fue prestado");
    }

    public void devolucion(){
        prestado = false;
        System.out.println("El libro " + titulo + " fue devuelto");
    }

    @Override
    public String toString(){
        return titulo + ", " + isbn + ", " + autor;
    }
}
