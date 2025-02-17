const chooseOperation = () => {
    // For demonstration, let's define the operation and the numbers
    let operation = 'add';  // Can be 'add', 'subtract', 'multiply', or 'divide'
    let num1 = 10;
    let num2 = 5;

    // Define the corresponding operations using methods
    switch (operation) {
        case 'add':
            const sum = (a, b) => a + b;
            console.log(`Sum: ${sum(num1, num2)}`);
            break;
        case 'subtract':
            const difference = (a, b) => a - b;
            console.log(`Difference: ${difference(num1, num2)}`);
            break;
        case 'multiply':
            const product = (a, b) => a * b;
            console.log(`Product: ${product(num1, num2)}`);
            break;
        case 'divide':
            const quotient = (a, b) => a / b;
            const remainder = (a, b) => a % b;
            console.log(`Quotient: ${quotient(num1, num2)}, Remainder: ${remainder(num1, num2)}`);
            break;
        default:
            console.log('Invalid operation!');
    }
}

// Call the function to demonstrate
chooseOperation();
