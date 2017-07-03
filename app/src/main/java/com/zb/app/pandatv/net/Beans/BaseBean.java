package com.zb.app.pandatv.net.Beans;

/**
 * Created by CIA on 2017/7/3.
 */

public class BaseBean {

    protected int errno;
    protected String errmsg;
    protected String authseq;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getAuthseq() {
        return authseq;
    }

    public void setAuthseq(String authseq) {
        this.authseq = authseq;
    }
}
