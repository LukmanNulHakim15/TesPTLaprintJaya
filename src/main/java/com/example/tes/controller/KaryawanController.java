package com.example.tes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tes.entity.Karyawan;
import com.example.tes.service.ModelKaryawan;

@Controller
public class KaryawanController {
	
	@Autowired
	ModelKaryawan modelKar;
	
	
	@GetMapping("/karyawan/view")
	public String viewDataKaryawan(Model model) {
		model.addAttribute("listKaryawan",modelKar.getAllKaryawan());
		return "view_karyawan";
	}
	
	@GetMapping ("/karyawan/add")
	public String viewAddKaryawan(Model model) {
		model.addAttribute("KaryawaN", new Karyawan());
		return "add_karyawan";
	}
	
	@PostMapping ("/karyawan/view")
	public String addAnggota (@ModelAttribute Karyawan karyawan, Model model) {
		this.modelKar.addKaryawan(karyawan);
		model.addAttribute("listKaryawan", modelKar.getAllKaryawan());
		return "view_karyawan";
	}
	
	@GetMapping ("/karyawan/update/{id}")
	public String UpdateKaryawan(@PathVariable String id, Model model) {
		Karyawan karyawan = modelKar.getKaryawanByIdKaryawan(id);
		model.addAttribute("KaryawaN", karyawan);
		return "add_karyawan";
	}
	
	@GetMapping ("/karyawan/delete/{id}")
	public String deleteKaryawan(@PathVariable String id, Model model) {
		this.modelKar.deleteKaryawan(id);
		model.addAttribute("listKaryawn", modelKar.getAllKaryawan());
		return "view_karyawan";
	}

}
