package com.forexservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import  com.forexservice.entity.Transfer;
import com.forexservice.entity.Transfer;
import com.forexservice.exception.TransferNotFoundException;
import com.forexservice.repository.TransferRepository;




@Service
public class ITransferServiceImpl implements ITransferService {
	
@Autowired
private TransferRepository transferRepo;





@Override
public Transfer addTransfer(Transfer transfer) {
	return this.transferRepo.save(transfer);
	
}

@Override
public Transfer removeTransfer(Integer id) throws TransferNotFoundException{
	
  return null;
}



@Override
public Transfer updateTransfer(Transfer transfer) throws TransferNotFoundException {
	
	
	Optional<Transfer> transferOpt=this.transferRepo.findById(transfer.getTransferId());
	if(transferOpt.isEmpty()) {
		throw new TransferNotFoundException("Transfer id not found");
	}
	Transfer updateTransfer=transferOpt.get();
	updateTransfer.setAccountnumber(transfer.getAccountnumber());
	updateTransfer.setCity(transfer.getCity());
	updateTransfer.setAccounttype(transfer.getAccounttype());
	updateTransfer.setBankname(transfer.getBankname());
	updateTransfer.setUserid(transfer.getUserid());
	return this.transferRepo.save(updateTransfer);
	

}


	
@Override
public boolean deleteTransferById(Integer transferId) {
	this.transferRepo.deleteById(transferId);
	return true;
}



@Override
public Transfer getTransferById(Integer transferId) throws TransferNotFoundException {
	Optional<Transfer> transferOpt= this.transferRepo.findById(transferId);
	if(transferOpt.isEmpty())
		throw new TransferNotFoundException("Id Not Found");
	
	return transferOpt.get();
}


@Override
public List<Transfer> getAllTransferDetails() {
	return this.transferRepo.findAll();
}


}


