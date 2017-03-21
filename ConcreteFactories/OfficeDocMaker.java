package ConcreteFactories;

import AbstractProducts.Document;
import AbstractFactories.DocumentMaker;
import ConcreteProducts.OfficeDoc;

/**
 * Created by malik on 21.03.2017.
 */
public class OfficeDocMaker implements DocumentMaker {
    @Override
    public Document createDocument() {
        return new OfficeDoc();
    }
}
