package com.example.hotwax.dto;

import com.example.hotwax.entity.OrderPart;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AddOrderDto {
    private String orderId;
    private String partName;
    private String facilityId;
    private String shipmentMethodEnumId;
    private String customerPartyId;
    private List<OrderItem> itemDetails;

    public OrderPart toEntity(AddOrderDto addOrderDto){
    OrderPart orderPart = new OrderPart();
        orderPart.setOrderId(addOrderDto.getOrderId());
        orderPart.setPartName(addOrderDto.getPartName());
        orderPart.setFacilityId(addOrderDto.getFacilityId());
        orderPart.setShipmentMethodEnumId(addOrderDto.getShipmentMethodEnumId());
        orderPart.setCustomerPartyId(addOrderDto.getCustomerPartyId());
        return orderPart;
    }
}
