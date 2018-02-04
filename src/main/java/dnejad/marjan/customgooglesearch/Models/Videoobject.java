package dnejad.marjan.customgooglesearch.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by M.DN
 * On 09/01/2018
 */
public class Videoobject {
    @SerializedName("baseUrl")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("paid")
    @Expose
    private String paid;
    @SerializedName("channelid")
    @Expose
    private String channelid;
    @SerializedName("videoid")
    @Expose
    private String videoid;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("unlisted")
    @Expose
    private String unlisted;
    @SerializedName("thumbnailurl")
    @Expose
    private String thumbnailurl;
    @SerializedName("embedurl")
    @Expose
    private String embedurl;
    @SerializedName("playertype")
    @Expose
    private String playertype;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("isfamilyfriendly")
    @Expose
    private String isfamilyfriendly;
    @SerializedName("regionsallowed")
    @Expose
    private String regionsallowed;
    @SerializedName("interactioncount")
    @Expose
    private String interactioncount;
    @SerializedName("datepublished")
    @Expose
    private String datepublished;
    @SerializedName("genre")
    @Expose
    private String genre;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    public String getVideoid() {
        return videoid;
    }

    public void setVideoid(String videoid) {
        this.videoid = videoid;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getUnlisted() {
        return unlisted;
    }

    public void setUnlisted(String unlisted) {
        this.unlisted = unlisted;
    }

    public String getThumbnailurl() {
        return thumbnailurl;
    }

    public void setThumbnailurl(String thumbnailurl) {
        this.thumbnailurl = thumbnailurl;
    }

    public String getEmbedurl() {
        return embedurl;
    }

    public void setEmbedurl(String embedurl) {
        this.embedurl = embedurl;
    }

    public String getPlayertype() {
        return playertype;
    }

    public void setPlayertype(String playertype) {
        this.playertype = playertype;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getIsfamilyfriendly() {
        return isfamilyfriendly;
    }

    public void setIsfamilyfriendly(String isfamilyfriendly) {
        this.isfamilyfriendly = isfamilyfriendly;
    }

    public String getRegionsallowed() {
        return regionsallowed;
    }

    public void setRegionsallowed(String regionsallowed) {
        this.regionsallowed = regionsallowed;
    }

    public String getInteractioncount() {
        return interactioncount;
    }

    public void setInteractioncount(String interactioncount) {
        this.interactioncount = interactioncount;
    }

    public String getDatepublished() {
        return datepublished;
    }

    public void setDatepublished(String datepublished) {
        this.datepublished = datepublished;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
