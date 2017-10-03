package kg.rs.models.response.type1;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "protocolVersion",
        "requestType",
        "terminalId",
        "resultCode",
        "operatorId",
        "extra",
        "statusId",
        "transactionNumber",
        "txnId",
        "to"
})
@XmlRootElement(name = "response")
public class Response {

    @XmlElement(name = "protocol-version", required = true)
    protected Double protocolVersion;
    @XmlElement(name = "request-type", required = true)
    protected Integer requestType;
    @XmlElement(name = "terminal-id", required = true)
    protected Long terminalId;
    @XmlElement(name = "result-code", required = true)
    protected Integer resultCode;
    @XmlElement(name = "operator-id", required = true)
    protected Integer operatorId;
    @XmlElement(required = true)
    protected List<Extra> extra = new ArrayList<Extra>();
    @XmlElement(name = "status-id", required = true)
    protected Integer statusId;
    @XmlElement(name = "transaction-number", required = true)
    protected String transactionNumber;
    @XmlElement(name = "txn-id", required = true)
    protected Long txnId;
    @XmlElement(required = true)
    protected To to;

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

    public Integer getOperatorId() {
        return operatorId;
    }


    public void setOperatorId(Integer value) {
        this.operatorId = value;
    }

    public List<Extra> getExtra() {
        if (extra == null) {
            extra = new ArrayList<Extra>();
        }
        return this.extra;
    }

    public void setExtra(List<Extra> extra) {
        this.extra = extra;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer value) {
        this.statusId = value;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String value) {
        this.transactionNumber = value;
    }

    public Long getTxnId() {
        return txnId;
    }

    public void setTxnId(Long value) {
        this.txnId = value;
    }

    public To getTo() {
        return to;
    }

    public void setTo(To value) {
        this.to = value;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public void addExtra(Extra extra) {
        this.extra.add(extra);
    }

    @Override
    public String toString() {
        return "Response{" +
                "protocolVersion=" + protocolVersion +
                ", requestType=" + requestType +
                ", terminalId=" + terminalId +
                ", resultCode=" + resultCode +
                ", operatorId=" + operatorId +
                ", extra=" + extra +
                ", statusId=" + statusId +
                ", transactionNumber='" + transactionNumber + '\'' +
                ", txnId=" + txnId +
                ", to=" + to +
                '}';
    }
}
