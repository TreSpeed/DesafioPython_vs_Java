## 🎯 Desafío de Programación: *El Calculador de Presupuesto para Eventos*

### **Contexto**

Una empresa de eventos necesita una pequeña aplicación para calcular los costes básicos de contratación de catering según el número de asistentes.

### **Instrucciones**

Debes implementar la solución **dos veces** (una en **Python** y otra en **Java 21+ usando Top-Level Statements**) aplicando las buenas prácticas y diferencias sintácticas estudiadas en la lección.

---

### **Requisitos de la Aplicación**

1. **Crear una función/método `calcular_catering` (o `calcularCatering`):**  
* Debe recibir como argumento la cantidad de invitados (*número decimal o entero*).  
* Debe calcular el coste total sabiendo que cada invitado cuesta **25.50 €** e incluye un coste fijo de gestión de **50.00 €**.  
* Debe **retornar** el coste total calculado usando la palabra clave `return`.  
2. **Crear una función/método `pedir_invitados` (o `pedirInvitados`):**  
* Debe mostrar un mensaje por consola solicitando al usuario el número de asistentes.

* Debe **leer la entrada del usuario desde el teclado**.

* Debe convertir y retornar dicho valor como un número válido para realizar cálculos math/flotantes.

3. **Flujo del Programa Principal:**  
* Mostrar un mensaje en consola indicando: `"--- Inicio del cálculo de presupuesto ---"`.

* Solicitar la cantidad de asistentes llamando a la función correspondiente.

* Calcular el presupuesto llamando a la función de catering con el dato introducido por el usuario.

* Imprimir en consola el resultado final formateado: `"El presupuesto total es: [resultado] €"`.

---

### 📋 Checklist de Evaluación para el Alumno

Para dar por superado el desafío, la solución debe demostrar:

- [ ] **Límites de bloque correctos:** Indentación con espacios en Python frente al uso explícito de llaves `{ }` en Java.

- [ ] **Definición de funciones:** Uso de `def` en Python frente a la especificación de tipos de retorno o firmas en Java.

- [ ] **Captura de teclado:** Captura y conversión con `input()` \+ `float()` en Python frente al uso de `Scanner` (`scanner.nextDouble()`) en Java.

- [ ] **Uso de Inferencia de Tipos:** Empleo de `var` en Java Moderno para declarar variables locales dentro del flujo principal o métodos.

- [ ] **Salida por pantalla:** Salida mediante `print()` en Python y `System.out.println()` (aprovechando la interpolación/formateo de cadenas) en Java.