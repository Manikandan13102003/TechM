// Step 1: Create a prompt box to ask the user for their age
let userAge = prompt("Please enter your age:");

// Step 2: Display the result
if (userAge !== null && userAge !== "") {
    alert("Your age is: " + userAge);
} else {
    alert("You didn't enter your age.");
}
