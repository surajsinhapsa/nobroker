package com.nobroker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "owner_plans")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OwnerPlan {

    @Id
    private long planId;

    @Column(name = "plan_name",unique = true)
    private String planName;

    @Column(name = "price")
    private double price;

    @Column(name = "plan_validity")
    private int planValidity;

    @Column(name = "relationship_manager")
    private boolean relationshipManager;

    @Column(name = "rental_agreement")
    private boolean rentalAgreement;

    @Column(name = "property_promotion")
    private  boolean propertyPromotion;

    @Column(name = "guaranteed_tenants")
    private boolean guaranteedTenants;

    @Column(name = "showing_property")
    private boolean showingProperty;

    @Column(name = "facebook_marketing")
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
