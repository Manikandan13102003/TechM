interface Course {
    id: number;
    name: string;
    instructor: string;
    description: string;
}

async function fetchCourses(): Promise<Course[]> {
    const response = await fetch('data/courses.json');
    const data: Course[] = await response.json();
    return data;
}

fetchCourses().then(courses => {
    console.log(courses); // Populate courses dynamically on the page
});
