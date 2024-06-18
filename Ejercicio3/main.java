import java.util.ArrayList;
/**
 * Write a description of class mirarArbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    
    private static <T> void completar(ArrayList<Tree<T>> dess, ArrayList<Tree<T>> des){
        for(int i = 0; i < des.size(); i++){
            dess.add(des.get(i));
        }
    }
    
    private static <T> void llenar(ArrayList<Tree<T>> dess,Cola <Tree<T>> cola){
        for(int i = 0;i < dess.size(); i++){
            cola.encolar(dess.get(i));
        }
    }
    
    public static <T> void mirarArbol(Tree<T> arb) {
        ArrayList<ArrayList<T>> niveles = new ArrayList<>();
        colecNiveles(arb, 0, niveles);

        for (ArrayList<T> nivel : niveles) {
            for (T dato : nivel) {
                System.out.print(dato);
            }
            System.out.println();
        }
    }

    private static <T> void colecNiveles(Tree<T> arb, int nivel, ArrayList<ArrayList<T>> niveles) {
        if (arb != null) {
            if (niveles.size() <= nivel) {
                niveles.add(new ArrayList<>());
            }
    
            niveles.get(nivel).add(arb.data);
    
            for (Tree<T> child : arb.childs) {
                colecNiveles(child, nivel + 1, niveles);
            }
        }
    }
    
    public static void main(String[] args) {
        Tree<Character> root = new Tree<>('c');
        Tree<Character> a = new Tree<>('a');
        Tree<Character> u = new Tree<>('u');
        Tree<Character> h = new Tree<>('h');
        root.childs.add(a);
        root.childs.add(u);
        root.childs.add(h);
        Tree<Character> t1 = new Tree<>('t');
        Tree<Character> t2 = new Tree<>('t');
        Tree<Character> e1 = new Tree<>('e');
        Tree<Character> u1 = new Tree<>('u');
        a.childs.add(t1);
        u.childs.add(t2);
        h.childs.add(e1);
        h.childs.add(u1);
        Tree<Character> s = new Tree<>('s');
        Tree<Character> p = new Tree<>('p');
        Tree<Character> e2 = new Tree<>('e');
        Tree<Character> i = new Tree<>('i');
        Tree<Character> s2 = new Tree<>('s');
        t1.childs.add(s);
        t2.childs.add(p);
        e1.childs.add(e2);
        u1.childs.add(i);
        u1.childs.add(s2);
        mirarArbol(root);
    }
    
    
    
    
    
}

