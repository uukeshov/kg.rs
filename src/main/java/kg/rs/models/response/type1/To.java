package kg.rs.models.response.type1;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "serviceId",
        "amount",
        "accountNumber"
})
@XmlRootElement(name = "to")
public class To {

    @XmlElement(name = "service-id", required = true)
    protected Integer serviceId;
    @XmlElement(required = true)
    protected Double amount;
    @XmlElement(name = "account-number", required = true)
    protected Long accountNumber;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer value) {
        this.serviceId = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long value) {
        this.accountNumber = value;
    }

    @Override
    public String toString() {
        return "To{" +
                "serviceId=" + serviceId +
                ", amount=" + amount +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
