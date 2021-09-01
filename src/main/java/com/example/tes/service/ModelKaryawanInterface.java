package com.example.tes.service;

import java.util.List;

import com.example.tes.entity.Karyawan;

public interface ModelKaryawanInterface {
	
	public List<Karyawan> getAllKaryawan();
	
	public Karyawan getKaryawanByIdKaryawan (String id);
	
	public void deleteKaryawan (String id);
	
	public Karyawan addKaryawan (Karyawan karyawan);
}
