package com.example.netcracker.repository;

import com.example.netcracker.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional(propagation= Propagation.REQUIRED)
public interface CarRepository extends JpaRepository<Car, Integer> {

    public Integer saveCars(Car car);
    public Car saveAllCars(Car car);
    public List<Car> getAllCars();
    public Car getOneCar(int carId);
    public void deleteCar(Integer carId);
    public void update(Car cars);

}
