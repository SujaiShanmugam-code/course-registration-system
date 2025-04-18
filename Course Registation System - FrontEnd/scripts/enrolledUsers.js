const dataRow = document.getElementById("enrolledInfo");

fetch("http://localhost:8080/courses/enrolled").then((response) => {
  response.json().then((users) => {
    users.forEach((user) => {
      let row = `
        
        <tr>
        
        <td>${user.name}</td>
             <td>${user.email}</td>
                  <td>${user.enrolledCourse}</td>
        
        </tr>
        
        `;

      dataRow.innerHTML += row;
    });
  });
});
