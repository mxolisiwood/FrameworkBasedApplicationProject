package hu.uni.eszterhazy.framework.controller;

import hu.uni.eszterhazy.framework.model.Address;
import hu.uni.eszterhazy.framework.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping(value = "/address")
@RestController
@RequiredArgsConstructor
public class AddressController {

    private final AddressService service;

    @GetMapping(value = { "/","/all"})
    public Collection<Address> getAll() {
        return service.listAll();
    }


    @GetMapping(value = { "/city/{city}"})
    public Collection<Address> getAll(@PathVariable(name = "city") String city) {
        return service.listAllByCity(city);
    }
}
