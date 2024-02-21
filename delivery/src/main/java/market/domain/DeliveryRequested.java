package market.domain;

import java.time.LocalDate;
import java.util.*;
import market.domain.*;
import market.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryRequested extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private String userId;
    private Integer status;

    public DeliveryRequested(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryRequested() {
        super();
    }
}
//>>> DDD / Domain Event
