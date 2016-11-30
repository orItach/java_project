package project.java.contact_ptovider.entities;

/**
 * Created by אור איטח on 28/11/2016.
 */

public class User
{
    private long userNum;
    private String name;
    private String password;
    private Boolean authorization;//0 for nothing, 1 for admin

    public User(long userNum, String name, String password, Boolean authorization) {
        this.userNum = userNum;
        this.name = name;
        this.password = password;
        this.authorization = authorization;
    }

    //region get and set
    public long getUserNum() {
        return userNum;
    }

    public void setUserNum(long userNum) {
        this.userNum = userNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Boolean authorization) {
        this.authorization = authorization;
    }
    //endregion

}
