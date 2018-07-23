package Polymorphism;
/*
* Inheritance: Father - Son Relationship
* Polymorphism: Child can be Daughter/Son/ Ability of Object to have multiple forms
* Method Overriding: One of the most popular forms of Polymorphism
* Interfaces make Multiple Inheritance possible: Class A implements C, D, E
* Abstract methods have no implementation, all interface methods are abstract
* Constructor: Method that is called when an object is created.
* Restrict to Parent by Using Final or Private Keyword
*/
public abstract class Connection {
    protected String data;

    public void connect(){
        System.out.println("Connecting .....");
    }

    public void inputDate(String data){
        this.data = data;
    }

}
