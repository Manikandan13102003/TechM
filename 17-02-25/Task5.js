// Step 1: Create the student object
let student = {
    id: 207,
    name: 'Manikandan',
    department: 'Information Technology',
    college: 'Panimalar Instituite of Technology',
    email: 'manidoe@example.com',
    address: {
        doorNo: '123',
        street: 'Main Street',
        area: 'Chennai',
        pincode: '123456'
    },

    // Step 2: Function to display all properties
    displayAllDetails: function() {
        console.log(`ID: ${this.id}`);
        console.log(`Name: ${this.name}`);
        console.log(`Department: ${this.department}`);
        console.log(`College: ${this.college}`);
        console.log(`Email: ${this.email}`);
        console.log(`Address: ${this.address.doorNo}, ${this.address.street}, ${this.address.area}, ${this.address.pincode}`);
    },

    // Step 3: Function to display id, name, and email
    displayIdNameEmail: function() {
        console.log(`ID: ${this.id}`);
        console.log(`Name: ${this.name}`);
        console.log(`Email: ${this.email}`);
    },

    // Step 5: Function to display all details including address
    displayStudentWithAddress: function() {
        console.log(`ID: ${this.id}`);
        console.log(`Name: ${this.name}`);
        console.log(`Department: ${this.department}`);
        console.log(`College: ${this.college}`);
        console.log(`Address: ${this.address.doorNo}, ${this.address.street}, ${this.address.area}, ${this.address.pincode}`);
    }
};

// Step 2: Invoke the function to display all details
student.displayAllDetails();

// Step 3: Invoke the function to display id, name, and email
student.displayIdNameEmail();

// Step 4: Invoke the function to display details including address
student.displayStudentWithAddress();

// Step 6: Delete the email property and the displayIdNameEmail function
delete student.email;
delete student.displayIdNameEmail;

// Check after deletion
console.log('After deletion:');
student.displayAllDetails();
