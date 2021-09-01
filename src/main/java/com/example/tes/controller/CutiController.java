package com.example.tes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tes.entity.Cuti;
import com.example.tes.service.ModelCuti;

@Controller
public class CutiController {

	@Autowired
	ModelCuti modelCuti;
	
	@GetMapping ("/cuti/view")
	public String viewCuti (Model model) {
		model.addAttribute("listCuti", modelCuti.getAllCuti());
		return "view_cuti";
	}
	
	@GetMapping ("/cuti/add")
	public String viewAdd (Model model) {
		model.addAttribute("cutI", new Cuti());
		return "add_cuti";
	}
	
	@PostMapping ("/cuti/view")
	public String addCuti (@ModelAttribute Cuti cuti, Model model) {
		this.modelCuti.addCuti(cuti);
		model.addAttribute("listCuti", modelCuti.getAllCuti());
		return "view_cuti";
	}
	
	@GetMapping ("/cuti/update/{id}")
	public String updateCuti (@PathVariable String id, Model model) {
		Cuti cuti = modelCuti.getAllCutiById(id);
		model.addAttribute("cutI",cuti);
		return "add_cuti";
	}
	
//	@GetMapping ("/cuti/update/{NomorInduk}")
//	public String updateCutiByNomorInduk (@PathVariable String NomorInduk, Model model) {
//		Cuti cuti = modelCuti.getCutiByNomorInduk(NomorInduk);
//		model.addAttribute("listCuti", modelCuti.getCutiByNomorInduk(NomorInduk));
//		return "add_cuti";
//	}
	
	@GetMapping ("/cuti/delete/{id}")
	public String delete(@PathVariable String id, Model model) {
		this.modelCuti.deleteCuti(id);
		model.addAttribute("listCuti", modelCuti.getAllCuti());
		return "view_cuti";
	}
	
//	@GetMapping ("/cuti/delete/{NomorInduk}")
//	public String deleteByNomorInduk(@PathVariable String NomorInduk, Model model) {
//		this.modelCuti.deleteCutiByNomorInduk(NomorInduk);
//		model.addAttribute("listCuti", modelCuti.getAllCutiByNomorInduk(NomorInduk));
//		return "add_cuti";
//	}
}
