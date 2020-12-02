package hu.uni.eszterhazy.framework.dao;

import hu.uni.eszterhazy.framework.dao.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<CityEntity,Integer> {

    Optional<CityEntity> findByCity(String city);
}
