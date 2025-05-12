// Generate a random number between 1 and 100
const secretNumber = Math.floor(Math.random() * 100) + 1;
let guess;
let attempts = 0;

alert("🎯 Welcome to the Guessing Game!\nI'm thinking of a number between 1 and 100.");

while (true) {
  guess = prompt("Enter your guess:");
  attempts++;

  // Convert input to number
  guess = Number(guess);

  if (isNaN(guess)) {
    alert("❗ Please enter a valid number!");
    continue;
  }

  if (guess < secretNumber) {
    alert("Too low! Try a higher number.");
  } else if (guess > secretNumber) {
    alert("Too high! Try a lower number.");
  } else {
    alert(`🎉 Congratulations! You guessed it in ${attempts} attempts!`);
    break;
  }
}
