package com.covalense.main;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.covalense.main.Model.Address;
import com.covalense.main.Model.Hotel;
import com.covalense.main.Service.HotelService;
import com.covalense.main.Service.HotelServiceImp;

@SpringBootApplication
@ComponentScan(basePackages = "com.covalense.main.Repository,com.covalense.main.Service")
public class SpringWebHotelApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringWebHotelApplication.class, args);
	}

	@Autowired
	HotelService hs;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//	hs.StoreAddress();
	/*
	 * new Address("vizag",516431);
	 * 
	 * new Address("tirupati",516431); new Address("kadapa",516431);
	 * 
	 * new Hotel("novotel" ,new Address("vizag",516431));
	 * 
	 * new Hotel("Lakshmi",new Address("tirupati",516431));
	 * 
	 * new Hotel("kalavathi",new Address("kadapa",516431));
	 * 
	 * 
	 * 
	 * hs.addHotel(Arrays.asList(new Hotel("novotel" ,new Address("vizag",516431)),
	 * new Hotel("Lakshmi",new Address("tirupati",516431)), new
	 * Hotel("kalavathi",new Address("kadapa",516431))));
	 */
		Address ad=new Address();
		ad.setCity("vizag");
		ad.setPin(543632);
		
		Address ad2=new Address();
		ad2.setCity("tirupati");
		ad2.setPin(431234);
		
		Hotel h1=new Hotel();
		h1.setHname("novotel");
		h1.setAd(ad2);
		
		Hotel h2=new Hotel();
		h2.setHname("kalavati");
		h2.setAd(ad);
		
		hs.addHotel(Arrays.asList(h1,h2));
		
	}

}
