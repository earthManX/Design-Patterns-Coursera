package com.example.sharingapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Editing a pre-existing contact consists of deleting the old contact and adding a new contact with the old
 * contact's id.
 * Note: You will not be able contacts which are "active" borrowers
 */
public class EditContactActivity extends AppCompatActivity {

    private ContactList contact_list = new ContactList();
    private ContactListController contact_list_controller = new ContactListController();
    private Contact contact;
    private ContactController contact_controller ; 
    private EditText email;
    private EditText username;
    private Context context;

    private String username_str;
    privaet String email_str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact);

        context = getApplicationContext();
        contact_list_controller.loadContacts(context);

        Intent intent = getIntent();
        int pos = intent.getIntExtra("position", 0);

        contact = contact_list_controller.getContact(pos);
        contact_controller = new ContactController( contact );

        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);

        username.setText(contact_controller.getUsername());
        email.setText(contact_controller.getEmail());
    }

    public void saveContact(View view) {

        email_str = email.getText().toString();
        username_str = username.getText().toString();
        String id = contact_controller.getId(); // Reuse the contact id

        if( !validateInput()){
            return ;
        }

        Contact updated_contact = new Contact(username_str, email_str, id);
        ContactController updated_contact_controller = new ContactController( updated_contact );

        if( !contact_list_controller.editContact( contact , updated_contact , context ){
            return;
        }
        // End EditContactActivity
        finish();
    }

    public void deleteContact(View view) {

        if( contact_list_controller.deleteContact( contact , updated_contact , context )){
            return;
        }

        // End EditContactActivity
        finish();
    }

    private boolean validateInput(){
        if (email_str.equals("")) {
            email.setError("Empty field!");
            return false ;
        }

        if (!email_str.contains("@")){
            email.setError("Must be an email address!");
            return false ;
        }
        // Check that username is unique AND username is changed (Note: if username was not changed
        // then this should be fine, because it was already unique.)
        if (!contact_list_controller.isUsernameAvailable(username_str) && !(contact_controller.getUsername().equals(username_str))) {
            username.setError("Username already taken!");
            return false ;
        }
        return true;
    }
}
