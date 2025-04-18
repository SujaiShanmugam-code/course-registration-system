const rowData = document.getElementById("availableCourseTable");

fetch("http://localhost:8080/courses").then((response) => {
  response.json().then((courses) => {
    courses.forEach((course) => {
      let row = `<tr>

      <td>${course.courseId}</td>
            <td>${course.courseName}</td>
                  <td>${course.courseTrainer}</td>
                        <td>${course.courseDurationInWeek}</td>
    
      </tr>`;

      rowData.innerHTML += row;
    });
  });
});
