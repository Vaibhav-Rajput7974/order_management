package com.example.hotwax.repositart;

import com.example.hotwax.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface PersonRepository extends JpaRepository<Person, String> {
}