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
@Table(name = "ZPRIVILAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zprivilage.findAll", query = "SELECT z FROM Zprivilage z"),
    @NamedQuery(name = "Zprivilage.findByZprivilageId", query = "SELECT z FROM Zprivilage z WHERE z.zprivilageId = :zprivilageId"),
    @NamedQuery(name = "Zprivilage.findByName", query = "SELECT z FROM Zprivilage z WHERE z.name = :name"),
    @NamedQuery(name = "Zprivilage.findByZuserId", query = "SELECT z FROM Zprivilage z WHERE z.zuserId = :zuserId"),
    @NamedQuery(name = "Zprivilage.findByZdocId", query = "SELECT z FROM Zprivilage z WHERE z.zdocId = :zdocId"),
    @NamedQuery(name = "Zprivilage.findByViewdoc", query = "SELECT z FROM Zprivilage z WHERE z.viewdoc = :viewdoc"),
    @NamedQuery(name = "Zprivilage.findByCreatedoc", query = "SELECT z FROM Zprivilage z WHERE z.createdoc = :createdoc"),
    @NamedQuery(name = "Zprivilage.findByUpdatedoc", query = "SELECT z FROM Zprivilage z WHERE z.updatedoc = :updatedoc"),
    @NamedQuery(name = "Zprivilage.findByDeletedoc", query = "SELECT z FROM Zprivilage z WHERE z.deletedoc = :deletedoc"),
    @NamedQuery(name = "Zprivilage.findByPrint", query = "SELECT z FROM Zprivilage z WHERE z.print = :print")})
public class Zprivilage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZPRIVILAGE_ID", nullable = false)
    private Integer zprivilageId;
    @Size(max = 20)
    @Column(name = "NAME", length = 20)
    private String name;
    @Column(name = "ZUSER_ID")
    private Integer zuserId;
    @Column(name = "ZDOC_ID")
    private Integer zdocId;
    @Column(name = "VIEWDOC")
    private Character viewdoc;
    @Column(name = "CREATEDOC")
    private Character createdoc;
    @Column(name = "UPDATEDOC")
    private Character updatedoc;
    @Column(name = "DELETEDOC")
    private Character deletedoc;
    @Column(name = "PRINT")
    private Character print;

    public Zprivilage() {
    }

    public Zprivilage(Integer zprivilageId) {
        this.zprivilageId = zprivilageId;
    }

    public Integer getZprivilageId() {
        return zprivilageId;
    }

    public void setZprivilageId(Integer zprivilageId) {
        this.zprivilageId = zprivilageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getZuserId() {
        return zuserId;
    }

    public void setZuserId(Integer zuserId) {
        this.zuserId = zuserId;
    }

    public Integer getZdocId() {
        return zdocId;
    }

    public void setZdocId(Integer zdocId) {
        this.zdocId = zdocId;
    }

    public Character getViewdoc() {
        return viewdoc;
    }

    public void setViewdoc(Character viewdoc) {
        this.viewdoc = viewdoc;
    }

    public Character getCreatedoc() {
        return createdoc;
    }

    public void setCreatedoc(Character createdoc) {
        this.createdoc = createdoc;
    }

    public Character getUpdatedoc() {
        return updatedoc;
    }

    public void setUpdatedoc(Character updatedoc) {
        this.updatedoc = updatedoc;
    }

    public Character getDeletedoc() {
        return deletedoc;
    }

    public void setDeletedoc(Character deletedoc) {
        this.deletedoc = deletedoc;
    }

    public Character getPrint() {
        return print;
    }

    public void setPrint(Character print) {
        this.print = print;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zprivilageId != null ? zprivilageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zprivilage)) {
            return false;
        }
        Zprivilage other = (Zprivilage) object;
        if ((this.zprivilageId == null && other.zprivilageId != null) || (this.zprivilageId != null && !this.zprivilageId.equals(other.zprivilageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zprivilage[ zprivilageId=" + zprivilageId + " ]";
    }
    
}
