package kg.rs.models.request.type1;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}protocol-version"/>
 *         &lt;element ref="{}request-type"/>
 *         &lt;element ref="{}terminal-id"/>
 *         &lt;element ref="{}extra" maxOccurs="unbounded"/>
 *         &lt;element ref="{}transaction-number"/>
 *         &lt;element ref="{}from"/>
 *         &lt;element ref="{}to"/>
 *         &lt;element ref="{}receipt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "protocolVersion",
        "requestType",
        "terminalId",
        "extra",
        "transactionNumber",
        "from",
        "to",
        "receipt"
})
@XmlRootElement(name = "request")
public class Request {

    @XmlElement(name = "protocol-version", required = true)
    protected Double protocolVersion;
    @XmlElement(name = "request-type", required = true)
    protected Integer requestType;
    @XmlElement(name = "terminal-id", required = true)
    protected Long terminalId;
    @XmlElement(required = true)
    protected List<Extra> extra = new ArrayList<Extra>();
    @XmlElement(name = "transaction-number", required = true)
    protected String transactionNumber;
    @XmlElement(required = true)
    protected From from;
    @XmlElement(required = true)
    protected To to;
    @XmlElement(required = true)
    protected Receipt receipt;

    public Double getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(Double value) {
        this.protocolVersion = value;
    }

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer value) {
        this.requestType = value;
    }

    public Long getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Long value) {
        this.terminalId = value;
    }

    public List<Extra> getExtra() {
        if (extra == null) {
            extra = new ArrayList<Extra>();
        }
        return this.extra;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String value) {
        this.transactionNumber = value;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From value) {
        this.from = value;
    }

    public To getTo() {
        return to;
    }

    public void setTo(To value) {
        this.to = value;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt value) {
        this.receipt = value;
    }

    public void addExtra(Extra extra) {
        this.extra.add(extra);
    }

    @Override
    public String toString() {
        return "Request{" +
                "protocolVersion=" + protocolVersion +
                ", requestType=" + requestType +
                ", terminalId=" + terminalId +
                ", extra=" + extra +
                ", transactionNumber=" + transactionNumber +
                ", from=" + from +
                ", to=" + to +
                ", receipt=" + receipt +
                '}';
    }
}
