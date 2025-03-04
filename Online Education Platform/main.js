function showCategory(category) {
    const allTabs = document.querySelectorAll('.tab-content');
    allTabs.forEach(tab => tab.style.display = 'none');
    document.getElementById(category).style.display = 'block';
}

function searchCourses() {
    const query = document.getElementById('search').value.toLowerCase();
    const courses = document.querySelectorAll('.course-card');
    courses.forEach(course => {
        const title = course.querySelector('h3').textContent.toLowerCase();
        if (title.includes(query)) {
            course.style.display = 'block';
        } else {
            course.style.display = 'none';
        }
    });
}
