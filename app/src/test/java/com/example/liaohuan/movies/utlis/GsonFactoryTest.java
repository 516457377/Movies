package com.example.liaohuan.movies.utlis;

import com.example.liaohuan.movies.bean.SearchBean;
import com.example.liaohuan.movies.bean.TestBean;
import com.example.liaohuan.movies.bean.TestBean2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GsonFactoryTest {
    String json = "[{\"n1\":\"k1\"},{\"n1\":\"k2\"},{\"n1\":\"k3\"}]";
    String json2 = "{\"n1\":\"k1\"}";
    String json3 = "{\"a1\":[1,2,2]}";
    String json4 = "{\"total\":2,\"code\":\"A00000\",\"data\":[{\"albumId\":976296700,\"qipuId\":976296700,\"ipLimit\":0,\"categoryId\":8,\"sets\":1,\"purchaseType\":0,\"isPurchase\":0,\"payMark\":0,\"copyrightId\":0,\"tvYear\":20180327,\"albumStatus\":1,\"contentType\":1,\"isSD\":0,\"is3D\":0,\"sourceId\":223785201,\"isDubo\":0,\"isCoopAllowed\":1,\"downloadAllowed\":1,\"sourceQipuId\":223785201,\"playcnt\":23559,\"timeLength\":291,\"ownerAlbumId\":-1,\"albumName\":\"大圣归来1\",\"desc\":\"帮助大圣的后代成为新一代大圣。\",\"startDate\":\"\",\"endDate\":\"\",\"focus\":\"领略一代大圣的风采\",\"albumUrl\":\"http://www.iqiyi.com/a_19rrgyoyot.html?vfm=newvfm\",\"html5Url\":\"http://m.iqiyi.com/a_19rrgyoyot.html?vfm=newvfm\",\"html5PlayUrl\":\"http://m.iqiyi.com/v_19rrc9uhlc.html?vfm=newvfm\",\"html5PlayUrlForBaidu\":\"\",\"picUrl\":\"http://pic3.qiyipic.com/image/20180327/7f/6a/v_115353136_m_601.jpg\",\"posterPicUrl\":\"http://pic3.qiyipic.com/image/20180327/7f/6a/v_115353136_m_601.jpg\",\"leafctgs\":\"手机游戏\",\"producer\":\"\",\"credits\":\" \",\"source\":\"大圣归来\",\"companyName\":\"\",\"keyword\":\"\",\"subTitle\":\"\",\"score\":\"6.0\",\"actor\":\"\",\"director\":\"\",\"area\":\"\",\"albumType\":\"手机游戏\",\"playUrl\":\"http://www.iqiyi.com/v_19rrc9uhlc.html?vfm=newvfm\",\"createdTime\":\"2018-03-27 15:52:38\",\"sysPlatform\":\"PAD_WEB_IQIYI,PC,PAD,PHONE,PHONE_WEB_IQIYI,TV,PC_APP\",\"alias\":\"\",\"tvIds\":[976296700],\"tvQipuIds\":[976296700],\"threeCtgs\":[{\"name\":\"手机游戏\",\"subType\":1,\"subCtgName\":\"类型\",\"id\":21278}],\"creditList\":[],\"upDown\":{\"score\":6.0,\"voters\":0,\"up\":0,\"albumQipuId\":976296700,\"down\":0},\"season\":0,\"edition\":\"\",\"subsites\":[],\"swf\":\"\"},{\"albumId\":750644700,\"qipuId\":750644700,\"ipLimit\":0,\"categoryId\":8,\"sets\":1,\"purchaseType\":0,\"isPurchase\":0,\"payMark\":0,\"copyrightId\":0,\"tvYear\":20170808,\"albumStatus\":1,\"contentType\":1,\"isSD\":0,\"is3D\":0,\"sourceId\":215307001,\"isDubo\":0,\"isCoopAllowed\":1,\"downloadAllowed\":1,\"sourceQipuId\":215307001,\"playcnt\":1077,\"timeLength\":362,\"ownerAlbumId\":-1,\"albumName\":\"西游记大圣归来1之山神大战游戏\",\"desc\":\"【小妞】西游记大圣归来系列游戏解说，带你与悟空一起经历九九八十一难，订阅小妞，我们一起出发吧~\\n\",\"startDate\":\"\",\"endDate\":\"\",\"focus\":\"与大圣一起打妖怪\",\"albumUrl\":\"http://www.iqiyi.com/a_19rrhdj91x.html?vfm=newvfm\",\"html5Url\":\"http://m.iqiyi.com/a_19rrhdj91x.html?vfm=newvfm\",\"html5PlayUrl\":\"http://m.iqiyi.com/v_19rr8jgwc0.html?vfm=newvfm\",\"html5PlayUrlForBaidu\":\"\",\"picUrl\":\"http://pic2.qiyipic.com/image/20170808/8e/38/v_113052472_m_601.jpg\",\"posterPicUrl\":\"http://pic2.qiyipic.com/image/20170808/8e/38/v_113052472_m_601.jpg\",\"leafctgs\":\"手机游戏 其他\",\"producer\":\"\",\"credits\":\" \",\"source\":\"【黑眼豆豆】西游记大圣归来游戏\",\"companyName\":\"\",\"keyword\":\"\",\"subTitle\":\"西游记大圣归来之山神大战游戏\",\"score\":\"6.8\",\"actor\":\"\",\"director\":\"\",\"area\":\"\",\"albumType\":\"手机游戏\",\"playUrl\":\"http://www.iqiyi.com/v_19rr8jgwc0.html?vfm=newvfm\",\"createdTime\":\"2017-08-08 07:33:33\",\"sysPlatform\":\"PHONE,PAD,PC,PC_APP,TV,PHONE_WEB_IQIYI,PAD_WEB_IQIYI\",\"alias\":\"\",\"tvIds\":[750644700],\"tvQipuIds\":[750644700],\"threeCtgs\":[{\"name\":\"手机游戏\",\"subType\":1,\"subCtgName\":\"类型\",\"id\":21278},{\"name\":\"其他\",\"subType\":2,\"subCtgName\":\"手机游戏\",\"id\":21312}],\"creditList\":[],\"upDown\":{\"score\":6.8,\"voters\":0,\"up\":0,\"albumQipuId\":750644700,\"down\":0},\"season\":0,\"edition\":\"\",\"subsites\":[],\"swf\":\"\"}],\"pageNo\":1,\"pagesize\":100,\"foundNum\":2}";
    List<TestBean> list;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getInstanceByJson() {
//      TestBean testBean = (TestBean) GsonFactory.getInstanceByJson(json2, TestBean.class);
        TestBean2 testBean2 = (TestBean2) GsonFactory.getInstanceByJson(json3,TestBean2.class);
        SearchBean searchBean = (SearchBean) GsonFactory.getInstanceByJson(json4,SearchBean.class);
        System.out.println("1\n"+ searchBean.getData().get(0).getTvIds().get(0));
    }

    @Test
    public void jsonToArrayList() {
        list = GsonFactory.jsonToArrayList(json,TestBean.class);

        System.out.println("n3:"+list.get(2).getN1());

        List<String> list = new ArrayList();
        list.add("1");
        System.out.println(list.size()+"_"+list.get(0).length());
    }

}