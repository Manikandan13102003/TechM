// Step 1: Get the two numbers from the user
let startNumber = parseInt(prompt("Enter the first number:"));
let endNumber = parseInt(prompt("Enter the second number:"));

// Step 2: Loop through the numbers and display them, skipping multiples of 5
for (let i = startNumber; i <= endNumber; i++) {
    if (i % 5 === 0) {
        continue; // Skip the multiples of 5
    }
    console.log(i);
}
