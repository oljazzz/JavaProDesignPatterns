package Delegate;

import AbstractProducts.Request;

/**
 * Created by malik on 21.03.2017.
 */
public class RequestDelegator {
    Request request;

    public void setRequest(Request request) {
        this.request = request;
    }

    public void create() {
        request.create();
    }

    public void approve() {
        request.approve();
    }

    public void close() {
        request.closed();
    }
}
