package com.example.tes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tes.entity.Karyawan;
import com.example.tes.repository.KaryawanRepository;

@Service
public class ModelKaryawan implements ModelKaryawanInterface {
	
	@Autowired
	KaryawanRepository karyawanRepo;
	
	@Override
	public List<Karyawan> getAllKaryawan() {
		// TODO Auto-generated method stub
		return (List<Karyawan>)this.karyawanRepo.findAll();
	}

	@Override
	public Karyawan getKaryawanByIdKaryawan(String id) {
		// TODO Auto-generated method stub
		return this.karyawanRepo.findById(Long.parseLong(id)).get();
	}

	@Override
	public void deleteKaryawan(String id) {
		// TODO Auto-generated method stub
		this.karyawanRepo.deleteById(Long.parseLong(id));
	}

	@Override
	public Karyawan addKaryawan(Karyawan karyawan) {
		// TODO Auto-generated method stub
		return this.karyawanRepo.save(karyawan);
	}

}
