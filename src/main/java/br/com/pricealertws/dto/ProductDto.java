package br.com.pricealertws.dto;

import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Data
public class ProductDto {
    private String name;
    private BigDecimal desiredPrice;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDesiredPrice() {
        return desiredPrice;
    }

    public void setDesiredPrice(BigDecimal desiredPrice) {
        this.desiredPrice = desiredPrice;
    }
}
