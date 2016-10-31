package barinfo.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NamedQuery(name="BarInfo.findAll", query="SELECT bi FROM BarInfo bi")
public class BarInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String restaurantName;

    @Column
    private BigDecimal latitude;

    @Column
    private BigDecimal longitude;

    @Column(length = 50)
    private String neighborhood;

    @Column(length = 100)
    private String websiteUrl;

    @Column(length = 100)
    private String menuUrl;

    @Column(length = 100)
    private String imageUrl;

    @Column
    private Boolean monday;

    @Column
    private String mondayTime;

    @Column
    private Boolean tuesday;

    @Column
    private String tuesdayTime;

    @Column
    private Boolean wednesday;

    @Column
    private String wednesdayTime;

    @Column
    private Boolean thursday;

    @Column
    private String thursdayTime;

    @Column
    private Boolean friday;

    @Column
    private String fridayTime;

    @Column
    private Boolean saturday;

    @Column
    private String saturdayTime;

    @Column
    private Boolean sunday;

    @Column
    private String sundayTime;

    public BarInfo() {
    }

    public BarInfo(Long id, String restaurantName, BigDecimal latitude, BigDecimal longitude, String neighborhood, String websiteUrl, String menuUrl, String imageUrl, Boolean monday, String mondayTime, Boolean tuesday, String tuesdayTime, Boolean wednesday, String wednesdayTime, Boolean thursday, String thursdayTime, Boolean friday, String fridayTime, Boolean saturday, String saturdayTime, Boolean sunday, String sundayTime) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.neighborhood = neighborhood;
        this.websiteUrl = websiteUrl;
        this.menuUrl = menuUrl;
        this.imageUrl = imageUrl;
        this.monday = monday;
        this.mondayTime = mondayTime;
        this.tuesday = tuesday;
        this.tuesdayTime = tuesdayTime;
        this.wednesday = wednesday;
        this.wednesdayTime = wednesdayTime;
        this.thursday = thursday;
        this.thursdayTime = thursdayTime;
        this.friday = friday;
        this.fridayTime = fridayTime;
        this.saturday = saturday;
        this.saturdayTime = saturdayTime;
        this.sunday = sunday;
        this.sundayTime = sundayTime;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean isMonday() {
        return monday;
    }

    public void setMonday(Boolean monday) {
        this.monday = monday;
    }

    public String getMondayTime() {
        return mondayTime;
    }

    public void setMondayTime(String mondayTime) {
        this.mondayTime = mondayTime;
    }

    public Boolean isTuesday() {
        return tuesday;
    }

    public void setTuesday(Boolean tuesday) {
        this.tuesday = tuesday;
    }

    public String getTuesdayTime() {
        return tuesdayTime;
    }

    public void setTuesdayTime(String tuesdayTime) {
        this.tuesdayTime = tuesdayTime;
    }

    public Boolean isWednesday() {
        return wednesday;
    }

    public void setWednesday(Boolean wednesday) {
        this.wednesday = wednesday;
    }

    public String getWednesdayTime() {
        return wednesdayTime;
    }

    public void setWednesdayTime(String wednesdayTime) {
        this.wednesdayTime = wednesdayTime;
    }

    public Boolean isThursday() {
        return thursday;
    }

    public void setThursday(Boolean thursday) {
        this.thursday = thursday;
    }

    public String getThursdayTime() {
        return thursdayTime;
    }

    public void setThursdayTime(String thursdayTime) {
        this.thursdayTime = thursdayTime;
    }

    public Boolean isFriday() {
        return friday;
    }

    public void setFriday(Boolean friday) {
        this.friday = friday;
    }

    public String getFridayTime() {
        return fridayTime;
    }

    public void setFridayTime(String fridayTime) {
        this.fridayTime = fridayTime;
    }

    public Boolean isSaturday() {
        return saturday;
    }

    public void setSaturday(Boolean saturday) {
        this.saturday = saturday;
    }

    public String getSaturdayTime() {
        return saturdayTime;
    }

    public void setSaturdayTime(String saturdayTime) {
        this.saturdayTime = saturdayTime;
    }

    public Boolean isSunday() {
        return sunday;
    }

    public void setSunday(Boolean sunday) {
        this.sunday = sunday;
    }

    public String getSundayTime() {
        return sundayTime;
    }

    public void setSundayTime(String sundayTime) {
        this.sundayTime = sundayTime;
    }

    @Override
    public String toString() {
        return "BarInfo{" +
                "id=" + id +
                ", restaurantName='" + restaurantName + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", neighborhood='" + neighborhood + '\'' +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", monday=" + monday +
                ", mondayTime='" + mondayTime + '\'' +
                ", tuesday=" + tuesday +
                ", tuesdayTime='" + tuesdayTime + '\'' +
                ", wednesday=" + wednesday +
                ", wednesdayTime='" + wednesdayTime + '\'' +
                ", thursday=" + thursday +
                ", thursdayTime='" + thursdayTime + '\'' +
                ", friday=" + friday +
                ", fridayTime='" + fridayTime + '\'' +
                ", saturday=" + saturday +
                ", saturdayTime='" + saturdayTime + '\'' +
                ", sunday=" + sunday +
                ", sundayTime='" + sundayTime + '\'' +
                '}';
    }
}
