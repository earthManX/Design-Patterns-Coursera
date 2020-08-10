package Creational_and_Structural.Proxy;

import java.util.ArrayList;
import java.util.List;

public class SubjectProxy implements SubjectInterface {

    // This is one implementation where we need to check some parameter from the list of real subject classes 
    private List<RealSubjectClass> list = new ArrayList<>();

    @Override
    public void CommonMethod(String parameter) {
        // This implements some basic logic. It may get information from realSubjectclass
        // If it cant handle the request itself, it'll delegate to RealSubject class.
        if( list.isEmpty()){
            return;
        }
    }


}