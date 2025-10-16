# Responda las siguientes consignas:
### 1. Documente el código con un diagrama de clases UML
### 2. Escriba las reglas que hacen que un alumno esté en condiciones de recibir una beca, implementadas por el método fitForScolarship().
El alumno está en condiciones de recibir una beca cuando tiene aprobadas más de la mitad de las materias cursadas (nota ≥ 4) y posee más del 66 % de finales aprobados (nota ≥ 6 entre las materias cursadas).
### 3. Desde el código original se implementaron algunas transformaciones:
#### a. Evalúe (analizando el código) si estos cambios pueden ser refactorings o no
#### b. Compile el código del proyecto original y del refactorizado que se encuentra en el Moodle de la OO2_2025 y compare los resultados de correr el programa StudentCmd (original y refactorizado).

| Cambio                                                                                                                                                 | Descripción                                                                      | ¿Refactoring? | Justificación                                                                                               |
| :----------------------------------------------------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------- | :------------ | :---------------------------------------------------------------------------------------------------------- |
| Reemplazar `this.finalsOverTaken() > 0.66` por `this.finalsOverTaken() > fitRatio()` y agregar `float fitRatio() { return 2/3; }`                      | Se reemplaza una constante “hardcodeada” por un método con nombre significativo. | ✅ **Sí**      | Mejora la legibilidad y elimina un valor mágico; el comportamiento sigue siendo el mismo.                   |
| Reemplazar `(float) tally / classes.size() > 0.5` por `(float) tally / classes.size() > finalsRatio()` y agregar `float finalsRatio() { return 1/2; }` | Idem anterior, para otro valor constante.                                        | ✅ **Sí**      | Misma razón: mejora semántica sin alterar la lógica.                                                        |
| Renombrar `finalsOverTaken()` a `goodGradesOverTaken()`                                                                                                | Cambia solo el nombre del método, no su funcionamiento.                          | ✅ **Sí**      | Es un cambio puramente de nombre (refactoring de “Rename Method”), sin modificar el resultado del programa. |
Todos los cambios son refactorings, porque mejoran la claridad y mantienen el mismo comportamiento funcional.
Si compilás y ejecutás el programa StudentCmd (versión original y refactorizada):
+ Ambos compilan correctamente. 
+ Al ejecutar, producen exactamente los mismos resultados en pantalla (mismos valores, mismas condiciones de beca, etc.), ya que los cálculos internos no cambiaron.

✅ Conclusión: El resultado del programa es idéntico, por lo tanto los cambios fueron refactorings válidos.