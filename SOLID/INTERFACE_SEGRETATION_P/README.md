# Interface Segregation Principle

## Concept

- Classes have empty method implementations - Interface pollution
- Method implementations throw UnsupportedOperationException (or similar) - Interface pollution
- Method implementation return null or default/dummy values - Interface pollution
- Clients should not be forced to depend on methods that they do not use.
- This principle aims at splitting a set of actions into smaller sets so that a Class executes ONLY the set of actions it requires
- Write highly cohesive Interfaces

## Resources

- https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898
- Java Design Patterns & SOLID Design Principles - Coffee Powered Crew
