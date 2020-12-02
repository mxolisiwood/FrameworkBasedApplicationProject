package hu.uni.eszterhazy.framework.dao;

import hu.uni.eszterhazy.framework.dao.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<CountryEntity,Integer> {
    Optional<CountryEntity> findByCountry(String country);
}
