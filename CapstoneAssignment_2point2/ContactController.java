package CapStone 1.SharingApp.app.src.main.java.com.example.sharingapp;

public class ContactController {
    
    private Contact contact;

    public ContactController( Contact cont){
        this.contact = cont ; 

    }

    public void setId() {
        contact.setId();
    }

    public void updateId(String id){
        contact.updateId( id );
    }

    public String getUsername() {
      return contact.getUsername();
    }

    public void setUsername(String username) {
        contact.setUsername( username);
    }

    public String getEmail() {
        return contact.getEmail();
    }

    public void setEmail(String email) {
        contact.setEmail();
    }

    public void addObserver( Observer observer ){
        contact.addObserver( observer );
    }

    public void removeObserver( Observer observer ){
        contact.removeObserver( observer );
    }
}