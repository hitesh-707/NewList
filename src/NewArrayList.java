import java.util.ArrayList;
public class NewArrayList {
    public static void main(String[]args){
        ArrayList list = new ArrayList();
        //System.out.println(list);
        list.add(10);
        list.add("Hitesh");
        list.add('c');
        list.add(10.98);
        //System.out.println(list);
        //System.out.println(list.size());
       // System.out.println(list.get(1));
        //list.remove(3);
        //System.out.println(list.size());
       // for(int i=0;i<= list.size();i++){
         //   System.out.println(list.get(i));
       // }
        for (Object var:
            list ) {
            System.out.println(var);
        }
    
    }
}