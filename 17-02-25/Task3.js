function checkSumOfDigits(number) {
    let sum = 0;
  
    // Convert the number to a string to easily access each digit
    let digits = number.toString();
  
    // Loop through each digit and add it to the sum
    for (let i = 0; i < digits.length; i++) {
        sum += parseInt(digits[i]);  // Convert each character back to a number and add to sum
    }
  
    // Check if the sum is even or odd
    if (sum % 2 === 0) {
        console.log(`The sum of the digits of ${number} is ${sum}, and it is an even number.`);
    } else {
        console.log(`The sum of the digits of ${number} is ${sum}, and it is an odd number.`);
    }
}

// Call the function with a number (e.g., 123)
checkSumOfDigits(123);
