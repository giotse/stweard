package com.giotse.stweard.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.giotse.stweard.model.Person;

@RestController
@RequestMapping(path = "/persons")
public class PersonController {
	
	@GetMapping
	public List<Person> getAll() {
		return new ArrayList<Person>();
	}
	
	@PostMapping
	public Long create(@RequestBody Person person) {
		return new Long(1);
	}
	
	@GetMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Person getById(@PathVariable("id") Long id) {
		return new Person();
	}
	
	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") long id, @RequestBody Person person) {
		// TODO update
	}
	
	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") Long id) {
		//TODO: delete
	}
	
}
