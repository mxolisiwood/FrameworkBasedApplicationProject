package hu.uni.eszterhazy.framework.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address", schema = "sakila")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id")
    private int id;

    @Column
    private String address;
    @Column
    private String address2;
    @Column
    private String district;

    @OneToOne
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    private CityEntity city_id;

    @Column(name="postal_code")
    private String postalCode;
    @Column
    private String phone;

    //    Geomerty type; See: https://stackoverflow.com/questions/39147145/spring-data-jpa-and-geometry-type
//    Implement later
    @Column(columnDefinition = "geometry")
    private Point location;

    @Column(name="last_update")
    private Timestamp lastUpdate;



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public CityEntity getCity_id() {
        return city_id;
    }

    public void setCity_id(CityEntity city_id) {
        this.city_id = city_id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
