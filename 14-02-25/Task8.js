// Step 1: Get the price of 1 kg tomato for each day of the week (Monday to Sunday)
let mondayPrice = parseFloat(prompt("Enter the price of 1 kg of tomatoes on Monday:"));
let tuesdayPrice = parseFloat(prompt("Enter the price of 1 kg of tomatoes on Tuesday:"));
let wednesdayPrice = parseFloat(prompt("Enter the price of 1 kg of tomatoes on Wednesday:"));
let thursdayPrice = parseFloat(prompt("Enter the price of 1 kg of tomatoes on Thursday:"));
let fridayPrice = parseFloat(prompt("Enter the price of 1 kg of tomatoes on Friday:"));
let saturdayPrice = parseFloat(prompt("Enter the price of 1 kg of tomatoes on Saturday:"));
let sundayPrice = parseFloat(prompt("Enter the price of 1 kg of tomatoes on Sunday:"));

// Step 2: Calculate the average price
let totalPrice = mondayPrice + tuesdayPrice + wednesdayPrice + thursdayPrice + fridayPrice + saturdayPrice + sundayPrice;
let averagePrice = totalPrice / 7;

// Step 3: Check if the average price is greater than Rs.50 and display the result
if (averagePrice > 50) {
    alert("Tomato has given good profit with an average price of Rs." + averagePrice.toFixed(2));
} else {
    alert("No profit from tomato. The average price is Rs." + averagePrice.toFixed(2));
}
