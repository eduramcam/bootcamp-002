# Casos de prueba: cálculo de descuentos

Clase: `DiscountCalculator`  
Pruebas: `DiscountCalculatorTest`  
Comando: `mvn test`

1. **Descuento por porcentaje:** para un producto de 200.0 con un descuento del 15 %, el descuento debe ser 30.0.

2. **Descuento del 100 %:** para un producto de 200.0 con un descuento del 100 %, el descuento debe ser 200.0.

3. **Porcentaje mayor al 100 %:** para un producto de 200.0 con un descuento del 150 %, el descuento debe limitarse a 200.0.

4. **Porcentaje igual a cero:** para un producto de 200.0 con un descuento del 0 %, el descuento debe ser 0.0.

5. **Porcentaje negativo:** para un producto de 200.0 con un porcentaje de -10.0, el descuento debe ser 0.0.

6. **Precio igual a cero con descuento porcentual:** para un producto de 0.0 con un descuento del 20 %, el descuento debe ser 0.0.

7. **Precio negativo con descuento porcentual:** para un producto de -200.0 con un descuento del 20 %, el descuento debe ser 0.0.

8. **Descuento directo:** para un producto de 200.0 con un descuento directo de 45.0, el descuento debe ser 45.0.

9. **Descuento directo igual al precio:** para un producto de 200.0 con un descuento de 200.0, el descuento debe ser 200.0.

10. **Descuento directo mayor al precio:** para un producto de 200.0 con un descuento de 250.0, el descuento debe limitarse a 200.0.

11. **Descuento directo igual a cero:** para un producto de 200.0 con un descuento de 0.0, el resultado debe ser 0.0.

12. **Descuento directo negativo:** para un producto de 200.0 con un descuento de -45.0, el resultado debe ser 0.0.

13. **Precio igual a cero con descuento directo:** para un producto de 0.0 con un descuento de 45.0, el resultado debe ser 0.0.

14. **Precio negativo con descuento directo:** para un producto de -200.0 con un descuento de 45.0, el resultado debe ser 0.0.

Resultado: se ejecutaron los 10 métodos de prueba y se comprobaron estos 14 escenarios. Todas las pruebas terminaron correctamente, sin fallos ni errores.
