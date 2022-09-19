package com.forexservice.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.forexservice.entity.CurrencyConverterEntity;


	@Repository
	public interface CurrencyConverterRepo extends JpaRepository<CurrencyConverterEntity,Integer>{

	}



