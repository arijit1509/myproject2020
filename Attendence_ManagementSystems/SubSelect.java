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
@Table(name = "sub_select", catalog = "stu_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "SubSelect.findAll", query = "SELECT s FROM SubSelect s")
    , @NamedQuery(name = "SubSelect.findBySlNo", query = "SELECT s FROM SubSelect s WHERE s.slNo = :slNo")
    , @NamedQuery(name = "SubSelect.findByLectureDate", query = "SELECT s FROM SubSelect s WHERE s.lectureDate = :lectureDate")
    , @NamedQuery(name = "SubSelect.findByTime", query = "SELECT s FROM SubSelect s WHERE s.time = :time")
    , @NamedQuery(name = "SubSelect.findBySubject", query = "SELECT s FROM SubSelect s WHERE s.subject = :subject")})
public class SubSelect implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sl_no")
    private Integer slNo;
    @Column(name = "lecture_date")
    private String lectureDate;
    @Column(name = "time")
    private String time;
    @Column(name = "subject")
    private String subject;

    public SubSelect() {
    }

    public SubSelect(Integer slNo) {
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

    public String getLectureDate() {
        return lectureDate;
    }

    public void setLectureDate(String lectureDate) {
        String oldLectureDate = this.lectureDate;
        this.lectureDate = lectureDate;
        changeSupport.firePropertyChange("lectureDate", oldLectureDate, lectureDate);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        String oldSubject = this.subject;
        this.subject = subject;
        changeSupport.firePropertyChange("subject", oldSubject, subject);
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
        if (!(object instanceof SubSelect)) {
            return false;
        }
        SubSelect other = (SubSelect) object;
        if ((this.slNo == null && other.slNo != null) || (this.slNo != null && !this.slNo.equals(other.slNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Attendence_ManagementSystems.SubSelect[ slNo=" + slNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
