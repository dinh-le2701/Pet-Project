document.getElementById('bookingForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the form from submitting the traditional way

    // Extract the date value from the datetime picker
    const dateInput = document.getElementById('date_booking').value;

    // Validate date input
    if (!dateInput) {
        console.error('Date input is empty or invalid');
        return;
    }

    // Convert to JavaScript Date object
    const date = new Date(dateInput);

    // Validate Date object
    if (isNaN(date.getTime())) {
        console.error('Invalid date format');
        return;
    }

    // Format date according to the backend requirement (e.g., 'MM/DD/YYYY HH:mm A')
    const formattedDate = moment(date).format('MM/DD/YYYY h:mm A');

    // Collect form data
    const formData = {
        booking_name: document.getElementById('booking_name').value,
        email: document.getElementById('email').value,
        date_booking: formattedDate,  // Send the correctly formatted date
        num_people: document.getElementById('num_people').value,
        special_request: document.getElementById('special_request').value
    };

    // Send data to API
    fetch('http://localhost:6688/api/v1/booking', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(formData)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.json();
    })
    .then(data => {
        console.log('Success:', data);
        // Optionally, handle successful response
    })
    .catch((error) => {
        console.error('Error:', error);
        // Optionally, handle errors
    });
});
