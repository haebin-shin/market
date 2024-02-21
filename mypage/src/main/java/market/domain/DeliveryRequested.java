package market.domain;

import java.time.LocalDate;
import java.util.*;
import market.infra.AbstractEvent;
import lombok.Data;

@Data
public class DeliveryRequested extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private String status;
}
