package hu.uni.eszterhazy.framework.service;

import hu.uni.eszterhazy.framework.model.Address;

import java.util.Collection;

public interface AddressService {

    Collection<Address> listAll();

    Collection<Address> listAllByCity(String city);
}
