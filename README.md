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

## Autor

* **Cesar Nilton Vincenty Funes** - [@cnvincenty](https://github.com/cnvincenty)