// Step 1: Get the Maths score from the user
let score = parseInt(prompt("Enter the Maths score:"));

// Step 2: Check the score and display the appropriate message
if (score === 100) {
    alert("Phenomenal!");
} else if (score > 85) {
    alert("Excellent!");
} else if (score >= 71 && score <= 85) {
    alert("Good work!");
} else if (score >= 51 && score <= 70) {
    alert("Practice well!");
} else {
    alert("Hard work is needed");
}
