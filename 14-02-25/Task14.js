// Step 1: Get the two numbers from the user
let startNumber = parseInt(prompt("Enter the first number:"));
let endNumber = parseInt(prompt("Enter the second number:"));

// Step 2: Loop through the numbers and display them until a multiple of 7 is encountered
for (let i = startNumber; i <= endNumber; i++) {
    if (i % 7 === 0) {
        console.log("Multiple of 7 found: " + i);
        break; // Stop the loop if a multiple of 7 is found
    }
    console.log(i);
}
