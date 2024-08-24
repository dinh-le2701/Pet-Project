document.getElementById('bookingForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the form from submitting the traditional way

    // Collect form data
    const formData = {
        booking_name: document.getElementById('booking_name').value,
        email: document.getElementById('email').value,
        date_booking: document.getElementById('date_booking').value,
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
    .then(response => response.json())
    .then(data => {
        console.log('Success:', data);
        // Optionally, handle successful response
    })
    .catch((error) => {
        console.error('Error:', error);
        // Optionally, handle errors
    });
});