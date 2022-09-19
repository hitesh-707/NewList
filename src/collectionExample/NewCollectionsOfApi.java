package collectionExample;

public class NewCollectionsOfApi {
    private static NewCollectionsOfApi instance = new NewCollectionsOfApi();
    private NewCollectionsOfApi(){
        System.out.println("Creating Objects");
    }
    public static NewCollectionsOfApi getInstance(){
                return instance;
    }
}