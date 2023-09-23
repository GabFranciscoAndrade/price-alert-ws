package br.com.pricealertws.controller;

import br.com.pricealertws.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;

@RestController
@RequestMapping("/price")
public class PriceController {

    private ArrayList<ProductDto> productList = new ArrayList<>();

    @PostMapping
    public ResponseEntity saveDesiredPrice(@RequestBody ProductDto productDto, UriComponentsBuilder uriComponentsBuilder) {
       URI uri = uriComponentsBuilder.path("/price").build().toUri();
        return ResponseEntity.created(uri).body(productDto);
    }
}
