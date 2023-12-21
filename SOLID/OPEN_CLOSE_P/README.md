# Open-Closed Principle (OCP)

## Concept

- Classes should be open for extension but closed for modification
- Behavior of a module (class or function) can be extended without modifying its code (achieved with inheritance or interface implementation)
- Once a class is implemented and working correctly, its code should not be modified to add new functionality. Instead, the system should allow
for new functionality to be added through extension.
- Abstraction, typically achieved through interfaces or abstract classes. By use interface instead of 
concrete implementation, it becomes easier to extend behavior without modifying existing code.
- This principle minimizes the risk of introducing bugs when extending or adding new features.
- This principle is associated with design patterns such as Strategy Pattern, Decorator Pattern, and others that support the idea of extending behavior without modifying code
- This principle is related to Dependency Inversion Principle. Because, by depending on abstraction (e.g. interfaces) rather than concrete implementation, the system is more adaptable to change

## Resources

- https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898
- Java Design Patterns & SOLID Design Principles - Coffee Powered Crew
