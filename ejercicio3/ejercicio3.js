const prompt = require("prompt-sync")();

// Función para calcular el factorial de un numero
function calcularFactorial(numero) {
  if (numero === 0) {
    return 1;
  } else {
    return numero * calcularFactorial(numero - 1);
  }
}

// Función para solicitar un número al usuario y calcular su factorial
function calcularFactorialUsuario() {
  let num = prompt("Ingresa un número para calcular factorial:");

  // Verificar si el dato ingresado es num
  if (isNaN(num)) {
    console.log("Error, ingresa un número");
    calcularFactorialUsuario();
    // Volver a solicitar número
  } else {
    num = parseFloat(num);
    // Convertir  número a tipo float
    let factorial = calcularFactorial(num);
    console.log(`El factorial de ${num} es: ${factorial}`);
  }
}

// Llamar a la función para solicitar el número al usuario
calcularFactorialUsuario();
