package tr.com.teb.tebws.optimus.model;

import java.io.Serializable;

public class OptimusExceptionWrapper extends Exception implements Serializable {
    public OptimusExceptionWrapper() {
        super();
    }

    public OptimusExceptionWrapper(String message) {
        super(message);
    }

    public OptimusExceptionWrapper(String message, Throwable cause) {
        super(message, cause);
    }
}
