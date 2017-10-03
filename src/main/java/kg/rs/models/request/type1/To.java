package kg.rs.models.request.type1;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "serviceId",
        "accountNumber",
        "amount"
})
@XmlRootElement(name = "to")
public class To {

    @XmlElement(name = "service-id", required = true)
    protected Integer serviceId;
    @XmlElement(name = "account-number", required = true)
    protected Long accountNumber;
    @XmlElement(required = true)
    protected Amount amount;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer value) {
        this.serviceId = value;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long value) {
        this.accountNumber = value;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount value) {
        this.amount = value;
    }

    @Override
    public String toString() {
        return "To{" +
                "serviceId=" + serviceId +
                ", accountNumber=" + accountNumber +
                ", amount=" + amount +
                '}';
    }
}
