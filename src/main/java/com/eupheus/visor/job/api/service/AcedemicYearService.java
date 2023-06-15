package com.eupheus.visor.job.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.eupheus.visor.job.api.repository.AcademicYearRepository;



public class AcedemicYearService {
	@Autowired(required=true)
	private  AcademicYearRepository academicYearRepository;
	
	public Optional<AcademicYear> findById(Long id) {
		return academicYearRepository.findById(id);
	}

}
