#Laboratory 1#
*Task* <br>
To implement 3 creational patterns. I have chosen to implement Abstract Factory, Builder and Factory Method. <br><br>
**Abstract Factory** <br>
Abstract Factory provides a level of abstraction in the creation of groups of related or dependent objects without directly specifying their particular classes. The "factory" object has the responsibility to provide services to create a whole family of platforms. Customers will never create platforms directly, but will call the "factory" to do this. <br>
This mechanism makes changing product families more simple because the factory-grade class occurs once in the application when instantiated. The application can replace the entire family of products by simply instantiating another concrete class of the abstract factory type.
The Abstract Factory Pattern will define a Product Factory method. Each such method will encapsulate the new operator as well as the concrete implementation of the product. Each "platform" is then modeled using a derived Factory class. <br>
![alt text]("https://github.com/Tolea86/IPP-Labs/blob/master/Lab%201/screen/AbstractFactory.JPG") <br><br>
**Factory Method** <br>
The Factory Method patterns defines an interface to create an object, but allows subclasses to decide what class will instantiate them. Also, this template allows a class to delegate instance to other subclasses. <br>
Development frameworks use abstract classes to define and maintain relationships between objects. Often, a development framework is also responsible for creating these objects. <br>
The Factory Method template encapsulates the Document subclass that will be created and removes this knowledge from the development framework. The Application subclass redefines the CreateDocument abstract operation of the Application class so that it returns the correct Document subclass. <br>
![alt text]("https://github.com/Tolea86/IPP-Labs/blob/master/Lab%201/screen/FactoryMethod.JPG") <br>
**Builder Method** <br><br>
Builder pattern determines an algorithm that separates the design phase of the complex product (object) of its external representation so that the same algorithm can obtain different product views. For this, the Builder template creates an algorithm for the gradual creation of a product in a special class of manager (manager) and responsible for coordinating the assembly process of the individual parts of the product impose the Builder class hierarchy. In this hierarchy, in the Builder template, the base class announces interfaces for building the parts of the product and the relevant subclasses ConcreteBuilder implements them appropriately, for example, to create or obtain the resources needed to maintain the intermediate results, to monitor the results operations. <br>
![alt text]("https://github.com/Tolea86/IPP-Labs/blob/master/Lab%201/screen/Builder.JPG") 

