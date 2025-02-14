// Step 1: Get the two numbers from the user
let number = parseInt(prompt("Enter the first number (for multiplication table):"));
let range = parseInt(prompt("Enter the second number (range of the table):"));

// Step 2: Display the multiplication table
for (let i = 1; i <= range; i++) {
    console.log(number + " * " + i + " = " + (number * i));
}
