package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Created by alin- on 18.08.2017.
 */
@RestController
@RequestMapping(value ="/hello/contacts")
public class ContactController {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    ContactsRepo repo;
    private ArrayList<Contact> contacts;
    private ArrayList<Contact> contactsToDB;
    @SuppressWarnings("unchecked")
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<Contact> getByPattern (@RequestParam("nameFilter") final  String name ){
        addDataToDB();
       contacts = (ArrayList<Contact>) repo.findAll();
       Pattern pattern = Pattern.compile(name);
        ArrayList<Contact> result = new ArrayList<>();
        for(Contact c: contacts){
            Matcher m = pattern.matcher(c.getName());
            if(!m.matches() | Objects.equals(name, "")) result.add(c);
        }
        return result;
    }

    //put values to database
    private void addDataToDB(){
        contactsToDB = new ArrayList<>();
        contactsToDB.add(new Contact("Alina"));
        contactsToDB.add(new Contact("Grace"));
        contactsToDB.add(new Contact("Ludmila"));
        contactsToDB.add(new Contact("Pavel"));
        contactsToDB.add(new Contact("Larisa"));
        contactsToDB.add(new Contact("Inessa"));
        contactsToDB.add(new Contact("Max"));
        contactsToDB.add(new Contact("Andrew"));
        contactsToDB.add(new Contact("Jack"));
        contactsToDB.add(new Contact("Maria"));
        repo.save(contactsToDB);
    }
}
