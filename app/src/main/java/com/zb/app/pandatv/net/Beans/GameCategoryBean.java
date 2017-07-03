package com.zb.app.pandatv.net.Beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by CIA on 2017/7/3.
 */

public class GameCategoryBean extends BaseBean implements Serializable {

    @SerializedName("cname")
    String name;
    @SerializedName("ename")
    String englishName;
    String img;
    String ext;
    String status;
    String extra;

    @SerializedName("child_data")
    ArrayList<GameCategoryBean> childs;

    @SerializedName("data")
    ArrayList<GameCategoryBean> cates;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public ArrayList<GameCategoryBean> getChilds() {
        return childs;
    }

    public void setChilds(ArrayList<GameCategoryBean> childs) {
        this.childs = childs;
    }

    public ArrayList<GameCategoryBean> getCates() {
        return cates;
    }

    public void setCates(ArrayList<GameCategoryBean> cates) {
        this.cates = cates;
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("");
        if(null != childs) {
            sb.append("[Child:====");
            for(GameCategoryBean bean : childs) {
                sb.append(bean.toString());
            }
            sb.append("======]");
        }
        if(null != cates) {
            sb.append("[cates:====");
            for(GameCategoryBean bean : cates) {
                sb.append(bean.toString());
            }
            sb.append("======]");
        }
        return "GameCategoryBean{" +
                "name='" + name + '\'' +
                ", englishName='" + englishName + '\'' +
                ", img='" + img + '\'' +
                ", ext='" + ext + '\'' +
                ", status='" + status + '\'' +
                ", extra='" + extra + '\'' +
                ", childs=" + childs +
                ", cates=" + cates + sb.toString() +
                '}';
    }
}
