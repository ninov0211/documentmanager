/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dinov
 */
@Entity
@Table(name = "ZTDOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ztdoc.findAll", query = "SELECT z FROM Ztdoc z"),
    @NamedQuery(name = "Ztdoc.findByZtdocId", query = "SELECT z FROM Ztdoc z WHERE z.ztdocId = :ztdocId"),
    @NamedQuery(name = "Ztdoc.findByGroupid", query = "SELECT z FROM Ztdoc z WHERE z.groupid = :groupid"),
    @NamedQuery(name = "Ztdoc.findByTypeid", query = "SELECT z FROM Ztdoc z WHERE z.typeid = :typeid"),
    @NamedQuery(name = "Ztdoc.findByNamadocument", query = "SELECT z FROM Ztdoc z WHERE z.namadocument = :namadocument"),
    @NamedQuery(name = "Ztdoc.findByZdepId", query = "SELECT z FROM Ztdoc z WHERE z.zdepId = :zdepId")})
public class Ztdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZTDOC_ID", nullable = false)
    private Integer ztdocId;
    @Size(max = 10)
    @Column(name = "GROUPID", length = 10)
    private String groupid;
    @Size(max = 20)
    @Column(name = "TYPEID", length = 20)
    private String typeid;
    @Size(max = 40)
    @Column(name = "NAMADOCUMENT", length = 40)
    private String namadocument;
    @Column(name = "ZDEP_ID")
    private Integer zdepId;

    public Ztdoc() {
    }

    public Ztdoc(Integer ztdocId) {
        this.ztdocId = ztdocId;
    }

    public Integer getZtdocId() {
        return ztdocId;
    }

    public void setZtdocId(Integer ztdocId) {
        this.ztdocId = ztdocId;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getNamadocument() {
        return namadocument;
    }

    public void setNamadocument(String namadocument) {
        this.namadocument = namadocument;
    }

    public Integer getZdepId() {
        
        return zdepId;
    }

    public void setZdepId(Integer zdepId) {
        this.zdepId = zdepId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ztdocId != null ? ztdocId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ztdoc)) {
            return false;
        }
        Ztdoc other = (Ztdoc) object;
        if ((this.ztdocId == null && other.ztdocId != null) || (this.ztdocId != null && !this.ztdocId.equals(other.ztdocId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Ztdoc[ ztdocId=" + ztdocId + " ]";
    }
    
}
