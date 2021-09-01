package com.example.tes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name="karyawan")
public class Karyawan {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long idKaryawan;
	private String NomorIndukKaryawan;
	private String Nama;
	private String Alamat;
	private String TanggalLahir;
	private String TanggalBergabung;
	
}
