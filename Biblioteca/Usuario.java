import java.util.List;

public class Usuario {
    private String nome;
    private int id_usuario;
    private List<ItemBiblioteca> itens_emprestados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public List<ItemBiblioteca> getItens_emprestados() {
        return itens_emprestados;
    }

    public void setItens_emprestados(List<ItemBiblioteca> itens_emprestados) {
        this.itens_emprestados = itens_emprestados;
    }

    public void emprestar_item(ItemBiblioteca item) {
        if (item.isDisponivel()) {
            item.emprestar();
            itens_emprestados.add(item);
        } else {
            System.out.println("Item não disponível para empréstimo.");
        }
    }
}


