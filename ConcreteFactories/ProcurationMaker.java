package ConcreteFactories;

import AbstractProducts.Document;
import AbstractFactories.DocumentMaker;
import ConcreteProducts.Procuration;

/**
 * Created by malik on 21.03.2017.
 */
public class ProcurationMaker implements DocumentMaker {
    @Override
    public Document createDocument() {
        return new Procuration();
    }
}
