package Model;

public class BaseModel {
    public int id;

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof BaseModel){
           BaseModel bs = (BaseModel)obj;
           if(this.id == bs.id){
               return true;
           }
       }
        return false;
    }
    @Override
    public String toString() {
        return Integer.toString(this.id);
    }
    
}
