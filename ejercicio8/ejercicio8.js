let numeros = [];

// Paso 2: Pedir al usuario que ingrese 10 números y almacenarlos en el array `numeros`.
for (let i = 0; i < 10; i++) {
  let numero = parseInt(prompt(`Ingrese el número ${i + 1}:`));
  numeros.push(numero);
}

// Paso 3: Crear un array vacío llamado `primos`.
let primos = [];

// Paso 4: Iterar sobre cada número en `numeros`.
for (let i = 0; i < numeros.length; i++) {
  let esPrimo = true;

  // Paso 4a: Verificar si el número es primo.
  for (let j = 2; j < numeros[i]; j++) {
    if (numeros[i] % j === 0) {
      esPrimo = false;
      break;
    }
  }

  // Paso 4b: Si es primo, agregarlo al array `primos`.
  if (esPrimo) {
    primos.push(numeros[i]);
  }
}

// Paso 4c: Si no es primo, agregarlo al array `numeros`.
numeros = numeros.filter((numero) => !primos.includes(numero));

// Paso 5: Concatenar `primos` y `numeros` para formar un solo array.
let resultado = primos.concat(numeros);

// Paso 6: Mostrar el array original y el array con los números primos al principio.
console.log("Array original:");
for (let i = 0; i < resultado.length; i++) {
  console.log(`${i} - ${resultado[i]}`);
}

console.log("Array con los números primos en las primeras posiciones:");
for (let i = 0; i < resultado.length; i++) {
  console.log(`${i} - ${resultado[i]}`);
}
