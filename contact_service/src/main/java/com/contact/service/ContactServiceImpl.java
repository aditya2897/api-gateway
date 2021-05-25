package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	
	//fake list of contact
	List<Contact> list=List.of(
			
			new Contact(1L,"Amit@gmail.com","Amit",1311L),
			new Contact(1L,"Akash@gmail.com","Akash",1311L),
			new Contact(1L,"Gyan@gmail.com","Gyan",1312L),
			new Contact(1L,"Subodh@gmail.com","Subodh",1314L)
			);
	@Override
	public List<Contact> getContatOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
