/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence_ManagementSystems;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Arijit
 */
@Entity
@Table(name = "atten_reg", catalog = "stu_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "AttenReg.findAll", query = "SELECT a FROM AttenReg a")
    , @NamedQuery(name = "AttenReg.findBySlNo", query = "SELECT a FROM AttenReg a WHERE a.slNo = :slNo")
    , @NamedQuery(name = "AttenReg.findByDate", query = "SELECT a FROM AttenReg a WHERE a.date = :date")
    , @NamedQuery(name = "AttenReg.findByTime", query = "SELECT a FROM AttenReg a WHERE a.time = :time")
    , @NamedQuery(name = "AttenReg.findByR3197", query = "SELECT a FROM AttenReg a WHERE a.r3197 = :r3197")
    , @NamedQuery(name = "AttenReg.findByR3297", query = "SELECT a FROM AttenReg a WHERE a.r3297 = :r3297")
    , @NamedQuery(name = "AttenReg.findByR3397", query = "SELECT a FROM AttenReg a WHERE a.r3397 = :r3397")
    , @NamedQuery(name = "AttenReg.findByR3497", query = "SELECT a FROM AttenReg a WHERE a.r3497 = :r3497")
    , @NamedQuery(name = "AttenReg.findByR3597", query = "SELECT a FROM AttenReg a WHERE a.r3597 = :r3597")
    , @NamedQuery(name = "AttenReg.findByR3697", query = "SELECT a FROM AttenReg a WHERE a.r3697 = :r3697")
    , @NamedQuery(name = "AttenReg.findByR3797", query = "SELECT a FROM AttenReg a WHERE a.r3797 = :r3797")
    , @NamedQuery(name = "AttenReg.findByR3897", query = "SELECT a FROM AttenReg a WHERE a.r3897 = :r3897")
    , @NamedQuery(name = "AttenReg.findByR3997", query = "SELECT a FROM AttenReg a WHERE a.r3997 = :r3997")
    , @NamedQuery(name = "AttenReg.findByR4097", query = "SELECT a FROM AttenReg a WHERE a.r4097 = :r4097")
    , @NamedQuery(name = "AttenReg.findByR4197", query = "SELECT a FROM AttenReg a WHERE a.r4197 = :r4197")
    , @NamedQuery(name = "AttenReg.findByR4297", query = "SELECT a FROM AttenReg a WHERE a.r4297 = :r4297")
    , @NamedQuery(name = "AttenReg.findByR4397", query = "SELECT a FROM AttenReg a WHERE a.r4397 = :r4397")
    , @NamedQuery(name = "AttenReg.findByR4497", query = "SELECT a FROM AttenReg a WHERE a.r4497 = :r4497")
    , @NamedQuery(name = "AttenReg.findByR4597", query = "SELECT a FROM AttenReg a WHERE a.r4597 = :r4597")
    , @NamedQuery(name = "AttenReg.findByR4697", query = "SELECT a FROM AttenReg a WHERE a.r4697 = :r4697")
    , @NamedQuery(name = "AttenReg.findByR4797", query = "SELECT a FROM AttenReg a WHERE a.r4797 = :r4797")})
