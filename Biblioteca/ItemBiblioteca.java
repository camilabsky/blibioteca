public class ItemBiblioteca {
    private String titulo;
    private int ano_publicacao;
    private boolean disponivel;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoPublicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public void emprestar() {
        this.disponivel = false;
    }

    public void devolver() {
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return ano_publicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String detalhes() {
        String status = "";
        if(disponivel) {
            status = "disponível";
        } else {
            status = "não disponível";
        }
        String infos = "Título: " + titulo + "\n" +
                        "Ano de publicação: " + ano_publicacao + "\n" +
                        "Disponível: " + status;
        return infos;
    }

    
}
