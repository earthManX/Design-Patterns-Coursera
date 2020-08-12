
Design Patterns - Coursera
https://www.coursera.org/learn/design-patterns/home

This repository contains code samples describing various design patterns in Java, as taught in the above mentioned course.

The code samples are not those shown in the course videos, but a more of generalised versions of them.

Peer Grade exercises are also included. 

Enjoy.

Theory : 
Design Patterns -

1. Singleton - Only one instance of the class for everything.

Change public constructor to private so that outside instantiation cant take place. 
Create a private instance in the class itself. 
Issue a public method to get this instance.

2. Factory - Instantiation to be handled by Factory objects or Factory class.

3. Facade - Provides a facade (wrapper class ) to the client to interact with the product without having a look at the complexity of underlying subsystem.
Does not add more functionality to the subsystem, acts like an entry.

4. Adapter - To fill the gap between two incompatible interface. Adapter acts as a middleman between the two making necessary conversions so that the two are compatible. Client interacts with a target interface. Adapter class implements that interfacea and converts the client request into compatible format and gives it to the Adaptee. 

5. Composite - This is used while working with a nested class structure. A component superinterface is implemented by all. Implmenting classes can be composite class or leaf class. Composite class can have other composite or leaf classes below it, but leaf class cant. e can think of it as a tree here leaf basically ends the branch, whicle composite can be seen as a node which can keep the branch growing.

6. Proxy - A proxy object( simplified ) is used in place of the original to make things easy. The proxy object can fullfill requirements, if not it delegates request to the original object. Original may be not preffered sue to security issues, or it may be reource intensive. Proxy is wrapper for real subject class, but can implement some functionalities itself. Though both implement a common interface.

7. Decorator - Add behaviours to objects at runtime. uses aggregation where we form a stack of objects, each having some behaviours and knowing about behaviours of the object below it. Aggregation relationship is one-to-one. We have a decorator class which is abstract and has concrete implementations in the form of this stack of objects we talked about.

8. Template Method - Template method defines algorithmic general steps. Specialised steps are catered to subclasses. Assignment of responsibilities.

9.Chain of Responsiblities - A series of handler objects linked together to process a request. If one cannot fulfill the request, it passes it to the next one.  

10. State - Behavious based on current state.

11. Command - Substitutes the direct connection between sender and receiver object using a command object to handle the request. Requests are made into command objects, which are then invoked using a command manager or an invoker. Commands object can be stored and invoked when required. Can add a undo redo functionality using this.
Invoker stores the commands and executes them based on some condition. CM is optional, which can store history and other things. Command objects themselves have execute methods to do specefic executions.

12. Mediator - When there are lot of objects with interactions with each other. A mediator object can be used to talk to everyone. Based on an event it can talk to other objects to make an action or update state. Other objects are called colleagues.

13. Observer - A subject object keeps a list of observers and notifies them when some change happens. Subject maintains a list of observers with functionality to add and remove. When a change is made, subject notifies all the observers to update.

14. MVC - Model handles the business logic and entity classes. View acts as the UI and takes information to the user. Controller acts as the middleman and makes a gateway between model and view. View is an observer of Model. 
Controller has references to both View and Model.

- Open Close Principle : Classes should be open for extension but closed for change. Keep stable parts seperate from varying parts. 
	Open : Inheritance, Abstract class 
	Close : After developement, testing and encapsulation.

- Dependency inversion :  High level modules should depend  on high level generalizaitions and not on low level details.
Interfaces and abstract classes are considered high level resources and concrete classes are low level details. So high level modules - clients should depend on these interfaces and abstract classes.

- Composing objects Princliple : To reduce coupling. Classes should increase code reuse using aggregation rather than inheritance. Use Composite pattern and Decorator pattern. Delegation rather than inheritance. Can dynamically change the behaviours of objects at runtime due to aggregation. Composition has lot of benefits over inheritance. Give it a good thought.

- Interface Segregation Principle : A class should not be forced to depend in methods it does not use. So basically the classes implementing the interface should need all the interface methods, and should not have any dummy methods. This can be done by splitting large interfaces into smaller generalizations. The classes can then implement one or more of these interfaces.

Principle of least knowledge (law of demeter) : A class sohuld know about and interact with as few other classes as possible. We should not access methods of objects that are not local to us( immediate circle of friends ).
This circle consists of instance variables, method parameters and objects instantiated in methods. We should not deal with any other type of object.

- Code Smells
	- No comments
	- Too many comment to describe the bad pattern used
	- Duplicated code
	- Long methods 
	- Large classes
	- Data clumps : groups of data appearing together in instance variables of a class or parameters of methods.
	- Long parameter list
	- Divergent change - Change a class in many places and in many different places.
	- Shotgun surgery - A change in one place requires to fix many areas in the code as a result.
	- Feature envy - Methods in a class are more concerned about other class than their own
	- Inappropriate intimacy - Two classes depend too much on each other through a 2-way communication. Implies a cycle.
	- Message Chains - When we are calling objects far along our circle of friends using method calls. Causes rigidity.
	- Primitive Obsessions - Too much use of built-in types even at high levels
	- Switch statements - Use polymorphism instead
	- Speculative generality - rite some code which doesnt have a use now, but could have a use someday.
	- Refused Bequest - Subclass inherit stuff they dont need.