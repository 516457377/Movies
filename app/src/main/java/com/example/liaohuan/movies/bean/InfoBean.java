/**
 * Copyright 2018 bejson.com
 */
package com.example.liaohuan.movies.bean;

import java.util.List;

/**
 * Auto-generated: 2018-07-09 12:11:15
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class InfoBean {

    private String code;
    private Data data;
    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }

    public void setData(Data data) {
        this.data = data;
    }
    public Data getData() {
        return data;
    }

//TODO
    public class Panorama {

        private int videoType;
        private int viewAngleX;
        private int viewAngleY;
        private int zoomRate;
        public void setVideoType(int videoType) {
            this.videoType = videoType;
        }
        public int getVideoType() {
            return videoType;
        }

        public void setViewAngleX(int viewAngleX) {
            this.viewAngleX = viewAngleX;
        }
        public int getViewAngleX() {
            return viewAngleX;
        }

        public void setViewAngleY(int viewAngleY) {
            this.viewAngleY = viewAngleY;
        }
        public int getViewAngleY() {
            return viewAngleY;
        }

        public void setZoomRate(int zoomRate) {
            this.zoomRate = zoomRate;
        }
        public int getZoomRate() {
            return zoomRate;
        }

    }

    //TODO
    public class PlayControls {

        private int platformId;
        private int downloadAllowed;
        private int cooperationAllowed;
        private int availableStatus;
        public void setPlatformId(int platformId) {
            this.platformId = platformId;
        }
        public int getPlatformId() {
            return platformId;
        }

        public void setDownloadAllowed(int downloadAllowed) {
            this.downloadAllowed = downloadAllowed;
        }
        public int getDownloadAllowed() {
            return downloadAllowed;
        }

        public void setCooperationAllowed(int cooperationAllowed) {
            this.cooperationAllowed = cooperationAllowed;
        }
        public int getCooperationAllowed() {
            return cooperationAllowed;
        }

        public void setAvailableStatus(int availableStatus) {
            this.availableStatus = availableStatus;
        }
        public int getAvailableStatus() {
            return availableStatus;
        }

    }
    //TODO

    public class Data {

        private long albumId;
        private long albumQipuId;
        private long qipuId;
        private long tvId;
        private int contentType;
        private int playOrder;
        private long tvYear;
        private int beginTime;
        private int endTime;
        private int timeLength;
        private int videoStatus;
        private int categoryId;
        private int copyrightId;
        private String tvName;
        private String keyWord;
        private String desc;
        private String subTitle;
        private String domainName;
        private String tvUniqId;
        private String videoImage;
        private String videoUrl;
        private String updateTime;
        private String issueTime;
        private String html5PlayUrl;
        private String html5PlayUrlForBaidu;
        private String broadcastRate;
        private String androidApp;
        private String iosApp;
        private String swf;
        private String commonSwf;
        private int is3D;
        private String isPurchase;
        private int payMark;
        private int memberDownloadableOnly;
        private int is1080p;
        private int isDolby;
        private Panorama panorama;
        private List<PlayControls> playControls;
        private List<String> subsites;
        private String shortTitle;
        public void setAlbumId(long albumId) {
            this.albumId = albumId;
        }
        public long getAlbumId() {
            return albumId;
        }

        public void setAlbumQipuId(long albumQipuId) {
            this.albumQipuId = albumQipuId;
        }
        public long getAlbumQipuId() {
            return albumQipuId;
        }

        public void setQipuId(long qipuId) {
            this.qipuId = qipuId;
        }
        public long getQipuId() {
            return qipuId;
        }

        public void setTvId(long tvId) {
            this.tvId = tvId;
        }
        public long getTvId() {
            return tvId;
        }

        public void setContentType(int contentType) {
            this.contentType = contentType;
        }
        public int getContentType() {
            return contentType;
        }

        public void setPlayOrder(int playOrder) {
            this.playOrder = playOrder;
        }
        public int getPlayOrder() {
            return playOrder;
        }

        public void setTvYear(long tvYear) {
            this.tvYear = tvYear;
        }
        public long getTvYear() {
            return tvYear;
        }

        public void setBeginTime(int beginTime) {
            this.beginTime = beginTime;
        }
        public int getBeginTime() {
            return beginTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }
        public int getEndTime() {
            return endTime;
        }

        public void setTimeLength(int timeLength) {
            this.timeLength = timeLength;
        }
        public int getTimeLength() {
            return timeLength;
        }

        public void setVideoStatus(int videoStatus) {
            this.videoStatus = videoStatus;
        }
        public int getVideoStatus() {
            return videoStatus;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }
        public int getCategoryId() {
            return categoryId;
        }

        public void setCopyrightId(int copyrightId) {
            this.copyrightId = copyrightId;
        }
        public int getCopyrightId() {
            return copyrightId;
        }

        public void setTvName(String tvName) {
            this.tvName = tvName;
        }
        public String getTvName() {
            return tvName;
        }

        public void setKeyWord(String keyWord) {
            this.keyWord = keyWord;
        }
        public String getKeyWord() {
            return keyWord;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
        public String getDesc() {
            return desc;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }
        public String getSubTitle() {
            return subTitle;
        }

        public void setDomainName(String domainName) {
            this.domainName = domainName;
        }
        public String getDomainName() {
            return domainName;
        }

        public void setTvUniqId(String tvUniqId) {
            this.tvUniqId = tvUniqId;
        }
        public String getTvUniqId() {
            return tvUniqId;
        }

        public void setVideoImage(String videoImage) {
            this.videoImage = videoImage;
        }
        public String getVideoImage() {
            return videoImage;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }
        public String getVideoUrl() {
            return videoUrl;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }
        public String getUpdateTime() {
            return updateTime;
        }

        public void setIssueTime(String issueTime) {
            this.issueTime = issueTime;
        }
        public String getIssueTime() {
            return issueTime;
        }

        public void setHtml5PlayUrl(String html5PlayUrl) {
            this.html5PlayUrl = html5PlayUrl;
        }
        public String getHtml5PlayUrl() {
            return html5PlayUrl;
        }

        public void setHtml5PlayUrlForBaidu(String html5PlayUrlForBaidu) {
            this.html5PlayUrlForBaidu = html5PlayUrlForBaidu;
        }
        public String getHtml5PlayUrlForBaidu() {
            return html5PlayUrlForBaidu;
        }

        public void setBroadcastRate(String broadcastRate) {
            this.broadcastRate = broadcastRate;
        }
        public String getBroadcastRate() {
            return broadcastRate;
        }

        public void setAndroidApp(String androidApp) {
            this.androidApp = androidApp;
        }
        public String getAndroidApp() {
            return androidApp;
        }

        public void setIosApp(String iosApp) {
            this.iosApp = iosApp;
        }
        public String getIosApp() {
            return iosApp;
        }

        public void setSwf(String swf) {
            this.swf = swf;
        }
        public String getSwf() {
            return swf;
        }

        public void setCommonSwf(String commonSwf) {
            this.commonSwf = commonSwf;
        }
        public String getCommonSwf() {
            return commonSwf;
        }

        public void setIs3D(int is3D) {
            this.is3D = is3D;
        }
        public int getIs3D() {
            return is3D;
        }

        public void setIsPurchase(String isPurchase) {
            this.isPurchase = isPurchase;
        }
        public String getIsPurchase() {
            return isPurchase;
        }

        public void setPayMark(int payMark) {
            this.payMark = payMark;
        }
        public int getPayMark() {
            return payMark;
        }

        public void setMemberDownloadableOnly(int memberDownloadableOnly) {
            this.memberDownloadableOnly = memberDownloadableOnly;
        }
        public int getMemberDownloadableOnly() {
            return memberDownloadableOnly;
        }

        public void setIs1080p(int is1080p) {
            this.is1080p = is1080p;
        }
        public int getIs1080p() {
            return is1080p;
        }

        public void setIsDolby(int isDolby) {
            this.isDolby = isDolby;
        }
        public int getIsDolby() {
            return isDolby;
        }

        public void setPanorama(Panorama panorama) {
            this.panorama = panorama;
        }
        public Panorama getPanorama() {
            return panorama;
        }

        public void setPlayControls(List<PlayControls> playControls) {
            this.playControls = playControls;
        }
        public List<PlayControls> getPlayControls() {
            return playControls;
        }

        public void setSubsites(List<String> subsites) {
            this.subsites = subsites;
        }
        public List<String> getSubsites() {
            return subsites;
        }

        public void setShortTitle(String shortTitle) {
            this.shortTitle = shortTitle;
        }
        public String getShortTitle() {
            return shortTitle;
        }

    }

}