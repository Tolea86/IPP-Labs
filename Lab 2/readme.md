**Laboratory 2**
*Task*
To implement 3 structural patterns. I have chosen to implement Adapter, Bridge and Decorator.
**Adapter**
This template converts the interface of a class into another interface that the client expects. The adapter allows classes to work together that otherwise could not because of incompatible interfaces.
![alt text]("adapter.JPG")
**Bridge**
The Bridge Pattern has a structure similar to an Adapter object, but it has a whole different purpose: it is intended to separate an interface from its implementation so that the two can be independently modified easily. The purpose of an adapter is to change the interface of an existing object.
The Proxy template defines a representative for another object and does not modify its interface.
It decouples an abstraction of its implementation so that the two can vary independently.
![alt text]("bridge.JPG")
**Decorator**
The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible derivation alternative for expanding functionality.
Decorators have the same type as decorated objects. It is possible to send as a parameter a decorated object in place of the original object.
The decorator uses the legacy to retrieve the type of the decorated object and the composition to change its behavior. One or more decorators can be used for an object. Objects can be dynamically decorated at the time of execution. Decorator can add his or her own behavior before or after delegation. The decorator lets you add new features without modifying the code.
![alt text]("decorator.JPG")

