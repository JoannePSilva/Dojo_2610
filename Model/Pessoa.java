package Model;

public class Pessoa{
    public String nome;
    public String sobrenome;
    public int idade; 

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pessoa){
            Pessoa outra = (Pessoa)obj;
            if(this.nome.equals(outra.nome) && this.sobrenome.equals(outra.sobrenome) && this.idade == outra.idade);
            return true;
        }
        return false;
    }


}