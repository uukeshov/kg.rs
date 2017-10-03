package kg.rs.service;

/**
 * Created by urmat.ukeshov on 20.09.2017.
 */
public interface TransferBodyService<T, K> {
    public T toXML(K k);

    public T fromXML(T t, String xml);
}
