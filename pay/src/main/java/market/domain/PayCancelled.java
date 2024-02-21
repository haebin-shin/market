package market.domain;

import java.time.LocalDate;
import java.util.*;
import market.domain.*;
import market.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PayCancelled extends AbstractEvent {

    private Long id;
    private String orderId;
    private Double amount;
    private String payMethod;
    private String status;

    public PayCancelled(Order aggregate) {
        super(aggregate);
    }

    public PayCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
