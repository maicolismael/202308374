
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args) {
        ListaCSE list = new ListaCSE();
        list.insertar(7);
        list.insertar(3);
        list.insertar(4);
        list.insertar(5);
        list.insertar(0);
        list.insertar(2);
        list.insertar(8);
        System.out.println("Original List:");
        System.out.println(String.join(" ", list.print()));
        list.swamp(1, 6);
        System.out.println("List after swap(1, 6):");
        System.out.println(String.join(" ", list.print()));
    }

    
}
