package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "barInfo")
public class BarInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String restaurantName;

    @Column
    private float latitidue;

    @Column
    private float longitutde;

    @Column(length = 50)
    private String neighborhood;

    @Column(length = 100)
    private String websiteUrl;

    @Column(length = 100)
    private String menuUrl;

    @Column(length = 100)
    private String imageUrl;

    @Column
    private boolean monday;

    @Column
    private String mondayTime;

    @Column
    private boolean tuesday;

    @Column
    private String tuesdayTime;

    @Column
    private boolean wednesday;

    @Column
    private String wednesdayTime;

    @Column
    private boolean thursday;

    @Column
    private String thursdayTime;

    @Column
    private boolean friday;

    @Column
    private String fridayTime;

    @Column
    private boolean saturday;

    @Column
    private String saturdayTime;

    @Column
    private boolean sunday;

    @Column
    private String sundayTime;



    public BarInfo() {
    }

    public BarInfo(Long id, String restaurantName, float latitidue, float longitutde, String neighborhood, String websiteUrl, String menuUrl, String imageUrl, boolean monday, String mondayTime, boolean tuesday, String tuesdayTime, boolean wednesday, String wednesdayTime, boolean thursday, String thursdayTime, boolean friday, String fridayTime, boolean saturday, String saturdayTime, boolean sunday, String sundayTime) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.latitidue = latitidue;
        this.longitutde = longitutde;
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

    public float getLatitidue() {
        return latitidue;
    }

    public void setLatitidue(float latitidue) {
        this.latitidue = latitidue;
    }

    public float getLongitutde() {
        return longitutde;
    }

    public void setLongitutde(float longitutde) {
        this.longitutde = longitutde;
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

    public boolean isMonday() {
        return monday;
    }

    public void setMonday(boolean monday) {
        this.monday = monday;
    }

    public String getMondayTime() {
        return mondayTime;
    }

    public void setMondayTime(String mondayTime) {
        this.mondayTime = mondayTime;
    }

    public boolean isTuesday() {
        return tuesday;
    }

    public void setTuesday(boolean tuesday) {
        this.tuesday = tuesday;
    }

    public String getTuesdayTime() {
        return tuesdayTime;
    }

    public void setTuesdayTime(String tuesdayTime) {
        this.tuesdayTime = tuesdayTime;
    }

    public boolean isWednesday() {
        return wednesday;
    }

    public void setWednesday(boolean wednesday) {
        this.wednesday = wednesday;
    }

    public String getWednesdayTime() {
        return wednesdayTime;
    }

    public void setWednesdayTime(String wednesdayTime) {
        this.wednesdayTime = wednesdayTime;
    }

    public boolean isThursday() {
        return thursday;
    }

    public void setThursday(boolean thursday) {
        this.thursday = thursday;
    }

    public String getThursdayTime() {
        return thursdayTime;
    }

    public void setThursdayTime(String thursdayTime) {
        this.thursdayTime = thursdayTime;
    }

    public boolean isFriday() {
        return friday;
    }

    public void setFriday(boolean friday) {
        this.friday = friday;
    }

    public String getFridayTime() {
        return fridayTime;
    }

    public void setFridayTime(String fridayTime) {
        this.fridayTime = fridayTime;
    }

    public boolean isSaturday() {
        return saturday;
    }

    public void setSaturday(boolean saturday) {
        this.saturday = saturday;
    }

    public String getSaturdayTime() {
        return saturdayTime;
    }

    public void setSaturdayTime(String saturdayTime) {
        this.saturdayTime = saturdayTime;
    }

    public boolean isSunday() {
        return sunday;
    }

    public void setSunday(boolean sunday) {
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
                ", latitidue=" + latitidue +
                ", longitutde=" + longitutde +
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
