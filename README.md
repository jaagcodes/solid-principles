SOLID PRINCIPLES

The objectives of this basic Java project is to show
the implementation of uncle Bob SOLID principles, and
also explain the meaning of each letter that stands
for SOLID.

English:
- Single Responsability
  Each class should have only one sole purpose,
  and not be filled with excessive functionality.

- Open Closed
  Classes should be open for extension,
  closed for modification.
  In other words, you should not have to rewrite
  an existing class for implementing new features.

- Liskov Substitution
  This means that every subclass or
  derived class should be substitutable for their
  base or parent class.

- Interface Segregation
  interface should not force classes to implement
  what they can´t do.
  Large interface should be divided into small ones.

- Dependency Inversion
  Components should depend on abstractions, 
  not on concretions.

Español:
- Única responsabilidad
  Se debe procurar que cada clase tenga una única responsabilidad
  y no debe contener demasiadas funcionalidades

- Abierto - Cerrado
  Las clases deben estar abiertas a extender pero no a ser
  modificadas. 
  En otras palabras, no deberíamos reescribir una clase
  para poder agregar nuevas funcionalidadas.

- Sustitución por Liskov
  Las clases hijas o derivadas deben poder ser reemplzadas
  por su clase padre o base, sin afectar el comportamiento
  y siendo compatibles.

- Segregacion de Interfaces
  Las clases no se deben ver obligadas a implementar 
  funcionalidades de una interfaz que no son útiles
  para ellas.
  Por ello se recomienda que las interfaces no
  deben tener demasiadas firmas de métodos

- Inversión de Dependencias
  Los componentes deben depende de una abstracción y
  no de una concreción(clase concreta).
  Esto sirve para desacoplar el código y brindar mayor
  flexibilidad.
