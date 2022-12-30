/*
package com.example.netcracker.service;

import com.example.netcracker.model.Car;
import com.example.netcracker.model.Specification;
import com.example.netcracker.repository.SpecificationRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Service
public class SpecificationService implements SpecificationRepository {
    private SpecificationRepository specificRepository;
    @Override
    public Integer saveSpecification(Specification specification) {
       */
/*Specification specific=specificRepository.save(specification);
        Integer id=specific.getId();
        return id;*//*

        return specificRepository.save(specification).getId();
    }

    @Override
    public Specification saveAllSpecification(Specification specification) {
        return specificRepository.save(specification);
    }

    @Override
    public List<Specification> getAllSpecifications() {
        return specificRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    @Cacheable(value = "coupon-cache",key="#SpecificId")
    public Specification getOneSpecification(int SpecificId) {
        Optional<Specification> specification= Optional.ofNullable(specificRepository.getOneSpecification(SpecificId));
        if(specification.isPresent()) {
            return specification.get();
        }
        */
/*Throw the Exception Need to Implement*//*

        return null;
    }

    @Override
    @Transactional(readOnly = true)
    @Cacheable(value = "coupon-cache",key="#specificId")
    public void deleteSpecification(int specificId) {
        specificRepository.deleteSpecification(specificId);
    }

    @Override
    public void updateSpecification(Specification specification) {
        specificRepository.updateSpecification(specification);
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Specification> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Specification> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Specification> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Specification getOne(Integer integer) {
        return null;
    }

    @Override
    public Specification getById(Integer integer) {
        return null;
    }

    @Override
    public Specification getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Specification> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Specification> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Specification> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Specification> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Specification> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Specification> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Specification, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Specification> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Specification> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Specification> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Specification> findAll() {
        return null;
    }

    @Override
    public List<Specification> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Specification entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Specification> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Specification> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Specification> findAll(Pageable pageable) {
        return null;
    }
}
*/
