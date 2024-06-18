import java.util.ArrayList;
/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree<T>
{
    public ArrayList<Tree<T>> childs;
    public T data;
    
    public boolean vacia(){
        boolean res;
        if(data == null){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
    
    public Tree(T data){
        this.data = data;
        this.childs = new ArrayList<>();
    }
}
