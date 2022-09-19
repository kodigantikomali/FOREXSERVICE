package com.forexservice.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forexservice.controller.CurrencyConverterController;
import com.forexservice.entity.CurrencyConverterEntity;
import com.forexservice.exception.CurrencyConverterNotFoundException;
import com.forexservice.repository.CurrencyConverterRepo;
@Service
public class CurrencyConverterServiceImpl implements CurrencyConverterService  {
	@Autowired
	CurrencyConverterRepo currencyConverterRepo;
	
	
    @Override
	public CurrencyConverterEntity addCurrencyConverter(CurrencyConverterEntity currencyConverterEntity) {
			
				return currencyConverterRepo.save(currencyConverterEntity);
	}

    
    @Override
	public  CurrencyConverterEntity updateCurrencyConverterEntity(CurrencyConverterEntity currencyConverterEntity,int CurrencyConverterId ) throws CurrencyConverterNotFoundException {
		
		Optional<CurrencyConverterEntity> currentOpt= this.currencyConverterRepo.findById(CurrencyConverterId);
		if(currentOpt.isPresent()) 
		{
			 
			CurrencyConverterEntity cce=currentOpt.get();
			cce.setCurrencyexchangerate(currencyConverterEntity.getCurrencyexchangerate());
			cce.setFromcountry(currencyConverterEntity.getFromcountry());
			cce.setTocountry(currencyConverterEntity.getTocountry());
			return this.currencyConverterRepo.save(cce);	
		}
		else {
			throw new CurrencyConverterNotFoundException("Id not found");
		}
		}
		
	


	@Override
	public boolean deleteCurrencyConverterById(Integer id) {
		currencyConverterRepo.deleteById(id);
		return true;
	}

	
	@Override
	public CurrencyConverterEntity getCurrencyConverterById(Integer id) {
		Optional<CurrencyConverterEntity> c= currencyConverterRepo.findById(id);
		 
		CurrencyConverterEntity cce=currencyConverterRepo.findById(id).get();
	  return cce;
	}


	@Override
	public List<CurrencyConverterEntity> getAllCurrencyConverter() {
		
		return currencyConverterRepo.findAll();
	}



	
	

	

}
