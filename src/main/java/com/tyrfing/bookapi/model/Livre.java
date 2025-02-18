package com.tyrfing.bookapi.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "livre")
public class Livre {
    // attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titre")
    private String title;
    @Column(name = "description")
    private String desc;
    @Column(name = "date_publication")
    private Date publicationDate;

    public Livre() {
    }

    public Livre(String title, String desc, Date publicationDate) {
        this.title = title;
        this.desc = desc;
        this.publicationDate = publicationDate;
    }

    public Livre(int id, String title, String desc, Date publicationDate) {
        this.title = title;
        this.desc = desc;
        this.publicationDate = publicationDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

}
