package kg.rs.manager;

import kg.rs.factory.AppProperties;
import kg.rs.models.response.type1.Extra;
import kg.rs.models.response.type1.Response;
import kg.rs.models.response.type1.To;

import static kg.rs.utils.Utils.getTime;

/**
 * Created by urmat.ukeshov on 20.09.2017.
 */
public class RequestManager<K> {
    private Response response;

    public K getRequestType(Integer operationType) {
        new AppProperties().alterAction(operationType);
        if (operationType.equals(AppProperties.action.AUTHORIZE.operationType)) {
            Response response = new Response();
            To to = new To();
            Extra REMOTE_ADDR = new Extra();
            Extra serial = new Extra();
            Extra BALANCE = new Extra();
            Extra OVERDRAFT = new Extra();
            Extra user_name = new Extra();
            Extra ServerTime = new Extra();

            try {
                response.setProtocolVersion(4d);
                response.setRequestType(1);
                response.setTerminalId(1000l);
                response.setResultCode(0);
                response.setOperatorId(2237);
                response.setStatusId(30);
                response.setTransactionNumber("432432432432432432432");
                response.setTxnId(12345l);

                REMOTE_ADDR.setName("REMOTE_ADDR");
                REMOTE_ADDR.setContent("127.0.0.1");
                response.addExtra(REMOTE_ADDR);

                serial.setName("serial");
                serial.setContent("000000-000000");
                response.addExtra(serial);

                BALANCE.setName("BALANCE");
                serial.setContent("911283.64");
                response.addExtra(BALANCE);

                OVERDRAFT.setName("OVERDRAFT");
                serial.setContent("0");
                response.addExtra(OVERDRAFT);

                user_name.setName("user_name");
                serial.setContent("Hwan Hasan");
                response.addExtra(user_name);

                ServerTime.setName("ServerTime");
                serial.setContent(getTime());
                response.addExtra(ServerTime);

                to.setServiceId(5132);
                to.setAmount(10d);
                to.setAccountNumber(996701232200l);
                response.setTo(to);

            } catch (Exception exception) {
                exception.printStackTrace();
                return null;
            }
            return (K) response;
        }
        return null;
    }
}

