package BackEnd.Dao;

import BackEnd.Model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityInterf extends JpaRepository<City, Long> {
    City findCityByCountry_Name(String countryName);
}
