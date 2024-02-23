const prompt = require("prompt-sync")();

function generateFibonacci(n) {
  // Verifica que el dato ingresado es un num
  if (isNaN(n)) {
    console.log("Ingresa un numero");
    return;
  }

  // Convertir el dato de entrada a un número entero
  const number = parseInt(n);

  // Generar la serie de Fibonacci
  let fibonacciSeries = [0, 1];
  for (let i = 2; i < number; i++) {
    fibonacciSeries.push(fibonacciSeries[i - 1] + fibonacciSeries[i - 2]);
  }

  // Mostrar la serie de Fibonacci en la consola
  console.log("Serie Fibonacci: ", fibonacciSeries.join(", "));
}

const enterNumber = prompt("Ingresa un numero: ");

// Llamar a la función generateFibonacci con el numero de entrada
generateFibonacci(enterNumber);
