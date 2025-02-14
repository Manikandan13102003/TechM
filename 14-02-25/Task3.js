// Step 1: Create a constant variable using const
const number = 11; // You can change this value to test with different numbers

// Step 2: Function to check if a number is prime
function isPrime(num) {
    if (num <= 1) {
        return false; // Numbers less than or equal to 1 are not prime
    }
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) {
            return false; // Number is divisible by a value other than 1 and itself
        }
    }
    return true; // If no divisors are found, the number is prime
}

// Step 3: Check if the number is prime and display the result
if (isPrime(number)) {
    console.log(number + " is a prime number.");
} else {
    console.log(number + " is not a prime number.");
}
