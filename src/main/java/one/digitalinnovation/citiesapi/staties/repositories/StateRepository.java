package one.digitalinnovation.citiesapi.staties.repositories;

import one.digitalinnovation.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
