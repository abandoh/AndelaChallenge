package com.dambana.andelachallenge;

public class ProfileManager {
    private String name;
    private String track;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String country;
    private String email;
    private String phone;

    /**
     * Default constructor with default values.
     */
    public ProfileManager(){
        this.name = "Joseph A. Abandoh-Sam";
        this.track = "Android";
        this.country = "Ghana";
        this.email = "abandoh@gmail.com";
        this.phone = "+233 27 745 5565";
    }

    /**
     * Constructor to initialize values on create.
     * @param name
     * @param track
     * @param country
     * @param email
     * @param phone
     */
    public ProfileManager(String name, String track, String country,
                          String email, String phone){
        this.name = name;
        this.track = track;
        this.country = country;
        this.email = email;
        this.phone = phone;
    }
}
