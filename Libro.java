import java.util.Set;

public class Libro {
    /*
    Son los atributos que va atener la clase libros
     */
    private String titulo;
    private String autor;
    private int numeroPagina;


    /**
     *  el public void Libro: Es el constructor y nos va ayudar a inicializar
     * @param titulo
     * @param autor
     * @param numeroPagina
     */

    public Libro (String titulo, String autor, int numeroPagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;


    }
    /*
    Utilizamos setTitulo para que nos de el valor del titulo o sea el nombre del titulo
     */
     public void setTitulo (String titulo){
        this.titulo=titulo;
     }
    /*
   Utilizamos setTitulo para que nos de el valor del autor o sea el nombre del autor
    */
    public void setAutor(String autor) {
        this.autor = autor;

    }
    /*
    Utilizamos setNumeroPagina para que nos de el valor de setNumeroPagina o sea la pàgina del libro
     */
    public void setNumeroPagina(int numeroPagina){
        this.numeroPagina=numeroPagina;
    }
    /*
    Utilizamos getTitulo para mostrarle al usuario el titulo
     */
    public String getTitulo (){
        return  getTitulo();
    }
    /*
    Utilizamos getAutor para mostrarle al usuario el autor del libro
     */
    public String getAutor (){
        return getAutor();
    }
    /*
    Utilizamos getNumeroPagina para mostrarle al usuario la paginas del libro
     */
    public int getNumeroPagina() {
        return numeroPagina;
    }
}
