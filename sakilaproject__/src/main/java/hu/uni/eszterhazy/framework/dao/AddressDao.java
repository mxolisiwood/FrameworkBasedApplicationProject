package hu.uni.eszterhazy.framework.dao;

import hu.uni.eszterhazy.framework.model.Address;

import java.util.Collection;

/**
 * DAO = Data Acess Object
 * - Create
 * - Read
 * - Update
 * - Delete
 */

public interface AddressDao {

    void createAddress(Address address);
    Collection<Address> readAll();
}
