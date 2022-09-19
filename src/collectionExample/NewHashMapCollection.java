package collectionExample;

import java.util.*;

public class NewHashMapCollection {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("FirstName","Hitesh");
        map.put("LastName","Solanki");
        map.put("Qualification","Java");
       // System.out.println(map);
        //System.out.println(map.get("LastName"));
       /* Set<String> keys =map.keySet();
        for (String key:
             keys) {
            System.out.println("key"+" "+key+" "+"value is"+" "+map.get(key));*/
            /*Map<String, List<String>> map1 = new HashMap<String, List<String>>();
            List<String>ListOfEmails = new ArrayList<String>();
            ListOfEmails.add("hitu@gmail.com");
            ListOfEmails.add("hhhh@gmail.com");
            ListOfEmails.add("ss@gmail.com");
            System.out.println("email:"+" "+ListOfEmails);*/

        /*Map<String,List<String>>map2= new HashMap<String,List<String>>();
        List<String>ListOfEmailID = new ArrayList<String>();
        ListOfEmailID.add("sh@gmail.com");
        System.out.println(ListOfEmailID);*/
        Map<String,List<String>>map3 = new HashMap<String,List<String>>();
        List<String>ListOfMail=  new ArrayList<String>();
        ListOfMail.add("dev@gmail.com");
        System.out.println(ListOfMail);


        }
    }

