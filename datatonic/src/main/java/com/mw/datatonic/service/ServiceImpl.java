package com.mw.datatonic.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mw.datatonic.model.DataEntry;
import com.mw.datatonic.repository.DatatonicRepository;

@Service
public class ServiceImpl implements ServiceInt{
	
	@Autowired
	private DatatonicRepository datatonicRepository;

	@Override
	public void saveData(DataEntry dataEntry) {
		
		datatonicRepository.save(dataEntry);
	}
	
	@Override
	public DataEntry getDataEntryUsingId(Long id) {
		return datatonicRepository.findDataEntryById(id); 
	}
	
	@Override
	public ArrayList<DataEntry> getAll() {
		return datatonicRepository.findAll();	}

}
