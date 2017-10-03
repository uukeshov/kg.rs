package kg.rs.models.request.type1;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "value"
})
@XmlRootElement(name = "amount")
public class Amount {

    @XmlValue
    protected Double value;
    @XmlAttribute(name = "currency-code", required = true)
    protected Integer currencyCode;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(Integer value) {
        this.currencyCode = value;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "value=" + value +
                ", currencyCode=" + currencyCode +
                '}';
    }
}
