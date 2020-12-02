package hu.uni.eszterhazy.framework.dao;

import hu.uni.eszterhazy.framework.dao.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {
}
