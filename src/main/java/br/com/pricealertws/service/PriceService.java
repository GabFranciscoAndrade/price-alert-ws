package br.com.pricealertws.service;

import br.com.pricealertws.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class PriceService {
    private ArrayList<ProductDto> productList = new ArrayList<>();

    public void savePrice(ProductDto product){
        if (product.getDesiredPrice().compareTo(BigDecimal.ZERO) <=0){
            throw new IllegalArgumentException("valor precisa ser maior que zero");
        }
        productList.add(product);
    }

    public List<ProductDto> getProductList(){
        return productList;
    }
}
