package com.example.netcracker.service;

import com.example.netcracker.model.Car;
import com.example.netcracker.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
@Transactional(readOnly = true)
public class CarService implements CarRepository {

    private CarRepository carRepository;
    @Override
    public Integer saveCars(Car car) {
        /*Car e1=carRepository.save(car);
        Integer id=e1.getId();
        return id;*/
        return carRepository.save(car).getId();
    }

    @Override
    public Car saveAllCars(Car car) {
        return carRepository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return  carRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    @Cacheable(value = "coupon-cache",key="#carId")
    public Car getOneCar(int carId) {
        Optional<Car> car= Optional.ofNullable(carRepository.getOneCar(carId));
        if(car.isPresent()) {
            return car.get();
        }
        /*Throw the Exception Need to Implement*/
        return null;
    }

    @Override
    public void deleteCar(Integer carId) {
        carRepository.deleteById(carId);

    }

    @Override
    public void update(Car cars) {
        carRepository.update(cars);
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Car> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Car> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Car> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Car getOne(Integer integer) {
        return null;
    }

    @Override
    public Car getById(Integer integer) {
        return null;
    }

    @Override
    public Car getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Car> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Car> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Car> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Car> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Car> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Car> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Car, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Car> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Car> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Car> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Car> findAll() {
        return null;
    }

    @Override
    public List<Car> findAllById(Iterable<Integer> integers) {
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
    public void delete(Car entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Car> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Car> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Car> findAll(Pageable pageable) {
        return null;
    }
}
