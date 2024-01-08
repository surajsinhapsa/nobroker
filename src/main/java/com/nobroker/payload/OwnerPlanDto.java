package com.nobroker.payload;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class OwnerPlanDto {


    private long planId;


    private String planName;

    private double price;

    private int planValidity;

    private boolean relationshipManager;

    private boolean rentalAgreement;

    private  boolean propertyPromotion;

    private boolean guaranteedTenants;

    private boolean showingProperty;

    private boolean FacebookMarketingProperty;

    public long getPlanId() {
        return planId;
    }

    public void setPlanId(long planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPlanValidity() {
        return planValidity;
    }

    public void setPlanValidity(int planValidity) {
        this.planValidity = planValidity;
    }

    public boolean isRelationshipManager() {
        return relationshipManager;
    }

    public void setRelationshipManager(boolean relationshipManager) {
        this.relationshipManager = relationshipManager;
    }

    public boolean isRentalAgreement() {
        return rentalAgreement;
    }

    public void setRentalAgreement(boolean rentalAgreement) {
        this.rentalAgreement = rentalAgreement;
    }

    public boolean isPropertyPromotion() {
        return propertyPromotion;
    }

    public void setPropertyPromotion(boolean propertyPromotion) {
        this.propertyPromotion = propertyPromotion;
    }

    public boolean isGuaranteedTenants() {
        return guaranteedTenants;
    }

    public void setGuaranteedTenants(boolean guaranteedTenants) {
        this.guaranteedTenants = guaranteedTenants;
    }

    public boolean isShowingProperty() {
        return showingProperty;
    }

    public void setShowingProperty(boolean showingProperty) {
        this.showingProperty = showingProperty;
    }

    public boolean isFacebookMarketingProperty() {
        return FacebookMarketingProperty;
    }

    public void setFacebookMarketingProperty(boolean facebookMarketingProperty) {
        FacebookMarketingProperty = facebookMarketingProperty;
    }
}
