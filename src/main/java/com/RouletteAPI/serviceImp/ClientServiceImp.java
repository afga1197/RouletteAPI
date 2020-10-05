package com.RouletteAPI.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RouletteAPI.dao.ClientDao;
import com.RouletteAPI.model.Client;
import com.RouletteAPI.service.ClientService;

@Service
public class ClientServiceImp implements ClientService{

	@Autowired
	private ClientDao clientDao;
	
	@Override
	public boolean saveClient(Client client) {
		return clientDao.saveClient(client);
	}

}
