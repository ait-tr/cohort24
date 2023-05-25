async function loadInfo() {

  try {
    const response = await fetch("https://get.geojs.io/v1/ip/geo.json");
    const geoObj = await response.json();
    // console.log(geoObj);
    const { city, latitude, longitude } = geoObj;
    console.log(city, latitude, longitude);
  }
  catch (err) {
    console.log(err);
  }



}

loadInfo();