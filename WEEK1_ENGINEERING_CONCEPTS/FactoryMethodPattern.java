public interface Document {
    void open();
}

public class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word document...");
    }
}

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document...");
    }
}

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel document...");
    }
}

public abstract class DocumentFactory {
    public abstract Document createDocument();
}

public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

public class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class FactoryMethodPattern{
    public static void main(String[] args) {
        DocumentFactory factory = new PdfDocumentFactory();
        Document doc = factory.createDocument();
        doc.open();

        factory = new WordDocumentFactory();
        doc = factory.createDocument();
        doc.open();
    }
}