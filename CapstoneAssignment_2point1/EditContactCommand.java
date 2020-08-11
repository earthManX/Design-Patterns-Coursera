package com.example.sharingapp;


public class EditContactCommand extends Command{

    private Contact newContact;
    private Contact oldContact;
    private ContactList contactList;
    private Context context ;

    public DeleteContactCommand( Contact newCon ,
        Contact oldCon,
        ContactList conList,
        Context conx){

        this.newContact = newCon;
        this.oldContact = oldCon;
        this.contactList = conList;
        this.context = conx;

    }

    public void execute(){
        contactList.remove( oldContact );
        contactList.add(newContact);
        setIsExecuted( contactList.saveContacts(context));
    }

}