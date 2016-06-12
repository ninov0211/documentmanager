/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dinov
 */
@Entity
@Table(name = "ZUSER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zuser.findAll", query = "SELECT z FROM Zuser z"),
    @NamedQuery(name = "Zuser.findByZuserId", query = "SELECT z FROM Zuser z WHERE z.zuserId = :zuserId"),
    @NamedQuery(name = "Zuser.findByName", query = "SELECT z FROM Zuser z WHERE z.name = :name"),
    @NamedQuery(name = "Zuser.findByPassword", query = "SELECT z FROM Zuser z WHERE z.password = :password"),
    @NamedQuery(name = "Zuser.findByZprivilageId", query = "SELECT z FROM Zuser z WHERE z.zprivilageId = :zprivilageId"),
    @NamedQuery(name = "Zuser.findByZdeptId", query = "SELECT z FROM Zuser z WHERE z.zdeptId = :zdeptId"),
    @NamedQuery(name = "Zuser.findByEmail", query = "SELECT z FROM Zuser z WHERE z.email = :email"),
    @NamedQuery(name = "Zuser.findByLevel", query = "SELECT z FROM Zuser z WHERE z.level = :level"),
    @NamedQuery(name = "Zuser.findByActive", query = "SELECT z FROM Zuser z WHERE z.active = :active"),
    @NamedQuery(name = "Zuser.findByLevelsys", query = "SELECT z FROM Zuser z WHERE z.levelsys = :levelsys")})
public class Zuser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZUSER_ID", nullable = false)
    private Integer zuserId;
    @Size(max = 20)
    @Column(name = "NAME", length = 20)
    private String name;
    @Size(max = 20)
    @Column(name = "PASSWORD", length = 20)
    private String password;
    @Column(name = "ZPRIVILAGE_ID")
    private Integer zprivilageId;
    @Column(name = "ZDEPT_ID")
    private Integer zdeptId;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 30)
    @Column(name = "EMAIL", length = 30)
    private String email;
    @Column(name = "LEVEL")
    private Integer level;
    @Column(name = "ACTIVE")
    private Character active;
    @Column(name = "LEVELSYS")
    private Integer levelsys;
    @OneToMany(mappedBy = "zuserId")
    private Collection<Zdoc> zdocCollection;

    public Zuser() {
    }

    public Zuser(Integer zuserId) {
        this.zuserId = zuserId;
    }

    public Integer getZuserId() {
        return zuserId;
    }

    public void setZuserId(Integer zuserId) {
        this.zuserId = zuserId;
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

    public Integer getZprivilageId() {
        return zprivilageId;
    }

    public void setZprivilageId(Integer zprivilageId) {
        this.zprivilageId = zprivilageId;
    }

    public Integer getZdeptId() {
        return zdeptId;
    }

    public void setZdeptId(Integer zdeptId) {
        this.zdeptId = zdeptId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    public Integer getLevelsys() {
        return levelsys;
    }

    public void setLevelsys(Integer levelsys) {
        this.levelsys = levelsys;
    }

    @XmlTransient
    public Collection<Zdoc> getZdocCollection() {
        return zdocCollection;
    }

    public void setZdocCollection(Collection<Zdoc> zdocCollection) {
        this.zdocCollection = zdocCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zuserId != null ? zuserId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zuser)) {
            return false;
        }
        Zuser other = (Zuser) object;
        if ((this.zuserId == null && other.zuserId != null) || (this.zuserId != null && !this.zuserId.equals(other.zuserId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zuser[ zuserId=" + zuserId + " ]";
    }
    
}
