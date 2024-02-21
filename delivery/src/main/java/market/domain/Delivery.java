package market.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import market.DeliveryApplication;
import market.domain.DeliveryRequested;
import lombok.Data;

@Entity
@Table(name = "Delivery_table")
@Data
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderId;
    private String address;
    private Integer status;

    @PostPersist
    public void onPostPersist() {
        DeliveryRequested DeliveryRequested = new DeliveryRequested(this);
        DeliveryRequested.publishAfterCommit();
    }

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }

    public static void addToDeliveryList(OrderPlaced orderPlaced) {
        Delivery delivery = new Delivery();
        
        delivery.setAddress(orderPlaced.getAddress());
        repository().save(delivery);
    }

}
