package com.forexservice.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.forexservice.entity.Transfer;
import com.forexservice.exception.TransferNotFoundException;
import com.forexservice.service.ITransferService;
import com.forexservice.service.ITransferService;


@RestController


public class TransferController {

		
	@Autowired
		private ITransferService itransferService;
	
	@PostMapping("transfer")
	public Transfer addTransfer(@Valid @RequestBody Transfer transfer) {
		return this.itransferService.addTransfer(transfer);

}
	
	
	
	@PutMapping("transfer")
  	public Transfer updateTransfer(@RequestBody Transfer transfer) throws TransferNotFoundException {
  		return this.itransferService.updateTransfer(transfer);
  	}
	
	
	
	  @DeleteMapping("transfer/{transferId}")
      public boolean deleteTransferById(@PathVariable("transferId")Integer transferId) {
	return this.itransferService.deleteTransferById(transferId);
}
	  
	  
	  
	  
	  @GetMapping("transfer/{id}")
		public Transfer gettransferById(@PathVariable("id") Integer transferId ) throws TransferNotFoundException {
			return this.itransferService.getTransferById(transferId);
		}
	  
	  
	  
	
	@GetMapping("transfers")
	public List<Transfer>getAllTransferDetails (){
		return this.itransferService.getAllTransferDetails();
	}


}

	



