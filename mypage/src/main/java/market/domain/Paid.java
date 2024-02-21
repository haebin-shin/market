package market.domain;

import java.time.LocalDate;
import java.util.*;
import market.infra.AbstractEvent;
import lombok.Data;

@Data
public class Paid extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Double amount;
    private String payMethod;
    private String status;
}
