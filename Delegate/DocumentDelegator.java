package Delegate;

import AbstractProducts.Document;

/**
 * Created by malik on 21.03.2017.
 */
public class DocumentDelegator {
    private Document document;


    public void setDocument(Document document) {
        this.document = document;
    }

    public void save() {
        document.save();
    }

    public void create() {
        document.create();
    }


}
