import AbstractFactories.DocumentMaker;
import AbstractFactories.RequestMaker;
import Delegate.DocumentDelegator;
import Delegate.RequestDelegator;
import Enums.DocumentType;
import Enums.RequestType;
import Utils.DocumentSelector;

/**
 * Created by malik on 21.03.2017.
 * In this projects implemented 2 design patterns: Delegate and AbstractFactory
 */
public class Main {

    public static void main(String[] args) {

        /*Document selector is creates factories*/
        DocumentSelector selector = new DocumentSelector();
        /*Getting Office Doc Factory*/
        DocumentMaker documentMaker = selector.getDocumentMaker(DocumentType.OFFICE_DOC);
        /*Getting Personel Request Factory*/
        RequestMaker requestMaker = selector.getRequestMaker(RequestType.PERSONEL_REQUEST);

        /*Delegating create and save methods*/
        DocumentDelegator delegator = new DocumentDelegator();
        delegator.setDocument(documentMaker.createDocument());
        delegator.create();
        delegator.save();

        /*Delegating create, approve and close methods*/
        RequestDelegator requestDelegator = new RequestDelegator();
        requestDelegator.setRequest(requestMaker.createRequest());
        requestDelegator.create();
        requestDelegator.approve();
        requestDelegator.close();


    }
}
