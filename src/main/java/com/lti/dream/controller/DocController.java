package com.lti.dream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dream.beans.Document;
import com.lti.dream.beans.Employee;
import com.lti.dream.exception.HrException;
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
	public List<Document> findAll(){
		return docService.getAllDocs();
	}
	
	//http://localhost:8989/documents/updatedoc/{aadharNo}
	@PutMapping("/updatedoc/{aadharNo}")
	public boolean updateDoc(@PathVariable("aadharNo") int aadharNo, @RequestBody Document doc) {
		return docService.updateDoc(aadharNo, doc);
	}
	
	//http://localhost:8989/documents/verification/{aadharNo}
		@PutMapping("/verification/{aadharNo}")
		public boolean verification(@PathVariable("aadharNo") int aadharNo, @RequestBody Document doc) {
			return docService.verification(aadharNo, doc);
		}
}
