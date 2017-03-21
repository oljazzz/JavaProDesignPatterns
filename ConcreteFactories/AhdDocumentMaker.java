package ConcreteFactories;

import AbstractProducts.Document;
import AbstractFactories.DocumentMaker;
import ConcreteProducts.AhdDocument;

/**
 * Created by malik on 21.03.2017.
 */
public class AhdDocumentMaker implements DocumentMaker {
    @Override
    public Document createDocument() {
        return new AhdDocument();
    }
}