public class AttenReg implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sl_no")
    private Integer slNo;
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;
    @Column(name = "R_3197")
    private String r3197;
    @Column(name = "R_3297")
    private String r3297;
    @Column(name = "R_3397")
    private String r3397;
    @Column(name = "R_3497")
    private String r3497;
    @Column(name = "R_3597")
    private String r3597;
    @Column(name = "R_3697")
    private String r3697;
    @Column(name = "R_3797")
    private String r3797;
    @Column(name = "R_3897")
    private String r3897;
    @Column(name = "R_3997")
    private String r3997;
    @Column(name = "R_4097")
    private String r4097;
    @Column(name = "R_4197")
    private String r4197;
    @Column(name = "R_4297")
    private String r4297;
    @Column(name = "R_4397")
    private String r4397;
    @Column(name = "R_4497")
    private String r4497;
    @Column(name = "R_4597")
    private String r4597;
    @Column(name = "R_4697")
    private String r4697;
    @Column(name = "R_4797")
    private String r4797;

    public AttenReg() {
    }

    public AttenReg(Integer slNo) {
        this.slNo = slNo;
    }

    public Integer getSlNo() {
        return slNo;
    }

    public void setSlNo(Integer slNo) {
        Integer oldSlNo = this.slNo;
        this.slNo = slNo;
        changeSupport.firePropertyChange("slNo", oldSlNo, slNo);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    public String getR3197() {
        return r3197;
    }

    public void setR3197(String r3197) {
        String oldR3197 = this.r3197;
        this.r3197 = r3197;
        changeSupport.firePropertyChange("R3197", oldR3197, r3197);
    }

    public String getR3297() {
        return r3297;
    }

    public void setR3297(String r3297) {
        String oldR3297 = this.r3297;
        this.r3297 = r3297;
        changeSupport.firePropertyChange("R3297", oldR3297, r3297);
    }

    public String getR3397() {
        return r3397;
    }

    public void setR3397(String r3397) {
        String oldR3397 = this.r3397;
        this.r3397 = r3397;
        changeSupport.firePropertyChange("R3397", oldR3397, r3397);
    }

    public String getR3497() {
        return r3497;
    }

    public void setR3497(String r3497) {
        String oldR3497 = this.r3497;
        this.r3497 = r3497;
        changeSupport.firePropertyChange("R3497", oldR3497, r3497);
    }

    public String getR3597() {
        return r3597;
    }

    public void setR3597(String r3597) {
        String oldR3597 = this.r3597;
        this.r3597 = r3597;
        changeSupport.firePropertyChange("R3597", oldR3597, r3597);
    }

    public String getR3697() {
        return r3697;
    }

    public void setR3697(String r3697) {
        String oldR3697 = this.r3697;
        this.r3697 = r3697;
        changeSupport.firePropertyChange("R3697", oldR3697, r3697);
    }

    public String getR3797() {
        return r3797;
    }

    public void setR3797(String r3797) {
        String oldR3797 = this.r3797;
        this.r3797 = r3797;
        changeSupport.firePropertyChange("R3797", oldR3797, r3797);
    }

    public String getR3897() {
        return r3897;
    }

    public void setR3897(String r3897) {
        String oldR3897 = this.r3897;
        this.r3897 = r3897;
        changeSupport.firePropertyChange("R3897", oldR3897, r3897);
    }

    public String getR3997() {
        return r3997;
    }

    public void setR3997(String r3997) {
        String oldR3997 = this.r3997;
        this.r3997 = r3997;
        changeSupport.firePropertyChange("R3997", oldR3997, r3997);
    }

    public String getR4097() {
        return r4097;
    }

    public void setR4097(String r4097) {
        String oldR4097 = this.r4097;
        this.r4097 = r4097;
        changeSupport.firePropertyChange("R4097", oldR4097, r4097);
    }

    public String getR4197() {
        return r4197;
    }

    public void setR4197(String r4197) {
        String oldR4197 = this.r4197;
        this.r4197 = r4197;
        changeSupport.firePropertyChange("R4197", oldR4197, r4197);
    }

    public String getR4297() {
        return r4297;
    }

    public void setR4297(String r4297) {
        String oldR4297 = this.r4297;
        this.r4297 = r4297;
        changeSupport.firePropertyChange("R4297", oldR4297, r4297);
    }

    public String getR4397() {
        return r4397;
    }

    public void setR4397(String r4397) {
        String oldR4397 = this.r4397;
        this.r4397 = r4397;
        changeSupport.firePropertyChange("R4397", oldR4397, r4397);
    }

    public String getR4497() {
        return r4497;
    }

    public void setR4497(String r4497) {
        String oldR4497 = this.r4497;
        this.r4497 = r4497;
        changeSupport.firePropertyChange("R4497", oldR4497, r4497);
    }

    public String getR4597() {
        return r4597;
    }

    public void setR4597(String r4597) {
        String oldR4597 = this.r4597;
        this.r4597 = r4597;
        changeSupport.firePropertyChange("R4597", oldR4597, r4597);
    }

    public String getR4697() {
        return r4697;
    }

    public void setR4697(String r4697) {
        String oldR4697 = this.r4697;
        this.r4697 = r4697;
        changeSupport.firePropertyChange("R4697", oldR4697, r4697);
    }

    public String getR4797() {
        return r4797;
    }

    public void setR4797(String r4797) {
        String oldR4797 = this.r4797;
        this.r4797 = r4797;
        changeSupport.firePropertyChange("R4797", oldR4797, r4797);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (slNo != null ? slNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AttenReg)) {
            return false;
        }
        AttenReg other = (AttenReg) object;
        if ((this.slNo == null && other.slNo != null) || (this.slNo != null && !this.slNo.equals(other.slNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Attendence_ManagementSystems.AttenReg[ slNo=" + slNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
