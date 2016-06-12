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
@Table(name = "ZSTATUSDOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zstatusdoc.findAll", query = "SELECT z FROM Zstatusdoc z"),
    @NamedQuery(name = "Zstatusdoc.findByZstatusdocId", query = "SELECT z FROM Zstatusdoc z WHERE z.zstatusdocId = :zstatusdocId"),
    @NamedQuery(name = "Zstatusdoc.findByDescription", query = "SELECT z FROM Zstatusdoc z WHERE z.description = :description"),
    @NamedQuery(name = "Zstatusdoc.findByName", query = "SELECT z FROM Zstatusdoc z WHERE z.name = :name")})
public class Zstatusdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZSTATUSDOC_ID", nullable = false)
    private Integer zstatusdocId;
    @Size(max = 20)
    @Column(name = "DESCRIPTION", length = 20)
    private String description;
    @Size(max = 20)
    @Column(name = "NAME", length = 20)
    private String name;
    @OneToMany(mappedBy = "zstatusdocId")
    private Collection<Zdoc> zdocCollection;

    public Zstatusdoc() {
    }

    public Zstatusdoc(Integer zstatusdocId) {
        this.zstatusdocId = zstatusdocId;
    }

    public Integer getZstatusdocId() {
        return zstatusdocId;
    }

    public void setZstatusdocId(Integer zstatusdocId) {
        this.zstatusdocId = zstatusdocId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        hash += (zstatusdocId != null ? zstatusdocId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zstatusdoc)) {
            return false;
        }
        Zstatusdoc other = (Zstatusdoc) object;
        if ((this.zstatusdocId == null && other.zstatusdocId != null) || (this.zstatusdocId != null && !this.zstatusdocId.equals(other.zstatusdocId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zstatusdoc[ zstatusdocId=" + zstatusdocId + " ]";
    }
    
}
