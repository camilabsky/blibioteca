public class Revista extends ItemBiblioteca {
    private String editora;
    private int numero;
    private String peridiocidade;

    public String getEditora() {
        return editora;
    }

    public int getNumero() {
        return numero;
    }

    public String getPeridiocidade() {
        return peridiocidade;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPeridiocidade(String peridiocidade) {
        this.peridiocidade = peridiocidade;
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
                        "Editora: " + editora + "\n" +
                        "Número: " + numero + "\n" +
                        "Peridiocidade: " + peridiocidade + "\n" +
                        "Status: " + status;
        return infos;
    }
}