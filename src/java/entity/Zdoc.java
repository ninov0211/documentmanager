/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dinov
 */
@Entity
@Table(name = "ZDOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zdoc.findAll", query = "SELECT z FROM Zdoc z"),
    @NamedQuery(name = "Zdoc.findByZdocId", query = "SELECT z FROM Zdoc z WHERE z.zdocId = :zdocId"),
    @NamedQuery(name = "Zdoc.findByDescript", query = "SELECT z FROM Zdoc z WHERE z.descript = :descript"),
    @NamedQuery(name = "Zdoc.findByJudul", query = "SELECT z FROM Zdoc z WHERE z.judul = :judul"),
    @NamedQuery(name = "Zdoc.findByName", query = "SELECT z FROM Zdoc z WHERE z.name = :name"),
    @NamedQuery(name = "Zdoc.findByReff", query = "SELECT z FROM Zdoc z WHERE z.reff = :reff"),
    @NamedQuery(name = "Zdoc.findByTgl", query = "SELECT z FROM Zdoc z WHERE z.tgl = :tgl"),
    @NamedQuery(name = "Zdoc.findByTgldraft", query = "SELECT z FROM Zdoc z WHERE z.tgldraft = :tgldraft"),
    @NamedQuery(name = "Zdoc.findByNodraft", query = "SELECT z FROM Zdoc z WHERE z.nodraft = :nodraft"),
    @NamedQuery(name = "Zdoc.findByNomordocument", query = "SELECT z FROM Zdoc z WHERE z.nomordocument = :nomordocument"),
    @NamedQuery(name = "Zdoc.findByRevisi", query = "SELECT z FROM Zdoc z WHERE z.revisi = :revisi"),
    @NamedQuery(name = "Zdoc.findByRevisinumber", query = "SELECT z FROM Zdoc z WHERE z.revisinumber = :revisinumber"),
    @NamedQuery(name = "Zdoc.findByTglrencanaberlaku", query = "SELECT z FROM Zdoc z WHERE z.tglrencanaberlaku = :tglrencanaberlaku"),
    @NamedQuery(name = "Zdoc.findByNotadc", query = "SELECT z FROM Zdoc z WHERE z.notadc = :notadc"),
    @NamedQuery(name = "Zdoc.findByUrgent", query = "SELECT z FROM Zdoc z WHERE z.urgent = :urgent")})
public class Zdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOC_ID", nullable = false)
    private Integer zdocId;
    @Size(max = 40)
    @Column(name = "DESCRIPT", length = 40)
    private String descript;
    @Size(max = 20)
    @Column(name = "JUDUL", length = 20)
    private String judul;
    @Size(max = 20)
    @Column(name = "NAME", length = 20)
    private String name;
    @Size(max = 20)
    @Column(name = "REFF", length = 20)
    private String reff;
    @Column(name = "TGL")
    @Temporal(TemporalType.DATE)
    private Date tgl;
    @Column(name = "TGLDRAFT")
    @Temporal(TemporalType.DATE)
    private Date tgldraft;
    @Column(name = "NODRAFT")
    private Integer nodraft;
    @Size(max = 20)
    @Column(name = "NOMORDOCUMENT", length = 20)
    private String nomordocument;
    @Size(max = 20)
    @Column(name = "REVISI", length = 20)
    private String revisi;
    @Column(name = "REVISINUMBER")
    private Integer revisinumber;
    @Column(name = "TGLRENCANABERLAKU")
    @Temporal(TemporalType.DATE)
    private Date tglrencanaberlaku;
    @Size(max = 50)
    @Column(name = "NOTADC", length = 50)
    private String notadc;
    @Column(name = "URGENT")
    private Character urgent;
    @JoinColumn(name = "ZUSER_ID", referencedColumnName = "ZUSER_ID")
    @ManyToOne
    private Zuser zuserId;
    @JoinColumn(name = "ZSTATUSDOC_ID", referencedColumnName = "ZSTATUSDOC_ID")
    @ManyToOne
    private Zstatusdoc zstatusdocId;
    @JoinColumn(name = "ZSTATUS_ID", referencedColumnName = "ZSTATUS_ID")
    @ManyToOne
    private Zstatus zstatusId;
    @OneToMany(mappedBy = "zdocId")
    private Collection<ZdocLine> zdocLineCollection;

    public Zdoc() {
    }

    public Zdoc(Integer zdocId) {
        this.zdocId = zdocId;
    }

    public Integer getZdocId() {
        return zdocId;
    }

    public void setZdocId(Integer zdocId) {
        this.zdocId = zdocId;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReff() {
        return reff;
    }

    public void setReff(String reff) {
        this.reff = reff;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    public Date getTgldraft() {
        return tgldraft;
    }

    public void setTgldraft(Date tgldraft) {
        this.tgldraft = tgldraft;
    }

    public Integer getNodraft() {
        return nodraft;
    }

    public void setNodraft(Integer nodraft) {
        this.nodraft = nodraft;
    }

    public String getNomordocument() {
        return nomordocument;
    }

    public void setNomordocument(String nomordocument) {
        this.nomordocument = nomordocument;
    }

    public String getRevisi() {
        return revisi;
    }

    public void setRevisi(String revisi) {
        this.revisi = revisi;
    }

    public Integer getRevisinumber() {
        return revisinumber;
    }

    public void setRevisinumber(Integer revisinumber) {
        this.revisinumber = revisinumber;
    }

    public Date getTglrencanaberlaku() {
        return tglrencanaberlaku;
    }

    public void setTglrencanaberlaku(Date tglrencanaberlaku) {
        this.tglrencanaberlaku = tglrencanaberlaku;
    }

    public String getNotadc() {
        return notadc;
    }

    public void setNotadc(String notadc) {
        this.notadc = notadc;
    }

    public Character getUrgent() {
        return urgent;
    }

    public void setUrgent(Character urgent) {
        this.urgent = urgent;
    }

    public Zuser getZuserId() {
        return zuserId;
    }

    public void setZuserId(Zuser zuserId) {
        this.zuserId = zuserId;
    }

    public Zstatusdoc getZstatusdocId() {
        return zstatusdocId;
    }

    public void setZstatusdocId(Zstatusdoc zstatusdocId) {
        this.zstatusdocId = zstatusdocId;
    }

    public Zstatus getZstatusId() {
        return zstatusId;
    }

    public void setZstatusId(Zstatus zstatusId) {
        this.zstatusId = zstatusId;
    }

    @XmlTransient
    public Collection<ZdocLine> getZdocLineCollection() {
        return zdocLineCollection;
    }

    public void setZdocLineCollection(Collection<ZdocLine> zdocLineCollection) {
        this.zdocLineCollection = zdocLineCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdocId != null ? zdocId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zdoc)) {
            return false;
        }
        Zdoc other = (Zdoc) object;
        if ((this.zdocId == null && other.zdocId != null) || (this.zdocId != null && !this.zdocId.equals(other.zdocId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zdoc[ zdocId=" + zdocId + " ]";
    }
    
}
