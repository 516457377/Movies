package com.example.liaohuan.movies.bean;

import java.util.List;

public class ListTypeBean {

       private int total;
       private String code;
       private List<Data> data;
       private int pageNo;
       private int pagesize;
       private int foundNum;
       
       public void setTotal(int total) {
            this.total = total;
        }
        public int getTotal() {
            return total;
        }

       public void setCode(String code) {
            this.code = code;
        }
        public String getCode() {
            return code;
        }

       public void setData(List<Data> data) {
            this.data = data;
        }
        public List<Data> getData() {
            return data;
        }

       public void setPageNo(int pageNo) {
            this.pageNo = pageNo;
        }
        public int getPageNo() {
            return pageNo;
        }

       public void setPagesize(int pagesize) {
            this.pagesize = pagesize;
        }
        public int getPagesize() {
            return pagesize;
        }

       public void setFoundNum(int foundNum) {
            this.foundNum = foundNum;
        }
        public int getFoundNum() {
            return foundNum;
        }
        
       public class Data {

           private int categoryId;
           private String categoryName;
           private String shortName;
           
           public void setCategoryId(int categoryId) {
                this.categoryId = categoryId;
            }
            public int getCategoryId() {
                return categoryId;
            }

           public void setCategoryName(String categoryName) {
                this.categoryName = categoryName;
            }
            public String getCategoryName() {
                return categoryName;
            }

           public void setShortName(String shortName) {
                this.shortName = shortName;
            }
            public String getShortName() {
                return shortName;
            }

       }

}
