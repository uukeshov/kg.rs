package kg.rs.factory;

/**
 * Created by urmat.ukeshov on 20.09.2017.t5
 */
public class AppProperties {

    public static Action action;

    public void alterAction(Integer operationType) {
        for (Action action : Action.values()) {
            if (operationType.equals(AppProperties.action.AUTHORIZE.operationType)) {
                this.action = Action.AUTHORIZE;
                break;
            }

            if (operationType.equals(AppProperties.action.PAYMENT.operationType)) {
                this.action = Action.PAYMENT;
                break;
            }
        }
    }

    public enum Action {
        AUTHORIZE(1),
        PAYMENT(2);

        public final Integer operationType;

        Action(Integer operationType) {
            this.operationType = operationType;
        }
    }
}
