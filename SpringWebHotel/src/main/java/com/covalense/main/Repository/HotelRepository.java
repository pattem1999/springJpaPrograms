package com.covalense.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covalense.main.Model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>
{

}
