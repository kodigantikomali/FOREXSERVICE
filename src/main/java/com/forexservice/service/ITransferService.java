package com.forexservice.service;



import java.util.List;

import com.forexservice.entity.Transfer;
import com.forexservice.exception.TransferNotFoundException;
public interface ITransferService {
	public Transfer addTransfer(Transfer transfer);
	public Transfer updateTransfer(Transfer transfer)throws TransferNotFoundException;
	public boolean deleteTransferById(Integer transferId);
	public List<Transfer> getAllTransferDetails();
	Transfer removeTransfer(Integer id) throws TransferNotFoundException;
	Transfer getTransferById(Integer transferId) throws TransferNotFoundException;


}
	
	


