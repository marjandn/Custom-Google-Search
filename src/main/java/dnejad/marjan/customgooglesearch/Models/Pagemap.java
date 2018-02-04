package dnejad.marjan.customgooglesearch.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by M.DN
 * On 08/01/2018
 */
public class Pagemap {
    @SerializedName("cse_thumbnail")
    @Expose
    private List<CseThumbnail> cseThumbnail = null;
    @SerializedName("postaladdress")
    @Expose
    private List<Postaladdress> postaladdress = null;
    @SerializedName("metatags")
    @Expose
    private List<Metatag> metatags = null;
    @SerializedName("medicalspecialty")
    @Expose
    private List<Medicalspecialty> medicalspecialty = null;
    @SerializedName("breadcrumb")
    @Expose
    private List<Breadcrumb> breadcrumb = null;
    @SerializedName("physician")
    @Expose
    private List<Physician> physician = null;
    @SerializedName("cse_image")
    @Expose
    private List<CseImage> cseImage = null;
    @SerializedName("hcard")
    @Expose
    private List<Hcard> hcard = null;
    @SerializedName("person")
    @Expose
    private List<Person> person = null;
    @SerializedName("videoobject")
    @Expose
    private List<Videoobject> videoobject = null;
    @SerializedName("imageobject")
    @Expose
    private List<Imageobject> imageobject = null;
    @SerializedName("organization")
    @Expose
    private List<Organization> organization = null;
    @SerializedName("icde.html")
    @Expose
    private List<IcdeHtml> icdeHtml = null;

    public List<CseThumbnail> getCseThumbnail() {
        return cseThumbnail;
    }

    public void setCseThumbnail(List<CseThumbnail> cseThumbnail) {
        this.cseThumbnail = cseThumbnail;
    }

    public List<Postaladdress> getPostaladdress() {
        return postaladdress;
    }

    public void setPostaladdress(List<Postaladdress> postaladdress) {
        this.postaladdress = postaladdress;
    }

    public List<Metatag> getMetatags() {
        return metatags;
    }

    public void setMetatags(List<Metatag> metatags) {
        this.metatags = metatags;
    }

    public List<Medicalspecialty> getMedicalspecialty() {
        return medicalspecialty;
    }

    public void setMedicalspecialty(List<Medicalspecialty> medicalspecialty) {
        this.medicalspecialty = medicalspecialty;
    }

    public List<Breadcrumb> getBreadcrumb() {
        return breadcrumb;
    }

    public void setBreadcrumb(List<Breadcrumb> breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

    public List<Physician> getPhysician() {
        return physician;
    }

    public void setPhysician(List<Physician> physician) {
        this.physician = physician;
    }

    public List<CseImage> getCseImage() {
        return cseImage;
    }

    public void setCseImage(List<CseImage> cseImage) {
        this.cseImage = cseImage;
    }

    public List<Hcard> getHcard() {
        return hcard;
    }

    public void setHcard(List<Hcard> hcard) {
        this.hcard = hcard;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public List<Videoobject> getVideoobject() {
        return videoobject;
    }

    public void setVideoobject(List<Videoobject> videoobject) {
        this.videoobject = videoobject;
    }

    public List<Imageobject> getImageobject() {
        return imageobject;
    }

    public void setImageobject(List<Imageobject> imageobject) {
        this.imageobject = imageobject;
    }

    public List<Organization> getOrganization() {
        return organization;
    }

    public void setOrganization(List<Organization> organization) {
        this.organization = organization;
    }

    public List<IcdeHtml> getIcdeHtml() {
        return icdeHtml;
    }

    public void setIcdeHtml(List<IcdeHtml> icdeHtml) {
        this.icdeHtml = icdeHtml;
    }

}