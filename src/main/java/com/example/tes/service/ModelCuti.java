package com.example.tes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tes.entity.Cuti;
import com.example.tes.repository.CutiRepository;

@Service
public class ModelCuti implements ModelCutiInterface {

	@Autowired
	CutiRepository cutiRepo;
	
	@Override
	public List<Cuti> getAllCuti() {
		// TODO Auto-generated method stub
		return (List<Cuti>) this.cutiRepo.findAll();
	}

	@Override
	public Cuti getAllCutiById(String id) {
		// TODO Auto-generated method stub
		return this.cutiRepo.findById(Long.parseLong(id)).get();
	}

	@Override
	public void deleteCuti(String id) {
		// TODO Auto-generated method stub
		this.cutiRepo.deleteById(Long.parseLong(id));
	}

	@Override
	public Cuti addCuti(Cuti cuti) {
		// TODO Auto-generated method stub
		return this.cutiRepo.save(cuti);
	}

//	@Override
//	public void deleteCutiByNomorInduk(String NomorInduk) {
//		// TODO Auto-generated method stub
//		this.cutiRepo.deleteByNomorInduk(NomorInduk);
//	}
//
//	@Override
//	public List<Cuti> getCutiByNomorInduk(String NomorInduk) {
//		// TODO Auto-generated method stub
//		return this.cutiRepo.findByNomorInduk(NomorInduk);
//	}

}
