package q4;

public class Estadio {

    private String nome;
    private String endereco;

    public Estadio(String nome,String endereco){
    
        this.nome = nome;
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}