public class ExcelDocument implements Document {
    public void open(){
        System.out.println("Opening Excel Doc");
    }
    public void save(){
        System.out.println("Saving Excel Doc");
    }
    public void close(){
        System.out.println("Closing Excel Doc");
    }
}
