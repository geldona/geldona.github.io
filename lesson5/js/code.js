//Hamburger menu
const mainnav = document.querySelector('.navigation');
const hambutton = document.querySelector('.ham');

hambutton.addEventListener('click', 
() => {mainnav.classList.toggle('responsive')}, false);

// Footer Date
let week_name = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
let month_name = ['January','February', 'March', 'April', 'May','June', 'July', 'August', 'September', 'October', 'November', 'December'];
let mydate = new Date();
let weekname = week_name[mydate.getDay()];
let monthname  = month_name[mydate.getMonth()];
const dateoutput = document.querySelector('.currentdate');
dateoutput.textContent = weekname + ', ' + mydate.getDate() + " " + monthname + " " + mydate.getFullYear();


function fridays(){
    console.log("daytime");
     var full_date = new Date();
     var daysofWeek = ['Sunday','Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
     var dayofWeek = daysofWeek[full_date.getDay()]; 
     if (dayofWeek == "Friday"){
         let out = "Saturday = Preston Pancakes in the Park! 9:00 a.m. Saturday at the city park.";
         document.getElementById("fridays").style.display = "block"
         document.getElementById("fridays").innerHTML = out;
     }
     else{
         document.getElementById("fridays").style.display = "none"
     }
 }
 fridays();