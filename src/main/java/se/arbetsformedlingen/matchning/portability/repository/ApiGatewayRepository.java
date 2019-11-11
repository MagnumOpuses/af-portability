package se.arbetsformedlingen.matchning.portability.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import se.arbetsformedlingen.matchning.portability.model.ApiKeys;

import java.util.List;

@RepositoryRestResource
public interface ApiGatewayRepository extends JpaRepository<ApiKeys, Integer> {
    @Query(value = "select id, apikey, api_id, email from apikeys where apikey = :apikey", nativeQuery = true)
    public ApiKeys getAllApiKeys(String apikey);
}
