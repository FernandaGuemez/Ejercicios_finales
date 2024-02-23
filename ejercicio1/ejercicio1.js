const prompt = require("prompt-sync")();

let num1 = parseInt(prompt("Ingrese el primer numero "));
let num2 = parseInt(prompt("Ingrese el segundo numero "));
let num3 = parseInt(prompt("Ingrese el tercer numero "));

numMayor = 0;
numMenor = 0;
numMedio = 0;

if (num1 === num2 || num1 === num3 || num2 === num3) {
  console.log("Hay al menos dos numeros que son iguales");
}
if (num1 < num2) {
  if (num2 < num3) {
    numMayor = num3;
    numMedio = num2;
    numMenor = num1;
  } else if (num1 < num3) {
    numMayor = num2;
    numMedio = num3;
    numMenor = num1;
  } else {
    numMayor = num2;
    numMedio = num1;
    numMenor = num3;
  }
} else {
  if (num2 > num3) {
    numMayor = num1;
    numMedio = num2;
    numMenor = num3;
  } else if (num1 > num3) {
    numMayor = num1;
    numMedio = num3;
    numMenor = num2;
  } else {
    numMayor = num3;
    numMedio = num1;
    numMenor = num2;
  }
}

console.log(`${numMayor}, ${numMedio}, ${numMenor}`);
console.log(`${numMenor}, ${numMedio}, ${numMayor}`);
