# Katas de Codificación para ISP (Principio de Segregación de Interfaces)

## Kata 1: Interfaz Monolítica

**Objetivo:** Crear una interfaz monolítica que viole ISP.

- Crear una interfaz Animal con los métodos fly(), swim() y run().
- Implementar las clases Bird, Fish y Dog utilizando la interfaz Animal.
- Identificar el problema: No todos los animales pueden realizar todas las acciones.
- Refactorizar: Dividir Animal en interfaces más pequeñas (Flyable, Swimmable, Runnable) e implementar solo las relevantes en cada clase.

## Kata 2: Sistema Legacy con Métodos No Utilizados

**Objetivo:** Identificar métodos no utilizados en un sistema legacy.

- Crear una interfaz LegacyPrinter con los métodos print(), scan() y fax().
- Implementar una clase BasicPrinter que solo utilice print().
- Identificar el problema: BasicPrinter se ve obligada a implementar métodos no utilizados.
- Refactorizar: Dividir LegacyPrinter en Printable, Scannable y Faxable.

## Kata 3: Operaciones No Soportadas

**Objetivo:** Manejar operaciones no soportadas.

- Crear una interfaz Vehicle con los métodos drive(), fly() y sail().
- Implementar las clases Car, Plane y Boat. Lanzar UnsupportedOperationException para los métodos no soportados.
- Identificar el problema: Lanzar excepciones viola ISP.
- Refactorizar: Crear interfaces separadas (Drivable, Flyable, Sailable) e implementarlas adecuadamente.

## Autor

* **Cesar Nilton Vincenty Funes** - [@cnvincenty](https://github.com/cnvincenty)