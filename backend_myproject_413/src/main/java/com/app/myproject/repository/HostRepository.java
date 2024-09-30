package com.app.myproject.repository;

import com.app.myproject.model.Host;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class HostRepository extends SimpleJpaRepository<Host, String> {
    private final EntityManager em;
    public HostRepository(EntityManager em) {
        super(Host.class, em);
        this.em = em;
    }
    @Override
    public List<Host> findAll() {
        return em.createNativeQuery("Select * from \"myproject\".\"Host\"", Host.class).getResultList();
    }
}