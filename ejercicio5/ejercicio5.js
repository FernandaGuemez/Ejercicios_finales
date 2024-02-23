const prompt = require("prompt-sync")();

// Esto sirve para generar un num aleatorio de 1 al 100
const numeroSecreto = Math.floor(Math.random() * 100) + 1;

// Inicializar una lista para almacenar los números ingresados por el usuario
const numerosIngresados = [];

// Funcion para verificar si un valor es un número
function esNumero(valor) {
  return !isNaN(parseInt(valor, 10));
}

// Funcion para mostrar un mensaje de ayuda
function mostrarAyuda(numeroIngresado) {
  if (numeroIngresado < numeroSecreto) {
    console.log("El número secreto es mayor");
  } else {
    console.log("El número secreto es menor");
  }
}

// Funcion principal
function adivinarNumero() {
  let numeroIngresado = prompt("Intenta adivinar el número secreto (1-100):");

  // Verificar si el valor ingresado es un numero
  while (!esNumero(numeroIngresado)) {
    console.log("Ingresa un número");
    numeroIngresado = prompt("Intenta adivinar el número secreto (1-100):");
  }

  // Convertir el valor ingresado a un numero entero
  numeroIngresado = parseInt(numeroIngresado, 10);

  // Agregar el num ingresado a la lista de números
  numerosIngresados.push(numeroIngresado);

  // Verificar si el num ingresado es igual al num secreto
  if (numeroIngresado === numeroSecreto) {
    console.log("¡¡¡Lo lograste!!!, adivinaste el número secreto");
    console.log("Lista de números ingresados:", numerosIngresados);
  } else {
    console.log("El numero es incorrecto, vuelve a intentarlo");
    mostrarAyuda(numeroIngresado);
    adivinarNumero();
  }
}

// Llamar a la funcion principal para iniciar el juego
adivinarNumero();
