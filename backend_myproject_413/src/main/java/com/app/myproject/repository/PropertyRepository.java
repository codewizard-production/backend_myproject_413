package com.app.myproject.repository;

import com.app.myproject.model.Property;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PropertyRepository extends SimpleJpaRepository<Property, String> {
    private final EntityManager em;
    public PropertyRepository(EntityManager em) {
        super(Property.class, em);
        this.em = em;
    }
    @Override
    public List<Property> findAll() {
        return em.createNativeQuery("Select * from \"myproject\".\"Property\"", Property.class).getResultList();
    }
}