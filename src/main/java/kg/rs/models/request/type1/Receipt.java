package kg.rs.models.request.type1;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "datetime",
        "receiptNumber"
})
@XmlRootElement(name = "receipt")
public class Receipt {

    @XmlElement(required = true)
    protected String datetime;
    @XmlElement(name = "receipt-number", required = true)
    protected String receiptNumber;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String value) {
        this.datetime = value;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String value) {
        this.receiptNumber = value;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "datetime=" + datetime +
                ", receiptNumber=" + receiptNumber +
                '}';
    }
}
