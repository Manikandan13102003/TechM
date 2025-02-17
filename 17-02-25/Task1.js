function displayMultiplicationTable() {
    let number = 5;  // Example number for the multiplication table
    let limit = 10;  // Example limit for the table (you can change these values as needed)
  
    // Loop through the range from 1 to the limit
    for (let i = 1; i <= limit; i++) {
        console.log(`${number} x ${i} = ${number * i}`);
    }
}

// Call the function to display the table
displayMultiplicationTable();
