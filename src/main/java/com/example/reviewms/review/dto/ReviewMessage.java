package com.example.reviewms.review.dto;

public class ReviewMessage {
    private Long id;
    private String title;
    private String description;
    private double rating;
    private Long companyId;

    public Long getId() {
        return id;
    }

    public ReviewMessage setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ReviewMessage setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ReviewMessage setDescription(String description) {
        this.description = description;
        return this;
    }

    public double getRating() {
        return rating;
    }

    public ReviewMessage setRating(double rating) {
        this.rating = rating;
        return this;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public ReviewMessage setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
}
