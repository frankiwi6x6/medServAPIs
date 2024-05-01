package com.DEVLooping.userAPI.entity;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password_hashed")
    private String password;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "status")
    private String status;

    @Column(name = "deactivated_at")
    private Date deactivated_at;

    @Column(name = "profile_pic_url")
    private String profile_pic_url;

    // Getters y setters

    public Date getDeactivated_at() {
        return deactivated_at;
    }

    public void setDeactivated_at(Date deactivated_at) {
        this.deactivated_at = deactivated_at;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_type_id")
    private UserType userType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // constuctores
    public User() {
    }

    public User(int id, String username, String email, String password, Date created_at, UserType userType,
            String status, Date deactivated_at, String profile_pic_url) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.created_at = created_at;
        this.userType = userType;
        this.status = status;
        this.deactivated_at = deactivated_at;
        this.profile_pic_url = profile_pic_url;
    }

    public String getProfile_pic_url() {
        return profile_pic_url;
    }

    public void setProfile_pic_url(String profile_pic_url) {
        this.profile_pic_url = profile_pic_url;
    }

}
