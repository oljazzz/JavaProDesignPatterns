package Utils;

import AbstractFactories.DocumentMaker;
import AbstractFactories.RequestMaker;
import ConcreteFactories.*;
import Enums.DocumentType;
import Enums.RequestType;

/**
 * Created by malik on 21.03.2017.
 */
public class DocumentSelector {

    public DocumentMaker getDocumentMaker(DocumentType type) {
        DocumentMaker maker = null;
        switch (type) {
            case OFFICE_DOC:
                maker = new OfficeDocMaker();
                break;
            case AHD_DOCUMENT:
                maker = new AhdDocumentMaker();
                break;
            case PROCURATION:
                maker = new ProcurationMaker();
                break;

        }
        return maker;
    }

    public RequestMaker getRequestMaker(RequestType type) {
        RequestMaker maker = null;
        switch (type) {
            case PERSONEL_REQUEST:
                maker = new PersonelRequestMaker();
                break;
            case IT_REQUEST:
                maker = new ITRequestMaker();
                break;
        }
        return maker;
    }

}
