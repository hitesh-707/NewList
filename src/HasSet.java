import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Hitesh");
        set.add("Solanki");
        set.add("King");
        set.add("Hitesh");
       /* System.out.println(set);
        set.remove("Polanski");*/
        //System.out.println(set);
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String var = itr.next();
            if (var.equals("Hitesh")) {
                System.out.println(var);
            }
        }
    }
}