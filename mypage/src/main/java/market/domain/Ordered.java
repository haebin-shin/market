package market.domain;

import java.time.LocalDate;
import java.util.*;
import market.infra.AbstractEvent;
import lombok.Data;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String userId;
    private Double amount;
    private String address;
    private String status;
}
