// Step 1: Get the year and month from the user
let year = parseInt(prompt("Enter the year:"));
let month = prompt("Enter the month (e.g., January, February, etc.):");

// Step 2: Function to check if the year is a leap year
function isLeapYear(year) {
    if ((year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0)) {
        return true;
    } else {
        return false;
    }
}

// Step 3: Check if the year is a leap year
if (isLeapYear(year)) {
    // Step 4: Check if the month is February
    if (month.toLowerCase() === "february") {
        alert("The year is a leap year and the month is February with 29 days.");
    } else {
        alert("The year is a leap year and the month is not February.");
    }
} else {
    alert("The given year is not a leap year.");
}
