package CapStone 1.SharingApp.app.src.main.java.com.example.sharingapp;

public class ContactListController {
    
    private ContactList contactList ;
    
    public ContactListController( ContactList cList ){
        this.contactList = cList ; 
    }

    public void setContacts(ArrayList<Contact> contact_list) {
        contactList.setContacts( contact_list);
    }

    public ArrayList<Contact> getContacts() {
        return contactList.getContacts();
    }

    public ArrayList<String> getAllUsernames(){
        return contactList.getAllUsernames();
    }

    public void addContact(Contact contact , Context context ) {
        AddContactCommand addCC = new AddContactCommand( contact , contactList , context);
        addCC.execute();
        return adCC.isExecuted();
    }

    public void deleteContact(Contact contact) {
        DeleteContactCommand deleteCC = new DeleteContactCommand( contact , contactList , context );
        deleteCC.execute();
        return deleteCC.isExecuted();
    }

    public boolean editContact( Contact item, Contact updated_item, Context context){
        EditContactCommand edit_item_command = new EditContactCommand(item_list, item, updated_item, context);
        edit_item_command.execute();
        return edit_item_command.isExecuted();
    }

    public Contact getContact(int index) {
        return contactList.getContact(index);
    }

    public int getSize() {
        return contactList.getSize();
    }

    public Contact getContactByUsername(String username){
        return contactList.getContactByUsername(username);
    }

    public boolean hasContact(Contact contact) {
        return contactList.hasContact(contact);
    }

    public int getIndex(Contact contact) {
        return contactList.getIndex( contact );
    }

    public boolean isUsernameAvailable(String username){
        return contactList.isUsernameAvailable( username );
    }

    public void loadContacts(Context context) {
        contactList.loadContacts( context );
    }

    public void saveContacts( Context context ){
        contactList.saveContacts( context );
    }

    public void addObservers( Observer obs ){
        contactList.addObservers( obs );
    }

    public void removeObservers( Observer obs ){
        contactList.removeObservers( obs );
    }
}