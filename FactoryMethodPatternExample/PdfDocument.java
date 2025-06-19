public class PdfDocument implements Document {
    public void open(){
        System.out.println("Opening Pdf Doc");
    }
    public void save(){
        System.out.println("Saving Pdf Doc");
    }
    public void close(){
        System.out.println("Closing Pdf Doc");
    }
}
