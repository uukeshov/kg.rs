package kg.rs.factory;


import kg.rs.service.TransferBodyService;
import kg.rs.service.TransferBodyServiceToFromXMLImpl;

/**
 * Created by urmat.ukeshov on 20.09.2017.
 */
public class ObjectCreator {

    public static TransferBodyService prepareBody() {

        if (AppProperties.action == AppProperties.action.AUTHORIZE) {
            return new TransferBodyServiceToFromXMLImpl();
        }

        if (AppProperties.action == AppProperties.action.PAYMENT) {
            return new TransferBodyServiceToFromXMLImpl();
        }
        return null;
    }

}
