package tk.mybatis.simple.model;

public class SysUserRole {
    private Long userID;
    private Long roleID;

    public SysUserRole(Long userID, Long roleID) {
        this.userID = userID;
        this.roleID = roleID;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getRoleID() {
        return roleID;
    }

    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }

}
