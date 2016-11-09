package com.hanc.test;

/**
 * Created by Administrator on 2016/11/9.
 */
public class EmailParaForm {
        //编号
        private String id;
        //发件人
        private String  tfrom;
        //收件人，以分号分隔
        private String tto;
        //主题
        private String ttitle;
        //内容
        private String tcontent;
        //发送邮件服务器
        private String stmpHost;
        //接受邮件服务器
        private String popHost;
        //协议
        private String protocol;
        //是否需要认证
        private String needAuth;
        //验证类名
        //private String authClassNm;
        private String isDebug;
        //抄送，以分号分隔
        private String tcc;
        //暗送，以分号分隔
        private String tbcc;
        //多附件以分号分隔
        private String fileAttachments;
        //用户名
        private String userName;
        //密码
        private String password;
        //代理服务器IP
        private String agentIp;
        //代理服务器端口号
        private String agentPort;
        //weblogin配置JavaMail：则需指定JNDI名检索
        private String jndiNm;
        //接收协议
        private String pprotocol;
        //发送邮件服务器端口
        private String tport;
        //接收邮件服务器端口
        private String pport;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTfrom() {
        return tfrom;
    }

    public void setTfrom(String tfrom) {
        this.tfrom = tfrom;
    }

    public String getTto() {
        return tto;
    }

    public void setTto(String tto) {
        this.tto = tto;
    }

    public String getTtitle() {
        return ttitle;
    }

    public void setTtitle(String ttitle) {
        this.ttitle = ttitle;
    }

    public String getTcontent() {
        return tcontent;
    }

    public void setTcontent(String tcontent) {
        this.tcontent = tcontent;
    }

    public String getStmpHost() {
        return stmpHost;
    }

    public void setStmpHost(String stmpHost) {
        this.stmpHost = stmpHost;
    }

    public String getPopHost() {
        return popHost;
    }

    public void setPopHost(String popHost) {
        this.popHost = popHost;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getNeedAuth() {
        return needAuth;
    }

    public void setNeedAuth(String needAuth) {
        this.needAuth = needAuth;
    }

    public String getIsDebug() {
        return isDebug;
    }

    public void setIsDebug(String isDebug) {
        this.isDebug = isDebug;
    }

    public String getTcc() {
        return tcc;
    }

    public void setTcc(String tcc) {
        this.tcc = tcc;
    }

    public String getTbcc() {
        return tbcc;
    }

    public void setTbcc(String tbcc) {
        this.tbcc = tbcc;
    }

    public String getFileAttachments() {
        return fileAttachments;
    }

    public void setFileAttachments(String fileAttachments) {
        this.fileAttachments = fileAttachments;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAgentIp() {
        return agentIp;
    }

    public void setAgentIp(String agentIp) {
        this.agentIp = agentIp;
    }

    public String getAgentPort() {
        return agentPort;
    }

    public void setAgentPort(String agentPort) {
        this.agentPort = agentPort;
    }

    public String getJndiNm() {
        return jndiNm;
    }

    public void setJndiNm(String jndiNm) {
        this.jndiNm = jndiNm;
    }

    public String getPprotocol() {
        return pprotocol;
    }

    public void setPprotocol(String pprotocol) {
        this.pprotocol = pprotocol;
    }

    public String getTport() {
        return tport;
    }

    public void setTport(String tport) {
        this.tport = tport;
    }

    public String getPport() {
        return pport;
    }

    public void setPport(String pport) {
        this.pport = pport;
    }
}
