 El método de ordenamiento por inserción es un algoritmo simple que construye una matriz ordenada uno a uno, insertando cada elemento en su lugar correcto. Aquí está el procedimiento completo para ordenar el arreglo 
 [50, 20, 40, 80, 30] utilizando este método:

Paso 1: Comenzamos con el primer elemento (50) y lo consideramos como una matriz ordenada de un solo elemento.
Paso 2: Tomamos el siguiente elemento (20) y lo comparamos con el primer elemento (50). Como 20 es menor que 50, intercambiamos sus posiciones. Arreglo actual: [20, 50, 40, 80, 30]
Paso 3: Ahora tomamos el tercer elemento (40) y lo comparamos con los elementos anteriores. 40 es mayor que 20 pero menor que 50, por lo que lo dejamos en su lugar. Arreglo actual: [20, 40, 50, 80, 30]
Paso 4: Continuamos con el cuarto elemento (80). Como 80 es mayor que todos los elementos anteriores, lo dejamos en su lugar. Arreglo actual: [20, 40, 50, 80, 30]
Paso 5: Finalmente, tomamos el quinto elemento (30) y lo comparamos con los elementos anteriores. 30 es menor que 80, por lo que lo movemos a la posición correcta. Arreglo actual: [20, 30, 40, 50, 80]
Resultado final: El arreglo ordenado es [20, 30, 40, 50, 80].