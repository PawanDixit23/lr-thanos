
package com.loginradius.sdk.models.responsemodels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserProfile {

    @SerializedName("Identities")
    @Expose
    private Object identities;
    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;
    @SerializedName("IsDeleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("EmailVerified")
    @Expose
    private Boolean emailVerified;
    @SerializedName("Email")
    @Expose
    private List<Email> email = null;
    @SerializedName("NoOfLogins")
    @Expose
    private Integer noOfLogins;
    @SerializedName("Provider")
    @Expose
    private String provider;
    @SerializedName("LastPasswordChangeDate")
    @Expose
    private String lastPasswordChangeDate;
    @SerializedName("LastPasswordChangeToken")
    @Expose
    private Object lastPasswordChangeToken;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("Uid")
    @Expose
    private String uid;
    @SerializedName("CreatedDate")
    @Expose
    private String createdDate;
    @SerializedName("ModifiedDate")
    @Expose
    private String modifiedDate;
    @SerializedName("RegistrationProvider")
    @Expose
    private String registrationProvider;
    @SerializedName("ExternalIds")
    @Expose
    private Object externalIds;
    @SerializedName("UnverifiedEmail")
    @Expose
    private Object unverifiedEmail;
    @SerializedName("IsCustomUid")
    @Expose
    private Object isCustomUid;
    @SerializedName("RegistrationSource")
    @Expose
    private String registrationSource;
    @SerializedName("CustomFields")
    @Expose
    private Object customFields;
    @SerializedName("Prefix")
    @Expose
    private Object prefix;
    @SerializedName("MiddleName")
    @Expose
    private Object middleName;
    @SerializedName("Suffix")
    @Expose
    private Object suffix;
    @SerializedName("NickName")
    @Expose
    private Object nickName;
    @SerializedName("ProfileName")
    @Expose
    private Object profileName;
    @SerializedName("BirthDate")
    @Expose
    private Object birthDate;
    @SerializedName("Gender")
    @Expose
    private Object gender;
    @SerializedName("Website")
    @Expose
    private Object website;
    @SerializedName("ThumbnailImageUrl")
    @Expose
    private Object thumbnailImageUrl;
    @SerializedName("ImageUrl")
    @Expose
    private Object imageUrl;
    @SerializedName("Favicon")
    @Expose
    private Object favicon;
    @SerializedName("ProfileUrl")
    @Expose
    private Object profileUrl;
    @SerializedName("HomeTown")
    @Expose
    private Object homeTown;
    @SerializedName("State")
    @Expose
    private Object state;
    @SerializedName("City")
    @Expose
    private Object city;
    @SerializedName("Industry")
    @Expose
    private Object industry;
    @SerializedName("About")
    @Expose
    private Object about;
    @SerializedName("TimeZone")
    @Expose
    private Object timeZone;
    @SerializedName("CoverPhoto")
    @Expose
    private Object coverPhoto;
    @SerializedName("TagLine")
    @Expose
    private Object tagLine;
    @SerializedName("Country")
    @Expose
    private Object country;
    @SerializedName("LastLoginDate")
    @Expose
    private Object lastLoginDate;

    public Object getIdentities() {
        return identities;
    }

    public void setIdentities(Object identities) {
        this.identities = identities;
    }

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public List<Email> getEmail() {
        return email;
    }

    public void setEmail(List<Email> email) {
        this.email = email;
    }

    public Integer getNoOfLogins() {
        return noOfLogins;
    }

    public void setNoOfLogins(Integer noOfLogins) {
        this.noOfLogins = noOfLogins;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getLastPasswordChangeDate() {
        return lastPasswordChangeDate;
    }

    public void setLastPasswordChangeDate(String lastPasswordChangeDate) {
        this.lastPasswordChangeDate = lastPasswordChangeDate;
    }

    public Object getLastPasswordChangeToken() {
        return lastPasswordChangeToken;
    }

    public void setLastPasswordChangeToken(Object lastPasswordChangeToken) {
        this.lastPasswordChangeToken = lastPasswordChangeToken;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getRegistrationProvider() {
        return registrationProvider;
    }

    public void setRegistrationProvider(String registrationProvider) {
        this.registrationProvider = registrationProvider;
    }

    public Object getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(Object externalIds) {
        this.externalIds = externalIds;
    }

    public Object getUnverifiedEmail() {
        return unverifiedEmail;
    }

    public void setUnverifiedEmail(Object unverifiedEmail) {
        this.unverifiedEmail = unverifiedEmail;
    }

    public Object getIsCustomUid() {
        return isCustomUid;
    }

    public void setIsCustomUid(Object isCustomUid) {
        this.isCustomUid = isCustomUid;
    }

    public String getRegistrationSource() {
        return registrationSource;
    }

    public void setRegistrationSource(String registrationSource) {
        this.registrationSource = registrationSource;
    }

    public Object getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Object customFields) {
        this.customFields = customFields;
    }

    public Object getPrefix() {
        return prefix;
    }

    public void setPrefix(Object prefix) {
        this.prefix = prefix;
    }

    public Object getMiddleName() {
        return middleName;
    }

    public void setMiddleName(Object middleName) {
        this.middleName = middleName;
    }

    public Object getSuffix() {
        return suffix;
    }

    public void setSuffix(Object suffix) {
        this.suffix = suffix;
    }

    public Object getNickName() {
        return nickName;
    }

    public void setNickName(Object nickName) {
        this.nickName = nickName;
    }

    public Object getProfileName() {
        return profileName;
    }

    public void setProfileName(Object profileName) {
        this.profileName = profileName;
    }

    public Object getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Object birthDate) {
        this.birthDate = birthDate;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Object getWebsite() {
        return website;
    }

    public void setWebsite(Object website) {
        this.website = website;
    }

    public Object getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    public void setThumbnailImageUrl(Object thumbnailImageUrl) {
        this.thumbnailImageUrl = thumbnailImageUrl;
    }

    public Object getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getFavicon() {
        return favicon;
    }

    public void setFavicon(Object favicon) {
        this.favicon = favicon;
    }

    public Object getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(Object profileUrl) {
        this.profileUrl = profileUrl;
    }

    public Object getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(Object homeTown) {
        this.homeTown = homeTown;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Object getIndustry() {
        return industry;
    }

    public void setIndustry(Object industry) {
        this.industry = industry;
    }

    public Object getAbout() {
        return about;
    }

    public void setAbout(Object about) {
        this.about = about;
    }

    public Object getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(Object timeZone) {
        this.timeZone = timeZone;
    }

    public Object getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(Object coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public Object getTagLine() {
        return tagLine;
    }

    public void setTagLine(Object tagLine) {
        this.tagLine = tagLine;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public Object getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Object lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

}
