# Design Patterns in Java — LLD Notes

## What are Design Patterns?

Design patterns are reusable solutions to commonly occurring software design problems. They provide proven approaches to designing maintainable, flexible, and extensible software.

Design patterns are generally divided into three categories:

1. **Creational** — How objects are created.
2. **Structural** — How classes and objects are composed.
3. **Behavioral** — How objects communicate and distribute responsibilities.

---

# 1. Creational Design Patterns

Creational patterns deal with object creation and help make a system independent of how objects are instantiated.

| Pattern | Purpose | Real-World Example |
|---|---|---|
| Singleton | Ensure only one instance exists | Application configuration |
| Factory Method | Delegate object creation to subclasses or factory implementations | Creating different notification types |
| Abstract Factory | Create families of related objects | Cross-platform UI components |
| Builder | Construct complex objects step by step | Building an HTTP request |
| Prototype | Create objects by cloning existing instances | Cloning predefined configurations |

### 1. Singleton
- Ensures a class has only one instance and provides a global access point.
- Example: Shared application configuration.
- Java implementation: Enum Singleton or a safely initialized instance.

### 2. Factory Method
- Defines an interface for creating an object while allowing subclasses to determine the concrete type.
- Example: Different notification creators produce Email or SMS notifications.

### 3. Abstract Factory
- Creates families of related objects without specifying their concrete classes.
- Example: Windows UI factory creates Windows-style buttons and checkboxes.

### 4. Builder
- Constructs complex objects step by step.
- Useful when an object has many optional parameters.
- Example: `HttpRequest.newBuilder()`.

### 5. Prototype
- Creates new objects by copying existing objects.
- Useful when object initialization is expensive or predefined configurations need cloning.

---

# 2. Structural Design Patterns

Structural patterns explain how classes and objects can be combined to form larger, flexible structures.

| Pattern | Purpose | Real-World Example |
|---|---|---|
| Adapter | Make incompatible interfaces work together | Integrating a third-party payment API |
| Bridge | Separate abstraction from implementation | Remote control with different devices |
| Composite | Treat individual objects and groups uniformly | File and folder hierarchy |
| Decorator | Add behavior dynamically without changing the original class | Adding toppings to a pizza |
| Facade | Provide a simplified interface to a complex subsystem | One API to start an order workflow |
| Flyweight | Share common state to reduce memory usage | Reusing character formatting data |
| Proxy | Control access to another object | Lazy loading or access control |

### 1. Adapter
- Converts one interface into another interface expected by the client.
- Example: Adapting a legacy payment gateway to a common `PaymentGateway` interface.

### 2. Bridge
- Separates abstraction from implementation so both can evolve independently.
- Example: Different remote controls operating different devices.

### 3. Composite
- Organizes objects into tree structures and treats individual objects and groups uniformly.
- Example: Files and folders.

### 4. Decorator
- Adds responsibilities to an object dynamically through composition.
- Example: Adding milk or extra shots to a coffee order.

### 5. Facade
- Provides a simple interface to a complex subsystem.
- Example: `OrderService.placeOrder()` coordinates inventory, payment, and shipping.

### 6. Flyweight
- Shares reusable intrinsic state across many objects to reduce memory consumption.
- Example: Sharing glyph data across text rendering operations.

### 7. Proxy
- Acts as a substitute or intermediary for another object.
- Example: A proxy that checks authorization before allowing access to a service.

---

# 3. Behavioral Design Patterns

Behavioral patterns focus on communication between objects and how responsibilities are assigned.

| Pattern | Purpose | Real-World Example |
|---|---|---|
| Chain of Responsibility | Pass a request through a sequence of handlers | HTTP middleware |
| Command | Encapsulate a request as an object | Undo/redo operations |
| Interpreter | Define and evaluate a simple language or grammar | Rule expression evaluator |
| Iterator | Traverse a collection without exposing its internal structure | Java `Iterator` |
| Mediator | Centralize communication between objects | Chat room |
| Memento | Capture and restore an object's state | Undo editing |
| Observer | Notify subscribers when state changes | Event listeners |
| State | Change behavior based on an object's current state | Order lifecycle |
| Strategy | Switch between interchangeable algorithms | Payment strategies |
| Template Method | Define algorithm steps while allowing subclasses to customize selected steps | Report generation |
| Visitor | Add operations to object structures without changing their element classes | Operations on an AST |

### 1. Chain of Responsibility
- Passes a request through a chain of handlers until one handles it or the chain ends.
- Example: Authentication, logging, and validation middleware.

### 2. Command
- Encapsulates a request as an object.
- Example: Undoable editor commands or queued tasks.

### 3. Interpreter
- Defines a representation and evaluator for a simple grammar.
- Example: Evaluating expressions such as `price > 100`.

### 4. Iterator
- Traverses a collection without exposing its internal implementation.
- Example: Java's `Iterator` interface.

### 5. Mediator
- Centralizes communication between multiple objects.
- Example: A chat room coordinating messages between users.

### 6. Memento
- Captures an object's state so it can be restored later without exposing internal details.
- Example: Undo functionality in a text editor.

### 7. Observer
- Notifies registered subscribers when an object changes state.
- Example: Event listeners or notification subscribers.

### 8. State
- Changes an object's behavior when its internal state changes.
- Example: An order behaves differently when CREATED, PAID, or SHIPPED.

### 9. Strategy
- Encapsulates interchangeable algorithms behind a common interface.
- Example: Credit card, UPI, or wallet payment strategies.

### 10. Template Method
- Defines the skeleton of an algorithm while allowing subclasses to customize certain steps.
- Example: Different report generators sharing the same processing sequence.

### 11. Visitor
- Adds new operations to a family of object types without modifying those types.
- Example: Performing validation and reporting operations on an abstract syntax tree.

---

# Quick Revision — How to Identify a Pattern

| Problem | Pattern |
|---|---|
| Only one instance is needed | Singleton |
| Object creation logic is complex | Builder |
| Need to select an implementation during creation | Factory Method |
| Need related families of objects | Abstract Factory |
| Interfaces are incompatible | Adapter |
| Need to add behavior dynamically | Decorator |
| Need a simplified interface | Facade |
| Need controlled access to an object | Proxy |
| Need tree structures | Composite |
| Need interchangeable algorithms | Strategy |
| Need notification on state changes | Observer |
| Behavior depends on current state | State |
| Need to process a request through handlers | Chain of Responsibility |
| Need undo/redo | Command + Memento |
| Need to traverse a collection | Iterator |
| Need a common algorithm with customizable steps | Template Method |

## Interview Preparation Tip

For each pattern, prepare these five things:

1. The problem it solves.
2. When to use it and when not to use it.
3. A UML class diagram.
4. A Java implementation.
5. A real-world LLD example and trade-offs.

**Recommended learning order:** Strategy → Factory Method → Observer → Decorator → Adapter → Builder → Singleton → State → Chain of Responsibility → remaining patterns.

