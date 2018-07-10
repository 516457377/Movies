package com.example.liaohuan.movies.bean;
import java.util.List;

public class SearchBean {

    private int total;

    private String code;

    private List<Data> data ;

    private int pageNo;

    private int pagesize;

    private int foundNum;

    public void setTotal(int total){
        this.total = total;
    }
    public int getTotal(){
        return this.total;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public void setData(List<Data> data){
        this.data = data;
    }
    public List<Data> getData(){
        return this.data;
    }
    public void setPageNo(int pageNo){
        this.pageNo = pageNo;
    }
    public int getPageNo(){
        return this.pageNo;
    }
    public void setPagesize(int pagesize){
        this.pagesize = pagesize;
    }
    public int getPagesize(){
        return this.pagesize;
    }
    public void setFoundNum(int foundNum){
        this.foundNum = foundNum;
    }
    public int getFoundNum(){
        return this.foundNum;
    }
    //TODO
    public class Data {
        private int albumId;

        private int qipuId;

        private int ipLimit;

        private int categoryId;

        private int sets;

        private int purchaseType;

        private int isPurchase;

        private int payMark;

        private int copyrightId;

        private int tvYear;

        private int albumStatus;

        private int contentType;

        private int isSD;

        private int is3D;

        private int sourceId;

        private int isDubo;

        private int isCoopAllowed;

        private int downloadAllowed;

        private int sourceQipuId;

        private int playcnt;

        private int timeLength;

        private int ownerAlbumId;

        private String albumName;

        private String desc;

        private String startDate;

        private String endDate;

        private String focus;

        private String albumUrl;

        private String html5Url;

        private String html5PlayUrl;

        private String html5PlayUrlForBaidu;

        private String picUrl;

        private String posterPicUrl;

        private String leafctgs;

        private String producer;

        private String credits;

        private String source;

        private String companyName;

        private String keyword;

        private String subTitle;

        private String score;

        private String actor;

        private String director;

        private String area;

        private String albumType;

        private String playUrl;

        private String createdTime;

        private String sysPlatform;

        private String alias;

        private List<Integer> tvIds ;

        private List<Integer> tvQipuIds ;

        private List<ThreeCtgs> threeCtgs ;

        private List<CreditList> creditList ;

        private UpDown upDown;

        private int season;

        private String edition;

        private List<Subsites> subsites ;

        private String swf;

        public void setAlbumId(int albumId){
            this.albumId = albumId;
        }
        public int getAlbumId(){
            return this.albumId;
        }
        public void setQipuId(int qipuId){
            this.qipuId = qipuId;
        }
        public int getQipuId(){
            return this.qipuId;
        }
        public void setIpLimit(int ipLimit){
            this.ipLimit = ipLimit;
        }
        public int getIpLimit(){
            return this.ipLimit;
        }
        public void setCategoryId(int categoryId){
            this.categoryId = categoryId;
        }
        public int getCategoryId(){
            return this.categoryId;
        }
        public void setSets(int sets){
            this.sets = sets;
        }
        public int getSets(){
            return this.sets;
        }
        public void setPurchaseType(int purchaseType){
            this.purchaseType = purchaseType;
        }
        public int getPurchaseType(){
            return this.purchaseType;
        }
        public void setIsPurchase(int isPurchase){
            this.isPurchase = isPurchase;
        }
        public int getIsPurchase(){
            return this.isPurchase;
        }
        public void setPayMark(int payMark){
            this.payMark = payMark;
        }
        public int getPayMark(){
            return this.payMark;
        }
        public void setCopyrightId(int copyrightId){
            this.copyrightId = copyrightId;
        }
        public int getCopyrightId(){
            return this.copyrightId;
        }
        public void setTvYear(int tvYear){
            this.tvYear = tvYear;
        }
        public int getTvYear(){
            return this.tvYear;
        }
        public void setAlbumStatus(int albumStatus){
            this.albumStatus = albumStatus;
        }
        public int getAlbumStatus(){
            return this.albumStatus;
        }
        public void setContentType(int contentType){
            this.contentType = contentType;
        }
        public int getContentType(){
            return this.contentType;
        }
        public void setIsSD(int isSD){
            this.isSD = isSD;
        }
        public int getIsSD(){
            return this.isSD;
        }
        public void setIs3D(int is3D){
            this.is3D = is3D;
        }
        public int getIs3D(){
            return this.is3D;
        }
        public void setSourceId(int sourceId){
            this.sourceId = sourceId;
        }
        public int getSourceId(){
            return this.sourceId;
        }
        public void setIsDubo(int isDubo){
            this.isDubo = isDubo;
        }
        public int getIsDubo(){
            return this.isDubo;
        }
        public void setIsCoopAllowed(int isCoopAllowed){
            this.isCoopAllowed = isCoopAllowed;
        }
        public int getIsCoopAllowed(){
            return this.isCoopAllowed;
        }
        public void setDownloadAllowed(int downloadAllowed){
            this.downloadAllowed = downloadAllowed;
        }
        public int getDownloadAllowed(){
            return this.downloadAllowed;
        }
        public void setSourceQipuId(int sourceQipuId){
            this.sourceQipuId = sourceQipuId;
        }
        public int getSourceQipuId(){
            return this.sourceQipuId;
        }
        public void setPlaycnt(int playcnt){
            this.playcnt = playcnt;
        }
        public int getPlaycnt(){
            return this.playcnt;
        }
        public void setTimeLength(int timeLength){
            this.timeLength = timeLength;
        }
        public int getTimeLength(){
            return this.timeLength;
        }
        public void setOwnerAlbumId(int ownerAlbumId){
            this.ownerAlbumId = ownerAlbumId;
        }
        public int getOwnerAlbumId(){
            return this.ownerAlbumId;
        }
        public void setAlbumName(String albumName){
            this.albumName = albumName;
        }
        public String getAlbumName(){
            return this.albumName;
        }
        public void setDesc(String desc){
            this.desc = desc;
        }
        public String getDesc(){
            return this.desc;
        }
        public void setStartDate(String startDate){
            this.startDate = startDate;
        }
        public String getStartDate(){
            return this.startDate;
        }
        public void setEndDate(String endDate){
            this.endDate = endDate;
        }
        public String getEndDate(){
            return this.endDate;
        }
        public void setFocus(String focus){
            this.focus = focus;
        }
        public String getFocus(){
            return this.focus;
        }
        public void setAlbumUrl(String albumUrl){
            this.albumUrl = albumUrl;
        }
        public String getAlbumUrl(){
            return this.albumUrl;
        }
        public void setHtml5Url(String html5Url){
            this.html5Url = html5Url;
        }
        public String getHtml5Url(){
            return this.html5Url;
        }
        public void setHtml5PlayUrl(String html5PlayUrl){
            this.html5PlayUrl = html5PlayUrl;
        }
        public String getHtml5PlayUrl(){
            return this.html5PlayUrl;
        }
        public void setHtml5PlayUrlForBaidu(String html5PlayUrlForBaidu){
            this.html5PlayUrlForBaidu = html5PlayUrlForBaidu;
        }
        public String getHtml5PlayUrlForBaidu(){
            return this.html5PlayUrlForBaidu;
        }
        public void setPicUrl(String picUrl){
            this.picUrl = picUrl;
        }
        public String getPicUrl(){
            return this.picUrl;
        }
        public void setPosterPicUrl(String posterPicUrl){
            this.posterPicUrl = posterPicUrl;
        }
        public String getPosterPicUrl(){
            return this.posterPicUrl;
        }
        public void setLeafctgs(String leafctgs){
            this.leafctgs = leafctgs;
        }
        public String getLeafctgs(){
            return this.leafctgs;
        }
        public void setProducer(String producer){
            this.producer = producer;
        }
        public String getProducer(){
            return this.producer;
        }
        public void setCredits(String credits){
            this.credits = credits;
        }
        public String getCredits(){
            return this.credits;
        }
        public void setSource(String source){
            this.source = source;
        }
        public String getSource(){
            return this.source;
        }
        public void setCompanyName(String companyName){
            this.companyName = companyName;
        }
        public String getCompanyName(){
            return this.companyName;
        }
        public void setKeyword(String keyword){
            this.keyword = keyword;
        }
        public String getKeyword(){
            return this.keyword;
        }
        public void setSubTitle(String subTitle){
            this.subTitle = subTitle;
        }
        public String getSubTitle(){
            return this.subTitle;
        }
        public void setScore(String score){
            this.score = score;
        }
        public String getScore(){
            return this.score;
        }
        public void setActor(String actor){
            this.actor = actor;
        }
        public String getActor(){
            return this.actor;
        }
        public void setDirector(String director){
            this.director = director;
        }
        public String getDirector(){
            return this.director;
        }
        public void setArea(String area){
            this.area = area;
        }
        public String getArea(){
            return this.area;
        }
        public void setAlbumType(String albumType){
            this.albumType = albumType;
        }
        public String getAlbumType(){
            return this.albumType;
        }
        public void setPlayUrl(String playUrl){
            this.playUrl = playUrl;
        }
        public String getPlayUrl(){
            return this.playUrl;
        }
        public void setCreatedTime(String createdTime){
            this.createdTime = createdTime;
        }
        public String getCreatedTime(){
            return this.createdTime;
        }
        public void setSysPlatform(String sysPlatform){
            this.sysPlatform = sysPlatform;
        }
        public String getSysPlatform(){
            return this.sysPlatform;
        }
        public void setAlias(String alias){
            this.alias = alias;
        }
        public String getAlias(){
            return this.alias;
        }
        public void setTvIds(List<Integer> tvIds){
            this.tvIds = tvIds;
        }
        public List<Integer> getTvIds(){
            return this.tvIds;
        }
        public void setTvQipuIds(List<Integer> tvQipuIds){
            this.tvQipuIds = tvQipuIds;
        }
        public List<Integer> getTvQipuIds(){
            return this.tvQipuIds;
        }
        public void setThreeCtgs(List<ThreeCtgs> threeCtgs){
            this.threeCtgs = threeCtgs;
        }
        public List<ThreeCtgs> getThreeCtgs(){
            return this.threeCtgs;
        }
        public void setCreditList(List<CreditList> creditList){
            this.creditList = creditList;
        }
        public List<CreditList> getCreditList(){
            return this.creditList;
        }
        public void setUpDown(UpDown upDown){
            this.upDown = upDown;
        }
        public UpDown getUpDown(){
            return this.upDown;
        }
        public void setSeason(int season){
            this.season = season;
        }
        public int getSeason(){
            return this.season;
        }
        public void setEdition(String edition){
            this.edition = edition;
        }
        public String getEdition(){
            return this.edition;
        }
        public void setSubsites(List<Subsites> subsites){
            this.subsites = subsites;
        }
        public List<Subsites> getSubsites(){
            return this.subsites;
        }
        public void setSwf(String swf){
            this.swf = swf;
        }
        public String getSwf(){
            return this.swf;
        }

    }

    //TODO
    public class Subsites {

        private int id;
        private String name;
        private int level;
        public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setLevel(int level) {
            this.level = level;
        }
        public int getLevel() {
            return level;
        }

    }


    //TODO
    public class CreditList {

        private String name;
        private String roleName;
        private int type;
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }
        public String getRoleName() {
            return roleName;
        }

        public void setType(int type) {
            this.type = type;
        }
        public int getType() {
            return type;
        }

    }

    //TODO
    public class ThreeCtgs {
        private String name;

        private int subType;

        private String subCtgName;

        private int id;

        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public void setSubType(int subType){
            this.subType = subType;
        }
        public int getSubType(){
            return this.subType;
        }
        public void setSubCtgName(String subCtgName){
            this.subCtgName = subCtgName;
        }
        public String getSubCtgName(){
            return this.subCtgName;
        }
        public void setId(int id){
            this.id = id;
        }
        public int getId(){
            return this.id;
        }

    }

    //TODO
    public class UpDown {
        private double score;

        private int voters;

        private int up;

        private int albumQipuId;

        private int down;

        public void setScore(double score){
            this.score = score;
        }
        public double getScore(){
            return this.score;
        }
        public void setVoters(int voters){
            this.voters = voters;
        }
        public int getVoters(){
            return this.voters;
        }
        public void setUp(int up){
            this.up = up;
        }
        public int getUp(){
            return this.up;
        }
        public void setAlbumQipuId(int albumQipuId){
            this.albumQipuId = albumQipuId;
        }
        public int getAlbumQipuId(){
            return this.albumQipuId;
        }
        public void setDown(int down){
            this.down = down;
        }
        public int getDown(){
            return this.down;
        }

    }

}