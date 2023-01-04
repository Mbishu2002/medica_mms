/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.medic_ms.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.medic_ms.entities.Result;
import java.util.Optional;

/**
 *
 * @author PC
 */
@Repository("resultsRepository")
public interface resultsRepository extends CrudRepository<Result, Integer> {
    public Iterable<Result> addRes(Result data);
    @Override
    public Iterable<Result> findAll();
    public Optional<Result> findById(int id);
}
