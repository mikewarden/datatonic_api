package com.mw.datatonic.service;

import java.util.ArrayList;

import com.mw.datatonic.model.DataEntry;

public interface ServiceInt {

	void saveData(DataEntry dataEntry);

	DataEntry getDataEntryUsingId(Long id);

	public ArrayList<DataEntry> getAll();
	

}
