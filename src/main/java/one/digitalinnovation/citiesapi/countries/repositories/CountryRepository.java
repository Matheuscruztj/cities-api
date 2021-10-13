package one.digitalinnovation.citiesapi.countries.repositories;

import one.digitalinnovation.citiesapi.countries.entities.Country;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {
}
