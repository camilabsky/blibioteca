public class Livro extends ItemBiblioteca {
    private String autor;
    private String isbn;
    private int numeroPaginas;

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String detalhes() {
        String status = "";
        if(super.isDisponivel()) {
            status = "disponível";
        } else {
            status = "não disponível";
        }
        String infos = super.detalhes() + "\n" +
                       "Autor: " + autor + "\n" +
                       "Isbn: " + isbn + "\n" +
                       "Número de páginas: " + numeroPaginas + "\n" +
                       "Status: " + status;
        return infos;
    }
    
}
