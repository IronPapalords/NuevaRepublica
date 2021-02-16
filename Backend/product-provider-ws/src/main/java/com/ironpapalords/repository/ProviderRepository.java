package com.ironpapalords.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ironpapalords.model.Provider;

@RepositoryRestResource(collectionResourceRel = "provider", path = "providers")
public interface ProviderRepository extends JpaRepository<Provider, Long> {
  
}
