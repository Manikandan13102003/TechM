// Step 1: Get the day of the week from the user
let day = prompt("Enter the day of the week:");

// Step 2: Convert the input to lowercase to make the check case-insensitive
day = day.toLowerCase();

// Step 3: Use a switch statement to handle different cases
switch (day) {
    case "monday":
        alert("Start of the week!");
        break;
    case "tuesday":
    case "wednesday":
    case "thursday":
        alert("Mid of the week!");
        break;
    case "friday":
        alert("Last working day of the week!");
        break;
    case "saturday":
        alert("WeekEnd - Saturday!");
        break;
    case "sunday":
        alert("WeekEnd - Sunday!");
        break;
    default:
        alert("Invalid input!");
}
