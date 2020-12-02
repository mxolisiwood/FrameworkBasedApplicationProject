package hu.uni.eszterhazy.framework.service;

import hu.uni.eszterhazy.framework.dao.AddressDao;
import hu.uni.eszterhazy.framework.model.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService{

    private final AddressDao addressDao;
    @Override
    public Collection<Address> listAll() {
        return addressDao.readAll();
    }

    @Override
    public Collection<Address> listAllByCity(String city) {
        return addressDao.readAll().stream().filter(address -> address.getCity().equals(city))
                .collect(Collectors.toList());
    }
}
