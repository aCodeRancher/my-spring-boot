package guru.springframework.springboot.controller;

import guru.springframework.springboot.ShippingAddress;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingAddressController {

    @GetMapping("/shippingAddress")
    public ShippingAddress getShippingAddress(){
        ShippingAddress shippingAddress = new ShippingAddress();
        shippingAddress.setPostalCode("22201");
        shippingAddress.setCountryName("US");
        shippingAddress.setStreetAddress("100 N Street");
        return shippingAddress;
    }
}
