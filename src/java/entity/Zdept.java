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
@Table(name = "ZDEPT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zdept.findAll", query = "SELECT z FROM Zdept z"),
    @NamedQuery(name = "Zdept.findByZdepId", query = "SELECT z FROM Zdept z WHERE z.zdepId = :zdepId"),
    @NamedQuery(name = "Zdept.findByName", query = "SELECT z FROM Zdept z WHERE z.name = :name"),
    @NamedQuery(name = "Zdept.findByDescrip", query = "SELECT z FROM Zdept z WHERE z.descrip = :descrip")})
public class Zdept implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDEP_ID", nullable = false)
    private Integer zdepId;
    @Size(max = 20)
    @Column(name = "NAME", length = 20)
    private String name;
    @Size(max = 50)
    @Column(name = "DESCRIP", length = 50)
    private String descrip;

    public Zdept() {
    }

    public Zdept(Integer zdepId) {
        this.zdepId = zdepId;
    }

    public Integer getZdepId() {
        return zdepId;
    }

    public void setZdepId(Integer zdepId) {
        this.zdepId = zdepId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdepId != null ? zdepId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zdept)) {
            return false;
        }
        Zdept other = (Zdept) object;
        if ((this.zdepId == null && other.zdepId != null) || (this.zdepId != null && !this.zdepId.equals(other.zdepId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zdept[ zdepId=" + zdepId + " ]";
    }
    
}
