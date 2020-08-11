package com.example.sharingapp;


public class AddContactCommand{

    private Contact contact ; 
    private ContactList contactList;
    private Context context;

    public AddContactCommand( Contact con , 
    ContactList conList ,
    Context conx){
        this.contact = con;
        this.contactList = conList;
        this.context = conx;
    }

    public void execute(){
        contactList.add(contact);
        setIsExecuted( contactList.saveContacts(context));
    }
}