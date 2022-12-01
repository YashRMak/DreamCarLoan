package com.lti.dream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.lti.dream.beans.Document;
import com.lti.dream.beans.User;
import com.lti.dream.service.DocServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/document")
public class DocController {
	@Autowired
	DocServiceImpl docService;
	
	//http://localhost:8989/document/adddoc
	@PostMapping("/adddoc")
	public int addDoc(@RequestBody Document doc) {
		return docService.addDoc(doc);
	}
	
	//http://localhost:8989/document/finddoc/{aadharNo}
	@GetMapping("/finddoc/{aadharNo}") 
	public Document findDocByNo(@PathVariable("aadharNo") int aadharNo) {
		return docService.findDocByNo(aadharNo);
	}
	
	//http://localhost:8989/document/alldocs
	@GetMapping("/alldocs")
	public List<Document> getAllDocs(){
		return docService.getAllDocs();
	}
	
	//http://localhost:8989/document/updatepanno/{aadharNo}
	@PutMapping("/updatepanno/{aadharNo}")
	public boolean updatePAN(@PathVariable("aadharNo") int aadharNo, @RequestBody Document doc) {
		return docService.updatePAN(aadharNo, doc);
	}
	
	//http://localhost:8989/document/verification/{aadharNo}
	@PutMapping("/verification/{aadharNo}")
	public boolean updateVerification(@PathVariable("aadharNo") int aadharNo, @RequestBody Document doc) {
		return docService.updateVerification(aadharNo, doc);
	}
	
	//http://localhost:8989/document/deletedoc/{aNo}
	@DeleteMapping("/deletedoc/{aNo}")
	public Document deleteDoc(@PathVariable("aNo") int aNo) {
	    return docService.deleteDoc(aNo);
	}
}
