package com.spring.restaurant.service.serviceimpl;

import com.spring.restaurant.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {

    List<Contact> getContacts();

    Contact saveContact(Contact contact);
}
