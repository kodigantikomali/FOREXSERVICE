package com.forexservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.forexservice.entity.CurrencyConverterEntity;
//import com.forexservice.entity.MoneyTransfer;
import com.forexservice.exception.CurrencyConverterNotFoundException;
//import com.forexservice.exception.MoneyTransferNotFoundException;
import com.forexservice.service.CurrencyConverterService;
//import com.forexservice.service.MoneyTransferService;

@RestController

public class CurrencyConverterController {


	@Autowired
	private CurrencyConverterService currencyconverterservice;
	
	@PostMapping("CurrencyConverter")
	public CurrencyConverterEntity addCurrencyConverter(@Valid @RequestBody CurrencyConverterEntity  CurrencyConverterEntity) throws CurrencyConverterNotFoundException {
		return this.currencyconverterservice.addCurrencyConverter(CurrencyConverterEntity);

}
	
	
	
	
	@PutMapping("CurrencyConverter/{CurrencyConverterId}")
  	public CurrencyConverterEntity updateCurrencyConverterEntity(@RequestBody CurrencyConverterEntity CurrencyConverterEntity,@PathVariable int CurrencyConverterId) 
  			throws CurrencyConverterNotFoundException {
		return this.currencyconverterservice.updateCurrencyConverterEntity(CurrencyConverterEntity,CurrencyConverterId);
		
  	}
	
	
	
	
	
  @DeleteMapping("CurrencyConverter/{currencyConverterId}")
     public String deleteCurrencyConverterById (@PathVariable Integer currencyConverterId) {	
	  this.currencyconverterservice.deleteCurrencyConverterById(currencyConverterId);
	  return "Deleted Id sucessfull";
}
  
  
  
  
	  @GetMapping("CurrencyConverter/{id}")
		public CurrencyConverterEntity getCurrencyConverterId(@PathVariable("id") Integer CurrencyConverterId ){
			return this.currencyconverterservice. getCurrencyConverterById(CurrencyConverterId);
		}
	  
	  
	  
	  
	  
	
	@GetMapping("CurrencyConverter")
	public List<CurrencyConverterEntity>getAllCurrencyConverterDetails (){
		return this.currencyconverterservice.getAllCurrencyConverter();
	}

	
	
	
	
}

	




