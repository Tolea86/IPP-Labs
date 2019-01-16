# Laboratory 3
*Task* <br>
To implement 4 design patterns. <br><br>
**Mediator**<br>
This pattern deals with the interaction between multiple objects, allowing the objects in question not to explicitly refer to each other. This makes it easier to modify how objects interact.<br>
"Mediator" defines the interface for sharing information with "colleagues", it coordinates the action between "colleague" objects. Each "Colleague" class knows about its subject "Mediator," and all "Colleagues" exchange information only with the mediator, but in the absence of the mediator, they should exchange information directly. "Colleagues" can send requests and receive mediator requests from him. "Mediator" implements cooperative behavior by sending a request to one or more "colleagues".<br>
![alt text](https://github.com/Tolea86/IPP-Labs/blob/master/Lab%203/screen/mediator.JPG)<br><br>
**Strategy**<br>
TThe Strategy pattern defines a family of algorithms, encapsulates each algorithm and makes them interchangeable. This template allows the algorithm to vary independently from the clients who use it.<br>
![alt text](https://github.com/Tolea86/IPP-Labs/blob/master/Lab%203/screen/strategy.JPG)<br><br>
**Visitor**<br>
Visitor pattern is an operation that will be performed on elements of a structure of objects, allowing the definition of a new operation without changing the classes of the elements on which it operates.<br>
![alt text](https://github.com/Tolea86/IPP-Labs/blob/master/Lab%203/screen/visitor.JPG)<br><br>
**Command**<br>
The command pattern encapsulates a request as an object, allowing:
• the application to define parameterizable actions that can be executed later without requiring the client to know the internal details required for execution;
• in order not to block the client, these actions are to be defined and sent to execution without being managed by the client;
• the command object encapsulates all the information needed to execute the action later by the responsible person;
• the client is decoupled from who executes the action.<br>
![alt text](https://github.com/Tolea86/IPP-Labs/blob/master/Lab%203/screen/command.JPG)


