package com.example.tes.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.tes.entity.Cuti;

public interface CutiRepository extends CrudRepository <Cuti, Long> {
	
//	List<Cuti> findByNomorInduk (String NomorInduk);
//	
//	public Cuti deleteByNomorInduk (String NomorInduk);

}
