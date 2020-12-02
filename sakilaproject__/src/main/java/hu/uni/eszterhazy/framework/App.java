package hu.uni.eszterhazy.framework;

import hu.uni.eszterhazy.framework.dao.AddressDao;
import hu.uni.eszterhazy.framework.dao.AddressRepository;
import hu.uni.eszterhazy.framework.dao.CountryRepository;
import hu.uni.eszterhazy.framework.dao.entity.CountryEntity;
import hu.uni.eszterhazy.framework.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.Timestamp;
import java.util.Date;
import java.util.stream.StreamSupport;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{


    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Hello World");
//        AddressDao dao = context.getBean(AddressDao.class);
      //  dao.readAll().forEach(System.out::println);
       // context.getBean(AddressRepository.class).findAll().stream().forEach(System.out::println);
//        dao.createAddress(new Address(
//                "Leanyka ut 4",
//                "C ep.",
//                " Almagyar",
//                "Eger",
//                "Hungary",
//                "3300",
//                "1234567890"));

     //   CountryRepository countryRepository = context.getBean(CountryRepository.class);
     //   System.out.println(countryRepository.findByCountry("Hungary"));
      //  countryRepository.save(new CountryEntity(0,"asdf_new_country", new Timestamp((new Date()).getTime())));

    }

