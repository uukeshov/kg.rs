package kg.rs.service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by urmat.ukeshov on 20.09.2017.
 */
public class TransferBodyServiceToFromXMLImpl<T, K> implements TransferBodyService<T, K> {

    public T toXML(K k) {
        JAXBContext jaxbContext;
        Marshaller marshaller = null;
        StringWriter writer = null;
        try {
            jaxbContext = JAXBContext.newInstance(k.getClass());
            marshaller = jaxbContext.createMarshaller();
            writer = new StringWriter();
            marshaller.marshal(k, writer);
        } catch (JAXBException ex) {
            Logger.getLogger(TransferBodyServiceToFromXMLImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (T) writer.toString();
    }


    public T fromXML(T t, String xml) {
        try {
            StringReader reader = new StringReader(xml);
            JAXBContext jAXBContext = JAXBContext.newInstance(t.getClass());
            Unmarshaller unmarshaller = jAXBContext.createUnmarshaller();
            t = (T) unmarshaller.unmarshal(reader);
        } catch (JAXBException ex) {
            Logger.getLogger(TransferBodyServiceToFromXMLImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }
}
