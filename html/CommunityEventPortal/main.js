// Task 8: Retrieve saved preference on load
window.onload = function () {
  console.log("Welcome to the Community Portal");
  alert("The page is fully loaded!");
  let savedEvent = localStorage.getItem("preferredEvent");
  if (savedEvent) {
    document.getElementById("event-type").value = savedEvent;
    document.getElementById("enteryfee").innerText = "Entry fee: $10";
  }
};

// Task 9: Geolocation Functions
function getLocation() {
  const locDisplay = document.getElementById("location-output");

  // Check if the browser supports geolocation
  if (navigator.geolocation) {
    locDisplay.innerHTML = "Locating... please wait.";

    // High accuracy options as requested in Task 9
    const options = {
      enableHighAccuracy: true,
      timeout: 10000, // 10 seconds timeout
      maximumAge: 0, // Don't use a cached location
    };

    navigator.geolocation.getCurrentPosition(showPosition, showError, options);
  } else {
    locDisplay.innerHTML = "Geolocation is not supported by this browser.";
  }
}


function showPosition(position) {
  const locDisplay = document.getElementById("location-output");
  locDisplay.innerHTML =
    "Your Coordinates:<br>" +
    "Latitude: " +
    position.coords.latitude +
    "<br>" +
    "Longitude: " +
    position.coords.longitude +
    "<br>" +
    "<span style='color: green; margin-top: 5px; display: block;'>Finding events near this location...</span>";
}

// Error Callback
function showError(error) {
  const locDisplay = document.getElementById("location-output");
  switch (error.code) {
    case error.PERMISSION_DENIED:
      locDisplay.innerHTML = "You denied the request for Geolocation.";
      break;
    case error.POSITION_UNAVAILABLE:
      locDisplay.innerHTML = "Location information is unavailable.";
      break;
    case error.TIMEOUT:
      locDisplay.innerHTML = "The request to get user location timed out.";
      break;
    default:
      locDisplay.innerHTML = "An unknown error occurred.";
      break;
  }
}
