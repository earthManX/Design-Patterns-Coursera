package com.example.sharingapp;

import jdk.internal.vm.annotation.Contended;

public class DeleteContactCommand extends Command{

    private Contact contact;
    private ContactList contactList;
    private Context context ;

    public DeleteContactCommand( Contact con ,
        ContactList conList,
        Context conx){

        this.contact = con ; 
        this.contactList = conList;
        this.context = conx;

    }

    public void execute(){
        contactList.remove( contact );
        setIsExecuted( contactList.saveContacts(context));
    }

}