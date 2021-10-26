package Model;

public class Pessoa extends BaseModel{
    public String nome;
    public String sobrenome;
    public int idade; 

    @Override
    public String toString() {
        return "ID: " + super.toString() + "\nNome: "+ this.nome 
                + "\nSobrenome: " + this.sobrenome + "\nIdade: " + this.idade;
    }


}