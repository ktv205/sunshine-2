package com.example.android.sunshine.app.data;

import android.provider.BaseColumns;

/**
 * Created by krishnateja on 6/20/2015.
 */
public class WeatherContract {
    /*
     *Inner class that defines columns of weather table
     */
    public static class WeatherEntry implements BaseColumns {
        public static final String TABLE_NAME = "weather";

        // Column with the foreign key into the location table.
        public static final String COLUMN_LOC_KEY = "location_id";

        // Date, stored as long in milliseconds since the epoch
        public static final String COLUMN_DATE = "date";

        // Weather id as returned by API, to identify the icon to be used
        public static final String COLUMN_WEATHER_ID = "weather_id";

        // Short description and long description of the weather, as provided by API.
        // e.g "clear" vs "sky is clear".
        public static final String COLUMN_SHORT_DESC = "short_desc";

        // Min and max temperatures for the day (stored as floats)
        public static final String COLUMN_MIN_TEMP = "min";
        public static final String COLUMN_MAX_TEMP = "max";

        // Humidity is stored as a float representing percentage
        public static final String COLUMN_HUMIDITY = "humidity";

        // Humidity is stored as a float representing percentage
        public static final String COLUMN_PRESSURE = "pressure";

        // Windspeed is stored as a float representing windspeed  mph
        public static final String COLUMN_WIND_SPEED = "wind";

        // Degrees are meteorological degrees (e.g, 0 is north, 180 is south).  Stored as floats.
        public static final String COLUMN_DEGREES = "degrees";
    }


    /*
      Inner class that defines columns of location table
     */

    public static class LocationEntry implements BaseColumns{
        public static final String TABLE_NAME="location";

        //location setting i.e the zip code or whatever you enter in the settings activity
        //which is used as query parameter to i.e sent to the server via api call
        public static final String COLUMN_LOCATION_SETTING="location_setting";

        //city name is what the server sends as a response and also used to display in the app
        public static final String COLUMN_CITY_NAME="city_name";

        //coord_lat, coord_long are what we get from server and used in view on map intent
        public static final String COLUMN_COORD_LAT="coord_lat";
        public static final String COLUMN_COORD_LONG="coord_long";


    }
}
