function formatAMPM() {
    var date = new Date();
    var currDate = date.getDate();
    var hours = date.getHours();
    var dayName = getDayName(date.getDay());
    var minutes = date.getMinutes();
    var monthName = getMonthName(date.getMonth());
    var year = date.getFullYear();
    var ampm = hours >= 12 ? 'pm' : 'am';
    hours = hours % 12;
    hours = hours ? hours : 12; // the hour '0' should be '12'
    minutes = minutes < 10 ? '0' + minutes : minutes;
    var strTime = dayName + ' ' + monthName + ' ' + currDate + ' ' + year + ' ' + hours + ':' + minutes + ' ' + ampm;
    alert(strTime);
}

function getMonthName(month) {
    var ar = new Array("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
    return ar[month];
}