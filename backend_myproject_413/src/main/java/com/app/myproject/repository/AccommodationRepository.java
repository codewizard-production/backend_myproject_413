package com.app.myproject.repository;

import com.app.myproject.model.Accommodation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class AccommodationRepository extends SimpleJpaRepository<Accommodation, String> {
    private final EntityManager em;
    public AccommodationRepository(EntityManager em) {
        super(Accommodation.class, em);
        this.em = em;
    }
    @Override
    public List<Accommodation> findAll() {
        return em.createNativeQuery("Select * from \"myproject\".\"Accommodation\"", Accommodation.class).getResultList();
    }
}