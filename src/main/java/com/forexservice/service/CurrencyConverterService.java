package com.forexservice.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.forexservice.controller.CurrencyConverterController;
import com.forexservice.entity.CurrencyConverterEntity;
import com.forexservice.exception.CurrencyConverterNotFoundException;


public interface CurrencyConverterService {

	CurrencyConverterEntity addCurrencyConverter( CurrencyConverterEntity currencyConverterEntity);

	CurrencyConverterEntity updateCurrencyConverterEntity(@Valid CurrencyConverterEntity currencyConverterEntity, int currencyConverterId);

 	public boolean deleteCurrencyConverterById(Integer id);

	CurrencyConverterEntity getCurrencyConverterById(Integer id);

	List<CurrencyConverterEntity> getAllCurrencyConverter();

	
	
}