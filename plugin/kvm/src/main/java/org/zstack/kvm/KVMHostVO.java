package org.zstack.kvm;

import org.zstack.header.host.HostEO;
import org.zstack.header.host.HostVO;
import org.zstack.header.vo.EO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@PrimaryKeyJoinColumn(name="uuid", referencedColumnName="uuid")
@EO(EOClazz = HostEO.class, needView = false)
public class KVMHostVO extends HostVO {
    @Column
    private String username;
    
    @Column
    private String password;

    @Column
    private int port;

    public KVMHostVO() {
    }
    
    public KVMHostVO(HostVO vo) {
        super(vo);
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}

