package io.github.atomfrede.jhipster.togglz.example.repository;

import io.github.atomfrede.jhipster.togglz.example.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
