package market.domain;

import java.util.*;
import market.domain.*;
import market.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String userId;
    private Double amount;
    private String address;
    private String status;
}
