var calendar = {
    createEvent: function() {
      var success = function (msg) {
          console.log("success");
          console.log(msg);
      };
      var error = function (message) { console.log("Oopsie! " + message); };
        cordova.exec(
            success, // success callback function
            error, // error callback function
            "Calendar", // mapped to our native Java class called "CalendarPlugin"
            "addCalendarEntry", // with this action name
            []
        );
    }
}
module.exports = calendar;
