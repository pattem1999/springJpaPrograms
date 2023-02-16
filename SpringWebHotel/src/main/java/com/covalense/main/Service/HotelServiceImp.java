package com.covalense.main.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covalense.main.Model.Address;
import com.covalense.main.Model.Hotel;
import com.covalense.main.Repository.HotelRepository;

import lombok.Setter;
@Service
public class HotelServiceImp implements HotelService{

	@Autowired
	@Setter
	HotelRepository hr;

	@Override
	public void addHotel(List<Hotel> hotel) {
		// TODO Auto-generated method stub
		hr.saveAll(hotel);
	}
	
	/*
	 * public static List<Hotel> getHotel() {
	 * 
	 * return Arrays.asList(new Hotel("novotel"),new Hotel("novotel")); }
	 * 
	 * public static List<Address> getAddress() { return Arrays.asList(new
	 * Address("vizag",543612), new Address("tirupati",543123)); }
	 */
}
