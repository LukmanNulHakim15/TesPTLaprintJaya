package com.example.tes.service;

import java.util.List;

import com.example.tes.entity.Cuti;

public interface ModelCutiInterface {
	
	public List<Cuti> getAllCuti();
	
	public Cuti getAllCutiById (String id);
	
	public void deleteCuti (String id);
	
	public Cuti addCuti (Cuti cuti);
	
//	public List<Cuti> getCutiByNomorInduk (String NomorInduk);
//	
//	public void deleteCutiByNomorInduk (String NomorInduk);
	
}
