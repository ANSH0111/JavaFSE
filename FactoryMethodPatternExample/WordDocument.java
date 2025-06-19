public class WordDocument implements Document {
    public void open(){
        System.out.println("Opening Word Doc");
    }
    public void save(){
        System.out.println("Saving Word Doc");
    }
    public void close(){
        System.out.println("Closing Word Doc");
    }
}
