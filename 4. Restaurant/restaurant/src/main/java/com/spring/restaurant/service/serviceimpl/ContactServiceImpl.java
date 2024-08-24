package com.spring.restaurant.service.serviceimpl;

import com.spring.restaurant.model.Contact;
import com.spring.restaurant.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contact> getContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }
}
