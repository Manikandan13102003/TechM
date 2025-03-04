const courses = [
    { id: 1, name: 'HTML for Beginners', description: 'Learn the basics of HTML to build your first website.' },
    { id: 2, name: 'Advanced JavaScript', description: 'Deep dive into JavaScript and its advanced concepts.' },
    { id: 3, name: 'Web Design Principles', description: 'Learn about layout, typography, color theory, and user experience design.' }
];

// Function to load courses dynamically onto the homepage
function loadCourses() {
    const courseList = document.getElementById('course-list');
    courses.forEach(course => {
        const courseCard = document.createElement('div');
        courseCard.classList.add('course-card');
        courseCard.innerHTML = `
            <h3>${course.name}</h3>
            <p>${course.description}</p>
            <button class="enroll-btn">Enroll Now</button>
        `;
        courseList.appendChild(courseCard);
    });
}

// Ensure courses are loaded when the page is ready
document.addEventListener('DOMContentLoaded', loadCourses);
