# Pseudocódigo

**Inicio**

Definir puntos como entero  
Definir numRegistro como entero  
Asignar puntos = 0  
Asignar numRegistro = 0  

// Apartado 1: Validar número de registro  
Repetir  
&nbsp;&nbsp;&nbsp;&nbsp;Imprimir "Número de registro del niño: "  
&nbsp;&nbsp;&nbsp;&nbsp;Leer numRegistro  
&nbsp;&nbsp;&nbsp;&nbsp;Si numRegistro < 1 O numRegistro > 499 Entonces  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Imprimir "El número de registro tiene que estar entre 1 y 499"  
&nbsp;&nbsp;&nbsp;&nbsp;Fin Si  
Hasta que numRegistro esté entre 1 y 499  

// Apartado 2: Evaluar si tiene un hermano  
Imprimir "¿Tienes un hermano en el colegio? (0: no / 1: sí): "  
Leer hermano  
Si hermano = 1 Entonces  
&nbsp;&nbsp;&nbsp;&nbsp;puntos = puntos + 40  
Fin Si  

// Apartado 3: Evaluar si vive en la misma zona  
Imprimir "¿Vives en la misma zona que el colegio? (0: no / 1: sí): "  
Leer zonaColegio  

// Apartado 4: Evaluar si trabaja en la misma zona  
Imprimir "¿Tu padre o madre trabaja en la misma zona que el colegio? (0: no / 1: sí): "  
Leer trabajaZona  
Si zonaColegio = 1 Entonces  
&nbsp;&nbsp;&nbsp;&nbsp;puntos = puntos + 30  
Sino Si trabajaZona = 1 Entonces  
&nbsp;&nbsp;&nbsp;&nbsp;puntos = puntos + 20  
Fin Si  

// Apartado 5: Evaluar enfermedad o discapacidad  
Imprimir "¿Tienes alguna enfermedad o discapacidad superior al 30% o alguna enfermedad crónica? (0: no / 1: sí): "  
Leer enfermedad  
Si enfermedad = 1 Entonces  
&nbsp;&nbsp;&nbsp;&nbsp;puntos = puntos + 10  
Fin Si  

// Apartado 6: Evaluar si la familia es numerosa  
Imprimir "¿Tu familia es numerosa o monoparental? (0: no / 1: sí): "  
Leer familiaNumerosa  
Si familiaNumerosa = 1 Entonces  
&nbsp;&nbsp;&nbsp;&nbsp;puntos = puntos + 15  
Fin Si  

// Apartado 7: Evaluar escolarización previa  
Imprimir "¿Tu padre, madre, tutor legal o hermano ha estado escolarizado en la escuela? (0: no / 1: sí): "  
Leer escolarizado  
Si escolarizado = 1 Entonces  
&nbsp;&nbsp;&nbsp;&nbsp;puntos = puntos + 5  
Fin Si  

// Mostrar resultados  
Imprimir "Número de registro: " + numRegistro  
Imprimir "Puntuación total: " + puntos + " puntos."  

**Fin**
