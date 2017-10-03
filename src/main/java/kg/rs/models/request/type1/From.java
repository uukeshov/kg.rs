package kg.rs.models.request.type1;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "amount"
})
@XmlRootElement(name = "from")
public class From {

    @XmlElement(required = true)
    protected Amount amount;

    public void setAmount(Amount value) {
        this.amount = value;
    }

    @Override
    public String toString() {
        return "From{" +
                "amount=" + amount +
                '}';
    }
}
