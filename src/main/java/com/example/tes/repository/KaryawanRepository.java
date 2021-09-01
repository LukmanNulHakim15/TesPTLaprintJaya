package com.example.tes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tes.entity.Karyawan;

public interface KaryawanRepository extends JpaRepository <Karyawan, Long> {
	
//	public List<Karyawan> getKaryawanByNomorInduk (String NomorInduk);
//	
//	public Karyawan deleteKaryawanByNomorInduk (String NomorInduk);
}
