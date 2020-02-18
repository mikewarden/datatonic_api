package com.mw.datatonic.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mw.datatonic.model.DataEntry;
import com.mw.datatonic.service.ServiceImpl;

@RestController
public class MainController {
	
	@Autowired
	private ServiceImpl serviceImpl;
	
	@PostMapping("/data_entries")
	public void saveData(DataEntry dataEntry) {
		serviceImpl.saveData(dataEntry);
	}
	
	@GetMapping("/data_entry{id}")
	public DataEntry getDataEntry(@PathVariable Long id) {
		return serviceImpl.getDataEntryUsingId(id);
	}
	
	@GetMapping("/data_entries")
	public ArrayList<DataEntry> getAllDataEntries() {
		return serviceImpl.getAll();
	}

}
