package br.com.pricealertws.controller;

import br.com.pricealertws.dto.ProductDto;
import br.com.pricealertws.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/price")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @PostMapping
    public ResponseEntity saveDesiredPrice(@RequestBody ProductDto productDto, UriComponentsBuilder uriComponentsBuilder) {
       priceService.savePrice(productDto);
        URI uri = uriComponentsBuilder.path("/price").build().toUri();
        return ResponseEntity.created(uri).body(productDto);
    }

    @GetMapping
    public List<ProductDto> getProductList(){
        return priceService.getProductList();
    }
}
