package hu.uni.eszterhazy.framework.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "city", schema = "sakila")
public class CityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="city_id")
    private int id;

    @Column
    private String city;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private CountryEntity country;

    @Column(name="last_update")
    private Timestamp lastUpdate;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CountryEntity getCountry_id() {
        return country;
    }

    public void setCountry_id(CountryEntity country_id) {
        this.country = country;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
