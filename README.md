# Katas de Codificación para ISP (Principio de Segregación de Interfaces)

## Autor

* **Cesar Nilton Vincenty Funes** - [@cnvincenty](https://github.com/cnvincenty)

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

## Kata 4: Gestión de Sensores en un Sistema de Monitoreo

**Objetivo:** Diseñar interfaces específicas para diferentes tipos de sensores.

- Crear una interfaz Sensor con los métodos readTemperature(), readPressure() y readHumidity().
- Implementar las clases TemperatureSensor, PressureSensor y HumiditySensor.
- Identificar el problema: Cada sensor implementa métodos que no necesita.
- Refactorizar: Dividir Sensor en interfaces más pequeñas (TemperatureReadable, PressureReadable, HumidityReadable) e implementar solo las relevantes en cada clase.

## Kata 5: Interfaz de Dispositivo IoT

**Objetivo:** Diseñar interfaces para capacidades específicas de dispositivos.

- Crear una interfaz SmartDevice con los métodos turnOn(), turnOff(), connectToWiFi() y playMusic().
- Implementar las clases SmartLight y SmartSpeaker.
- Identificar el problema: SmartLight no necesita playMusic().
- Refactorizar: Crear interfaces más pequeñas (PowerControllable, WiFiConnectable, MusicPlayable) e implementarlas selectivamente.

## Kata 6: Sistema de Pago en E-Commerce

**Objetivo:** Evitar que las clases implementen métodos irrelevantes.

- Crear una interfaz PaymentProcessor con los métodos processCreditCard(), processPayPal() y processCrypto().
- Implementar las clases CreditCardProcessor, PayPalProcessor y CryptoProcessor.
- Identificar el problema: Cada clase implementa métodos que no utiliza.
- Refactorizar: Dividir PaymentProcessor en CreditCardPayment, PayPalPayment y CryptoPayment.


## Pasos a seguir para la resolución de cada Kata

- Comprender el Problema: - Leer la descripción de la kata. - Identificar la interfaz monolítica o sobrecargada.
- Implementar el Código: - Crear la interfaz y sus implementaciones como se describe. - Observar las violaciones de ISP (por ejemplo, métodos no utilizados, excepciones).
- Identificar la Necesidad de ISP: - Analizar por qué el diseño actual es problemático. - Discutir cómo las interfaces más pequeñas y específicas pueden resolver el problema.
- Refactorizar el Código: - Dividir la interfaz monolítica en interfaces más pequeñas y cohesivas. - Actualizar las implementaciones para usar solo las interfaces relevantes.
- Probar el Código Refactorizado: - Asegurarse de que el código refactorizado funcione como se espera. - Verificar que ninguna clase dependa de métodos que no utiliza.

## Resultados Esperados

- Comprender la importancia de las interfaces cohesivas.
- Aprender a identificar y refactorizar violaciones de ISP.
- Escribir código más limpio y mantenible siguiendo ISP.
