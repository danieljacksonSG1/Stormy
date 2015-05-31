package au.com.wsit.stormy.weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import au.com.wsit.stormy.R;

/**
 * Created by guyb on 23/04/15.
 */
public class Current
{
    private String mIcon;
    private Long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimeZone;

    private double mLatitude;
    private double mLongitude;



    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIconId()
    {

        return Forecast.getIconId(mIcon);

    }

    public Long getTime() {
        return mTime;
    }

    public String getFormattedTime()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(mTimeZone));
        Date dateTime = new Date(getTime() * 1000);
        String timeString = formatter.format(dateTime);

        return timeString;


    }

    public void setTime(Long time) {
        mTime = time;
    }

    public int getTemperature()
    {

        mTemperature = ((mTemperature - 32) * 5)/9;
        return (int)Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public double getPrecipChance()
    {
        double precipPercentage = mPrecipChance * 100;
        return (int)Math.round(precipPercentage);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public void setLatitude(double latitude)
    {
        mLatitude = latitude;
    }

    public void setLongitude(double longitude)
    {
        mLongitude = longitude;
    }

    public double getLatitude()
    {
        return mLatitude;
    }

    public double getLongitude()
    {
        return mLongitude;
    }


}
