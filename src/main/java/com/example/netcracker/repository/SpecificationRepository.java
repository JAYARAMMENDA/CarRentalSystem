
package com.example.netcracker.repository;


import com.example.netcracker.model.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional(propagation= Propagation.REQUIRED)
public interface SpecificationRepository extends JpaRepository<Specification, Integer> {
    public Integer saveSpecification(Specification specification);
    public Specification saveAllSpecification(Specification specification);
    public List<Specification> getAllSpecifications();
    public Specification getOneSpecification(int SpecificId);
    public void deleteSpecification(int SpecificId);
    public void updateSpecification(Specification specification);
}

