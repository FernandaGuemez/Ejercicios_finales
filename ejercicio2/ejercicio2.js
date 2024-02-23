const prompt = require("prompt-sync")();
function addNumber() {
  let num = prompt("Temperatura en grados Celsius: ");
  if (isNaN(num)) {
    console.log("No es número");
    return addNumber();
  } else {
    return Number(num);
  }
}
// función que convierte la temperatura en °C a °F y K
function convertTemp(gradoscelsius) {
  let gradosfahrenheit = (celsius * 9) / 5 + 32;
  console.log(
    `La temperatura ${gradoscelsius}°C es igual a ${gradosfahrenheit}°F`
  );

  let gradoskelvin = celsius + 273.15;
  console.log(
    `La temperatura ${gradoscelsius}°C es igual a  ${gradoskelvin} K`
  );
}
let number = addNumber();
convertTemp(number);
