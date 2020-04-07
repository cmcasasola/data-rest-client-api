package pe.com.home.datarestclientapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pe.com.home.datarestclientapi.entity.Client;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "clients", path = "clients")
public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {

    Optional<Client> findById(@Param("id") Long id);

    List<Client> findByName(@Param("name") String name);

    List<Client> findByLastname(@Param("name") String name);
}
