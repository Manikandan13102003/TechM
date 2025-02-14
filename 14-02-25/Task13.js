// Step 1: Get the two numbers from the user
let firstNumber = parseInt(prompt("Enter the first number:"));
let secondNumber = parseInt(prompt("Enter the second number:"));

// Step 2: Calculate the third number (second number + 40)
let thirdNumber = secondNumber + 40;

// Step 3: Use a while loop to display the multiples of first number from second number to third number
let currentNumber = secondNumber;

while (currentNumber <= thirdNumber) {
    if (currentNumber % firstNumber === 0) {
        console.log(currentNumber + " is a multiple of " + firstNumber);
    }
    currentNumber++;
}
