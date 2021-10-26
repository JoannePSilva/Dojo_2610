package Controller;

import java.util.ArrayList;

import Model.Pessoa;

public class PessoaController {
    private ArrayList<Pessoa> pessoas;

    public PessoaController() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    // CRUD
    // CREATE
    public void create(Pessoa pessoa){
        this.pessoas.add(pessoa);
    } 
    // READ
    public ArrayList<Pessoa> read(){
        return this.pessoas;        
    } 
    // UPDATE
    public void update(Pessoa pessoa){
        if(pessoas.contains(pessoa)){
            this.delete(pessoa);
            this.create(pessoa);
        }
    } 
    // DELETE
    public void delete(Pessoa pessoa){
        this.pessoas.remove(pessoa);
    } 




    
}